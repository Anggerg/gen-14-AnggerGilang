package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Dosen;

public class DosenDao {
	private static String url = "jdbc:postgresql://localhost:5432/datakampus";
	private static String username = "postgres";
	private static String password = "1234";
	
	private static final String INSERT_DOSEN= "INSERT INTO dosen" + " (id,nama) VALUES " + " (?,?);";
	private static final String SELECT_DOSEN_BY_ID = "SELECT id,nama FROM dosen where id =?";
	private static final String SELECT_ALL_DOSEN = "SELECT * FROM dosen";
	private static final String DELETE_DOSEN = "DELETE FROM dosen WHERE id =?;";
	private static final String UPDATE_DOSEN = "UPDATE dosen SET nama =? WHERE id = ?;";
	
	public DosenDao() {
	}

	protected static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public void insertDosen(Dosen dosen) throws SQLException {
		System.out.println(INSERT_DOSEN);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DOSEN)) {
			preparedStatement.setString(1, dosen.getId());
			preparedStatement.setString(2, dosen.getNama());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}
	
	public Dosen SelectDosenById(String id) {
		Dosen dosen = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DOSEN_BY_ID);) {
			preparedStatement.setString(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String nama = rs.getString("nama");
				dosen = new Dosen(id, nama);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return dosen;
	}
	
	public List<Dosen> selectAllDosens() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Dosen> dosens = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_DOSEN);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String id = rs.getString("id");
				String nama = rs.getString("nama");
				dosens.add(new Dosen(id, nama));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return dosens;
	}

	public boolean deleteDosen(String id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_DOSEN);) {
			statement.setString(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}
	
	public boolean updateDosen(Dosen dosen) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_DOSEN);) {
			statement.setString(1, dosen.getNama());
			statement.setString(2, dosen.getId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}
	
	private void printSQLException(SQLException e) {
		// TODO Auto-generated method stub
		
	}
}

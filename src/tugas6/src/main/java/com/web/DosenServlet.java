package com.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.model.Dosen;
import com.dao.DosenDao;

@WebServlet("/")
public class DosenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DosenDao DosenDao;
	
	public void init() {
		DosenDao = new DosenDao();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
	
		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertDosen(request, response);
				break;
			case "/delete":
				deleteDosen(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateDosen(request, response);
				break;
			default:
				listDosen(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listDosen(HttpServletRequest request, HttpServletResponse response)
		throws SQLException, IOException, ServletException {
			List<Dosen> listDosen = DosenDao.selectAllDosens();
			request.setAttribute("listDosen", listDosen);
			RequestDispatcher dispatcher = request.getRequestDispatcher("dosen-list.jsp");
			dispatcher.forward(request, response);
	}

	private void updateDosen(HttpServletRequest request, HttpServletResponse response)
		throws SQLException, IOException {
			String id = request.getParameter("id");
			String nama = request.getParameter("nama");

			Dosen book = new Dosen(id, nama);
			DosenDao.updateDosen(book);
			response.sendRedirect("list");
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
		throws SQLException, ServletException, IOException {
			String id = request.getParameter("id");
			Dosen existingDosen = DosenDao.SelectDosenById(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("dosen-form.jsp");
			request.setAttribute("dosen", existingDosen);
			dispatcher.forward(request, response);
	}

	private void deleteDosen(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String id = request.getParameter("id");
		DosenDao.deleteDosen(id);
		response.sendRedirect("list");
	}
	
	private void insertDosen(HttpServletRequest request, HttpServletResponse response) 
		throws SQLException, IOException {
			String id = request.getParameter("id");
			String nama = request.getParameter("nama");
			Dosen newDosen = new Dosen(id,nama);
			DosenDao.insertDosen(newDosen);
			response.sendRedirect("list");
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
			RequestDispatcher dispatcher = request.getRequestDispatcher("dosen-form.jsp");
			dispatcher.forward(request, response);
	}
	
}

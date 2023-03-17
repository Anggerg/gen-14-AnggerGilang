package com.model;

public class Dosen {
	private String id;
	private String nama;
	
	public Dosen(String nama) {
		super();
		this.nama = nama;
	}
	public Dosen(String id, String nama) {
		super();
		this.id = id;
		this.nama = nama;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
}

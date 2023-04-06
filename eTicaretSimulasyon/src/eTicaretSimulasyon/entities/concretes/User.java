package eTicaretSimulasyon.entities.concretes;

import eTicaretSimulasyon.entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String name;
	private String surName;
	private String password;
	private String eMail;
	
	public User() {}

	public User(int id, String name, String surName, String password, String eMail) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.password = password;
		this.eMail = eMail;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	};
	
	
}

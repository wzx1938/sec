package com.company.pms.dao.pojo;

import java.io.Serializable;

public class User implements Serializable{
    
	private static final long serialVersionUID = 1L;
	private int eno;
    private String username;
    private String password;
    public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [eno=" + eno + ", username=" + username + ", password=" + password + "]";
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User(int eno, String username, String password) {
		super();
		this.eno = eno;
		this.username = username;
		this.password = password;
	}
}

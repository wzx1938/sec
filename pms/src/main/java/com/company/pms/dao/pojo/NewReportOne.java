package com.company.pms.dao.pojo;

import java.io.Serializable;

public class NewReportOne implements Serializable {
    
	private static final long serialVersionUID = 1L;
	private String ename;
     private String dname;
     private String jname;
     private String esex;
     private String hiredate;
     private String eedu;
     public NewReportOne() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NewReportOne [ename=" + ename + ", dname=" + dname + ", jname=" + jname + ", esex=" + esex
				+ ", hiredate=" + hiredate + ", eedu=" + eedu + "]";
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public String getEsex() {
		return esex;
	}
	public void setEsex(String esex) {
		this.esex = esex;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getEedu() {
		return eedu;
	}
	public void setEedu(String eedu) {
		this.eedu = eedu;
	}
	public NewReportOne(String ename, String dname, String jname, String esex, String hiredate, String eedu) {
		super();
		this.ename = ename;
		this.dname = dname;
		this.jname = jname;
		this.esex = esex;
		this.hiredate = hiredate;
		this.eedu = eedu;
	}
}

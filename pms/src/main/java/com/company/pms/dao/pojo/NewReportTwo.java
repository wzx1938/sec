package com.company.pms.dao.pojo;

import java.io.Serializable;

public class NewReportTwo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String dname;
	private String jname;
	private String ename;
	private String esex;
	private String eddate;
	private String eddtype;

	public NewReportTwo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ReportT [dname=" + dname + ", jname=" + jname + ", ename=" + ename + ", esex=" + esex + ", eddate="
				+ eddate + ", eddtype=" + eddtype + "]";
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

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsex() {
		return esex;
	}

	public void setEsex(String esex) {
		this.esex = esex;
	}

	public String getEddate() {
		return eddate;
	}

	public void setEddate(String eddate) {
		this.eddate = eddate;
	}

	public String getEddtype() {
		return eddtype;
	}

	public void setEddtype(String eddtype) {
		this.eddtype = eddtype;
	}

	public NewReportTwo(String dname, String jname, String ename, String esex, String eddate, String eddtype) {
		super();
		this.dname = dname;
		this.jname = jname;
		this.ename = ename;
		this.esex = esex;
		this.eddate = eddate;
		this.eddtype = eddtype;
	}

}

package com.company.pms.dao.pojo;

import java.io.Serializable;

public class Dept implements Serializable {
     
	private static final long serialVersionUID = 1L;
	private int dno;
     private String dname;
     private String dtype;
     private int dphone;
     private String dfounddate;
     private int superdno;
     public Dept() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dept [dno=" + dno + ", dname=" + dname + ", dtype=" + dtype + ", dphone=" + dphone + ", dfounddate="
				+ dfounddate + ", superdno=" + superdno + "]";
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDtype() {
		return dtype;
	}
	public void setDtype(String dtype) {
		this.dtype = dtype;
	}
	public int getDphone() {
		return dphone;
	}
	public void setDphone(int dphone) {
		this.dphone = dphone;
	}
	public String getDfounddate() {
		return dfounddate;
	}
	public void setDfounddate(String dfounddate) {
		this.dfounddate = dfounddate;
	}
	public int getSuperdno() {
		return superdno;
	}
	public void setSuperdno(int superdno) {
		this.superdno = superdno;
	}
	public Dept(String dname, String dtype, int dphone, String dfounddate, int superdno) {
		super();
		this.dname = dname;
		this.dtype = dtype;
		this.dphone = dphone;
		this.dfounddate = dfounddate;
		this.superdno = superdno;
	}
	public Dept(int dno, String dname, String dtype, int dphone, String dfounddate, int superdno) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.dtype = dtype;
		this.dphone = dphone;
		this.dfounddate = dfounddate;
		this.superdno = superdno;
	}
	
}

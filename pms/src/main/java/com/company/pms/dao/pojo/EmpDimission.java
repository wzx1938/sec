package com.company.pms.dao.pojo;

import java.io.Serializable;

public class EmpDimission implements Serializable {
   
	private static final long serialVersionUID = 1L;
private int eno;
   private String eddate;
   private String edtype;
   private String edtalent;
   public EmpDimission() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "EmpDimission [eno=" + eno + ", eddate=" + eddate + ", edtype=" + edtype + ", edtalent=" + edtalent + "]";
}
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEddate() {
	return eddate;
}
public void setEddate(String eddate) {
	this.eddate = eddate;
}
public String getEdtype() {
	return edtype;
}
public void setEdtype(String edtype) {
	this.edtype = edtype;
}
public String getEdtalent() {
	return edtalent;
}
public void setEdtalent(String edtalent) {
	this.edtalent = edtalent;
}
public EmpDimission(String eddate, String edtype, String edtalent) {
	super();
	this.eddate = eddate;
	this.edtype = edtype;
	this.edtalent = edtalent;
}
public EmpDimission(int eno, String eddate, String edtype, String edtalent) {
	super();
	this.eno = eno;
	this.eddate = eddate;
	this.edtype = edtype;
	this.edtalent = edtalent;
}
}

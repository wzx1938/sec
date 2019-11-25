package com.company.pms.dao.pojo;

import java.io.Serializable;

public class Job implements Serializable {
   
	private static final long serialVersionUID = 1L;
   private int jno;
   private String jname;
   private String jtype;
   public Job() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Job [jno=" + jno + ", jname=" + jname + ", jtype=" + jtype + "]";
}
public int getJno() {
	return jno;
}
public void setJno(int jno) {
	this.jno = jno;
}
public String getJname() {
	return jname;
}
public void setJname(String jname) {
	this.jname = jname;
}
public String getJtype() {
	return jtype;
}
public void setJtype(String jtype) {
	this.jtype = jtype;
}
public Job(String jname, String jtype) {
	super();
	this.jname = jname;
	this.jtype = jtype;
}
public Job(int jno, String jname, String jtype) {
	super();
	this.jno = jno;
	this.jname = jname;
	this.jtype = jtype;
}
}
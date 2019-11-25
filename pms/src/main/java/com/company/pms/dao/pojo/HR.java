package com.company.pms.dao.pojo;

public class HR {
private int eno;
private String ename;
private String edtype;
private String phone;
private Double sal;
private String job;
public HR() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "HR [eno=" + eno + ", ename=" + ename + ", edtype=" + edtype + ", phone=" + phone + ", sal=" + sal + ", job="
			+ job + "]";
}
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEdtype() {
	return edtype;
}
public void setEdtype(String edtype) {
	this.edtype = edtype;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public HR(int eno, String ename, String edtype, String phone, Double sal, String job) {
	super();
	this.eno = eno;
	this.ename = ename;
	this.edtype = edtype;
	this.phone = phone;
	this.sal = sal;
	this.job = job;
}

}




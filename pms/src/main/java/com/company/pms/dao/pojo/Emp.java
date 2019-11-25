package com.company.pms.dao.pojo;

import java.io.Serializable;

public class Emp implements Serializable {
   
   private static final long serialVersionUID = 1L;
   private int eno;
   private String ename;
   private String esex;
   private String ebirthday;
   private String eid;
   private String eedu;
   private int dno;
   private int jno;
   private String hiredate;
   private String jobstartday;
   private String estate;
   private String etype;
   private String efrom;
   private String url;
   public Emp() {
	// TODO Auto-generated constructor stub
   }
public Emp(int eno, String ename, String esex, String ebirthday, String eid, String eedu, int dno, int jno,
		String hiredate, String jobstartday, String estate, String etype, String efrom) {
	super();
	this.eno = eno;
	this.ename = ename;
	this.esex = esex;
	this.ebirthday = ebirthday;
	this.eid = eid;
	this.eedu = eedu;
	this.dno = dno;
	this.jno = jno;
	this.hiredate = hiredate;
	this.jobstartday = jobstartday;
	this.estate = estate;
	this.etype = etype;
	this.efrom = efrom;
}
public Emp(String ename, String esex, String ebirthday, String eid, String eedu, int dno, int jno, String hiredate,
		String jobstartday, String estate, String etype, String efrom) {
	super();
	this.ename = ename;
	this.esex = esex;
	this.ebirthday = ebirthday;
	this.eid = eid;
	this.eedu = eedu;
	this.dno = dno;
	this.jno = jno;
	this.hiredate = hiredate;
	this.jobstartday = jobstartday;
	this.estate = estate;
	this.etype = etype;
	this.efrom = efrom;
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
public String getEsex() {
	return esex;
}
public void setEsex(String esex) {
	this.esex = esex;
}
public String getEbirthday() {
	return ebirthday;
}
public void setEbirthday(String ebirthday) {
	this.ebirthday = ebirthday;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getEedu() {
	return eedu;
}
public void setEedu(String eedu) {
	this.eedu = eedu;
}
public int getDno() {
	return dno;
}
public void setDno(int dno) {
	this.dno = dno;
}
public int getJno() {
	return jno;
}
public void setJno(int jno) {
	this.jno = jno;
}
public String getHiredate() {
	return hiredate;
}
public void setHiredate(String hiredate) {
	this.hiredate = hiredate;
}
public String getJobstartday() {
	return jobstartday;
}
public void setJobstartday(String jobstartday) {
	this.jobstartday = jobstartday;
}
public String getEstate() {
	return estate;
}
public void setEstate(String estate) {
	this.estate = estate;
}
public String getEtype() {
	return etype;
}
public void setEtype(String etype) {
	this.etype = etype;
}
public String getEfrom() {
	return efrom;
}
public void setEfrom(String efrom) {
	this.efrom = efrom;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
@Override
public String toString() {
	return "Emp [eno=" + eno + ", ename=" + ename + ", esex=" + esex + ", ebirthday=" + ebirthday + ", eid=" + eid
			+ ", eedu=" + eedu + ", dno=" + dno + ", jno=" + jno + ", hiredate=" + hiredate + ", jobstartday="
			+ jobstartday + ", estate=" + estate + ", etype=" + etype + ", efrom=" + efrom + ", url=" + url + "]";
}
   
}
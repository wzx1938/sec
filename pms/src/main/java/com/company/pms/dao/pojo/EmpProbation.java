package com.company.pms.dao.pojo;

import java.io.Serializable;

public class EmpProbation implements Serializable {
   
	private static final long serialVersionUID = 1L;
   private int eno;
   private String epstartdate;
   private String ependdate;
   private String epstase;
   public EmpProbation() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "EmpProbation [eno=" + eno + ", epstartdate=" + epstartdate + ", ependdate=" + ependdate + ", epstase="
			+ epstase + "]";
}
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEpstartdate() {
	return epstartdate;
}
public void setEpstartdate(String epstartdate) {
	this.epstartdate = epstartdate;
}
public String getEpenddate() {
	return ependdate;
}
public void setEpenddate(String ependdate) {
	this.ependdate = ependdate;
}
public String getEpstase() {
	return epstase;
}
public void setEpstase(String epstase) {
	this.epstase = epstase;
}
public EmpProbation(String epstartdate, String ependdate, String epstase) {
	super();
	this.epstartdate = epstartdate;
	this.ependdate = ependdate;
	this.epstase = epstase;
}
public EmpProbation(int eno, String epstartdate, String ependdate, String epstase) {
	super();
	this.eno = eno;
	this.epstartdate = epstartdate;
	this.ependdate = ependdate;
	this.epstase = epstase;
}
}

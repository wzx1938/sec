package com.company.pms.dao.impl;

import java.util.List;

import com.company.pms.dao.idao.INewReportOneDao;
import com.company.pms.dao.pojo.NewReportOne;
import com.company.pms.dao.pojo.NewReportTwo;
import com.company.pms.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;


public class NewReportOneDaoImpl implements INewReportOneDao {

	@Override
	public List<NewReportOne> FindByDate(String BeginHiredate, String EndHiredate) throws Exception {
		QueryRunner qr = DBUtils.getQueryRunner();
		String sql = "select dname,jname,ename,esex,hiredate,eedu from t_dept,t_emp,t_job WHERE t_dept.dno=t_emp.dno and t_emp.jno=t_job.jno and hiredate>=? and hiredate<=?";
		List<NewReportOne> emps=qr.query(sql, new BeanListHandler<NewReportOne>(NewReportOne.class),BeginHiredate,EndHiredate);
		return emps;
	}

	@Override
	public List<NewReportTwo> FindbyDate(String Begindate, String Enddate) throws Exception {
		QueryRunner qr=DBUtils.getQueryRunner();
		String sql="SELECT dname, jname, ename, esex, hiredate, eedu FROM t_dept, t_emp, t_job WHERE t_dept.dno = t_emp.dno AND t_emp.jno = t_job.jno AND hiredate BETWEEN ? AND ? ";
		List<NewReportTwo> one=qr.query(sql, new BeanListHandler<NewReportTwo>(NewReportTwo.class),Begindate,Enddate);
		return  one;

	}

}

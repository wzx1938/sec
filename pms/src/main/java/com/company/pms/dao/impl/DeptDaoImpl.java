package com.company.pms.dao.impl;

import java.util.List;

import com.company.pms.dao.idao.IDeptDao;
import com.company.pms.dao.pojo.Dept;
import com.company.pms.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class DeptDaoImpl implements IDeptDao {

	@Override
	public void save(Dept t) throws Exception {
	  QueryRunner qr = DBUtils.getQueryRunner();
	  String sql = "insert into t_dept(dname,dtype,dphone,dfounddate,superdno)values(?,?,?,?,?)";
      qr.update(sql, t.getDname(),t.getDtype(),t.getDphone(),t.getDfounddate(),t.getSuperdno());
	}
	@Override
	public void update(Dept t) throws Exception {
		QueryRunner qr = DBUtils.getQueryRunner();
		String sql ="update t_dept set dname=?,dtype=?,dphone=?,dfounddate=?,superdno=? where dno=?";
	    qr.update(sql,t.getDname(),t.getDtype(),t.getDphone(),t.getDfounddate(),t.getSuperdno(),t.getDno());
	}


	@Override
	public void delete(Dept t) throws Exception {
		QueryRunner qr = DBUtils.getQueryRunner();
		String sql = "delete from t_dept where dno =?";
		qr.update(sql, t.getDno());
	}



	@Override
	public Dept findById(Integer id) throws Exception {
		QueryRunner qr = DBUtils.getQueryRunner();
		String sql ="select dname,dtype,dphone,dfounddate,superdno from t_dept where dno =?";
		Dept dept = qr.query(sql, new BeanHandler<Dept>(Dept.class),id);
		return dept;
	}

	@Override
	public List<Dept> FindByPage(int page, int size) throws Exception {
		QueryRunner qr = DBUtils.getQueryRunner();
		String sql = "select dno,dname,dtype,dphone,dfounddate,superdno from t_dept limit ?,?";
		List<Dept> dept = qr.query(sql, new BeanListHandler<Dept>(Dept.class),(page-1)*size,size);
		return dept;
	}

	@Override
	public List<Dept> FindAll() throws Exception {
		QueryRunner qr = DBUtils.getQueryRunner();
		String sql = "select dno,dname,dtype,dphone,dfounddate,superdno from t_dept";
		List<Dept> dept = qr.query(sql, new BeanListHandler<Dept>(Dept.class));
		return dept;
	}

}

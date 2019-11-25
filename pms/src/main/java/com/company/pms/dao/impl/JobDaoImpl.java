package com.company.pms.dao.impl;
import java.util.List;

import com.company.pms.dao.idao.IJobDao;
import com.company.pms.dao.pojo.Job;
import com.company.pms.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


public class JobDaoImpl implements IJobDao {

	@Override
	public void save(Job t) throws Exception {
		QueryRunner qr=DBUtils.getQueryRunner();
		String sql="insert into t_job (jname,jtype)values(?,?)";
		qr.update(sql,t.getJname(),t.getJtype());

		

	}

	@Override
	public void delete(Job t) throws Exception {
		QueryRunner qr= DBUtils.getQueryRunner();
		String sql=" delete from t_job where jno=?";
		qr.update(sql, t.getJno());

	}

	@Override
	public void update(Job t) throws Exception {
	QueryRunner qr=DBUtils.getQueryRunner();
	String sql= "update t_job set jname=?,jtype=? where jno=? ";
	qr.update(sql, t.getJname(),t.getJtype(),t.getJno());
	

	}



	@Override
	public Job findById(Integer id) throws Exception {
		QueryRunner qr=DBUtils.getQueryRunner();
		String sql="select jno,jname,jtype  from t_job   where jno=?";
		Job job=qr.query(sql, new BeanHandler<Job>(Job.class), id);
		return job;
	}

	@Override
	public List<Job> FindByName(String jname) throws Exception {
		QueryRunner qr=DBUtils.getQueryRunner();
		String sql="select jno,jname,jtype from t_job where jname like ?";
		List<Job> jobs=qr.query(sql, new  BeanListHandler<Job>(Job.class), "%"+jname+"%");
		return jobs;
	}

	@Override
	public List<Job> FindAll() throws Exception {
		QueryRunner qr=DBUtils.getQueryRunner();
		String sql="select jno,jname,jtype from t_job ";
		List<Job> jobs=qr.query(sql, new BeanListHandler<Job>(Job.class));
		return jobs;
	}	
}
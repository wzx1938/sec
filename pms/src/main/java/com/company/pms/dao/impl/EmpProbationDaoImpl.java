package com.company.pms.dao.impl;

import com.company.pms.dao.idao.IEmpProbationDao;
import com.company.pms.dao.pojo.EmpProbation;
import com.company.pms.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;


public class EmpProbationDaoImpl implements IEmpProbationDao {

	@Override
	public void save(EmpProbation t) throws Exception {
		QueryRunner qr = DBUtils.getQueryRunner();
		  String sql = "insert into t_emp_probation(eno,epstartdate,ependdate,epstase)values(?,?,?,?)";
	      qr.update(sql, t.getEno(),t.getEpstartdate(),t.getEpenddate(),t.getEpstase());
	}

	@Override
	public void update(EmpProbation t) throws Exception {
		QueryRunner qr = DBUtils.getQueryRunner();
		  String sql = "update t_emp_probation set epstartdate=?,ependdate=?,epstase=? where eno=?";
	      qr.update(sql, t.getEpstartdate(),t.getEpenddate(),t.getEpstase(),t.getEno());
	}

	@Override
	public void delete(EmpProbation t) throws Exception {
		QueryRunner qr = DBUtils.getQueryRunner();
		String sql = "delete from t_emp_probation where eno =?";
		qr.update(sql, t.getEno());
	}


	@Override
	public EmpProbation findById(Integer id) throws Exception {
		QueryRunner qr = DBUtils.getQueryRunner();
		String sql = "select epstartdate,ependdate,epstase from t_emp_probation where eno =?";
		EmpProbation ep = qr.query(sql, new BeanHandler<EmpProbation>(EmpProbation.class),id);
		return ep;
	}

}

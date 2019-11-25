package com.company.pms.dao.impl;
import com.company.pms.dao.idao.IEmpDimissionDao;
import com.company.pms.dao.pojo.EmpDimission;
import com.company.pms.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;


public class EmpDimissionDaoImpl implements IEmpDimissionDao {

	@Override
	public void save(EmpDimission t) throws Exception {
	QueryRunner qr = DBUtils.getQueryRunner();
    String sql = "insert into t_emp_dimission(eno,eddate,edtype,edtalent)values(?,?,?,?)";
	qr.update(sql, t.getEno(),t.getEddate(),t.getEdtype(),t.getEdtalent());
	}

	@Override
	public void update(EmpDimission t) throws Exception {
	QueryRunner qr = DBUtils.getQueryRunner();
	String sql = "update t_emp_dimission set eddate=?,edtype=?,edtalent=? where eno=?";
	qr.update(sql, t.getEddate(),t.getEdtype(),t.getEdtalent(),t.getEno());
	}

	@Override
	public void delete(EmpDimission t) throws Exception {
	QueryRunner qr = DBUtils.getQueryRunner();
	String sql ="delete from t_emp_dimission where eno=?";
    qr.update(sql, t.getEno());
	}



	@Override
	public EmpDimission findById(Integer id) throws Exception {
		QueryRunner qr = DBUtils.getQueryRunner();
		String sql = "select eddate,edtype,edtalent from t_emp_dimission where eno=?";
		EmpDimission ed= qr.query(sql, new BeanHandler<EmpDimission>(EmpDimission.class),id);
		return ed;
	}

}

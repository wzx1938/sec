package com.company.pms.dao.impl;

import com.company.pms.dao.idao.IUserDao;
import com.company.pms.dao.pojo.User;
import com.company.pms.dao.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;


public class UserDaoImpl implements IUserDao {
      


	@Override
	public void update(User t) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User t) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(User user) throws Exception {

	}

	@Override
	public User findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(String username, String password) throws Exception {
		QueryRunner qr = DBUtils.getQueryRunner();
		String sql="select eno,username from t_user where username=? and password=md5(?)";
		User user = qr.query(sql, new BeanHandler<User>(User.class) ,username,password);
		return user;
	}

}

package com.company.pms.dao.idao;


import com.company.pms.dao.pojo.User;

public interface IUserDao extends IBaseDao<User,Integer> {
	User login(String username, String password)throws Exception;
}

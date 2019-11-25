package com.company.sec.dao.idao;

import com.company.sec.commons.ResResult;
import com.company.sec.dao.pojo.User;


public interface IUserDao {
    ResResult<User> login(String username, String password) throws Exception;
}

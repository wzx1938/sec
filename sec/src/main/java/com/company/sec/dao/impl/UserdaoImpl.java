package com.company.sec.dao.impl;

import com.company.sec.commons.ResResult;
import com.company.sec.dao.idao.IUserDao;
import com.company.sec.dao.pojo.User;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserdaoImpl implements IUserDao {
    @Override
    public ResResult<User> login(String username, String password) throws Exception {
       if ("scott".equals(username)&&"tiger".equals(password)){
           User user=new User(1001,"scott",null,1);
           return new ResResult<User>(200,"login success",user);
       }else{
           return  new ResResult<User>(404,"login error",null);
       }






    }
}

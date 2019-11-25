package com.company.sec.service.iservice;

import com.company.sec.commons.ResResult;
import com.company.sec.dao.pojo.User;
;

public interface IUserService {
ResResult<User> login(String username, String password);


}

package com.company.pms.dao.idao;

import com.company.pms.dao.pojo.Dept;

import java.util.List;


public interface IDeptDao extends IBaseDao<Dept ,Integer>{
      List<Dept> FindByPage(int page, int size)throws Exception;
      List<Dept> FindAll() throws Exception;
}

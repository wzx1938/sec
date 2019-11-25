package com.company.pms.dao.idao;

import com.company.pms.dao.pojo.Emp;

import java.util.List;


public interface IEmpDao extends IBaseDao<Emp,Integer> {
  List<Emp> FindAll() throws Exception;
  List<Emp> FindByName(String name)throws Exception;
  List<Emp> findByPage(int page, int size)throws Exception;
  Emp showInFoEname(String ename)throws Exception;
}

package com.company.pms.dao.idao;

import com.company.pms.dao.pojo.Job;

import java.util.List;


public interface IJobDao extends IBaseDao<Job,Integer> {
    List<Job> FindByName(String jname) throws Exception;
    List<Job> FindAll() throws Exception;
}

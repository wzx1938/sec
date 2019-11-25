package com.company.pms.dao.impl;

import com.company.pms.dao.idao.IEmpDao;
import com.company.pms.dao.idao.IUserDao;
import com.company.pms.dao.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class EmpDaoImplTest {
@Autowired
    IEmpDao empDao;
    @Test
    public void findAll() {
        List<Emp> emp=.FindAll();
        System.out.println(emp);

    }
}
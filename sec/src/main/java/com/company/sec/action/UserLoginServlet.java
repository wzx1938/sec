package com.company.sec.action;

import com.alibaba.fastjson.JSON;
import com.company.sec.commons.ResResult;
import com.company.sec.commons.SpringIOC;
import com.company.sec.dao.pojo.User;
import com.company.sec.service.iservice.IUserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UserLoginServlet",urlPatterns = {"/UserLoginServlet"})
public class UserLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String username= request.getParameter("username");
String password=request.getParameter("password");
        IUserService userService= (IUserService) SpringIOC.getCtx().getBean( "userService");
        ResResult<User> result =userService.login(username,password);
        String jsonResult  = JSON.toJSONString(result);
        PrintWriter out=response.getWriter();
        out.println(jsonResult);
        out.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

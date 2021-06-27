package com.imooc.oa.controller;

import com.alibaba.fastjson.JSON;
import com.imooc.oa.entity.User;
import com.imooc.oa.service.UserService;
import com.imooc.oa.service.exception.BussinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "LoginServlet" ,urlPatterns = "/check_login")
public class LoginServlet extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(LoginServlet.class);
    private UserService userService = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //接收用户输入
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Map<String, Object> result = new HashMap<>();
        try {
            //调用业务逻辑
            User user = userService.checkLogin(username, password);
            HttpSession session = request.getSession();
            //向session存入登录用户信息,属性名:login_user
            session.setAttribute("login_user" , user);
            result.put("code", "0");
            result.put("message", "success");
            result.put("redirect_url", "/index");
        }catch (BussinessException ex){
            logger.error(ex.getMessage() , ex);
            result.put("code", ex.getCode());
            result.put("message", ex.getMessage());
        }catch (Exception ex){
            logger.error(ex.getMessage() , ex);
            result.put("code", ex.getClass().getSimpleName());
            result.put("message", ex.getMessage());
        }
        //返回对应结果
        String json = JSON.toJSONString(result);
        response.getWriter().println(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

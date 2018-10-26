package com.cangtai.web.servlet;

import com.cangtai.domain.User;
import com.cangtai.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Blockhead
 * 2018/10/16 23:32
 */
@WebServlet(name = "UserServlet", urlPatterns = "/showUser")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //在servlet中依赖于service，然后通过service完成功能，把结果保存到request中
        //然后转发到jsp显示
        UserService userService = new UserService();
        User user = userService.find();

        System.out.println(user);
        request.setAttribute("user", user);
        System.out.println("setAttribute-----");
        request.getRequestDispatcher("/user/show.jsp").forward(request, response);
        System.out.println("getRequestDispatcher-----forward-----");
    }
}

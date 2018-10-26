package httpSession;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author Blockhead
 * 2018/9/22 0:40
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println(request.getContextPath());

        /**
         * 校验验证码
         * 1.从session中获取正确的验证码
         * 2.从表单中获取用户填写的验证码
         * 3.比较
         * 4.如果相同，向下运行，否则保存错误信息到request域中，转发到login.jsp
         */
        String sessionCode = (String)request.getSession().getAttribute("session_vcode");
        String paramCode = request.getParameter("verifyCode");

        if (!sessionCode.equalsIgnoreCase(paramCode)){
            request.setAttribute("msg","验证码错误");
            request.getRequestDispatcher("/session/login.jsp").forward(request,response);
            return;
        }



        /*
         * 1.获取表单数据
         */
        //处理中文问题
        request.setCharacterEncoding("utf-8");
        //获取数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //System.out.println(username + password);

        /*
         * 2.校验用户名和密码
         */
        if ("blockhead".equals(username) || "admin".equals(username)){//登录成功
            /*
               把用户名保存到cookie中，发送给客户端浏览器
               当再次打开login.jsp的时候，会读取request中的cookie,把它显示在用户名登录框中
             */
            Cookie cookie = new Cookie("username",username);//创建Cookie
            cookie.setMaxAge(60*60*24);//设置Cookie的命长为一天
            response.addCookie(cookie);

            /*
             * 3.如果成功
             *      保存用户信息到session中
             *      重定向到succ1.jsp  原因：不希望servlet的访问路径显示在地址栏中，就重定向
             */
            HttpSession session = request.getSession();//获取session
            session.setAttribute("username",username);//在session域中保存用户名
            response.sendRedirect("/javaWeb/session/succ1.jsp");//重定向带项目名（转发不用带项目名）
        }else {//登录失败
            /*
             * 4.如果失败
             *       保存错误信息到request域中
             *       转发到login.jsp  原因：
             */
            request.setAttribute("msg","用户名或密码错误！");
            //得到转发器
            RequestDispatcher dispatcher = request.getRequestDispatcher("session/login.jsp");//转发不带项目名
            dispatcher.forward(request,response);//转发
        }

    }
}

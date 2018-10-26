package httpSession;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * @author Blockhead
 * 2018/9/25 23:50
 */
@WebServlet(name = "VerifyCodeServlet",urlPatterns = "/verify")
public class VerifyCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         * 1.生成图片
         * 2.保存图片上的文字到session中
         * 3.把图片响应给客户端
         */
        //这里使用的简单的验证码生成程序
        String[] code = new String[]{"xYz8","24gB","4FtK","sjC0"};
        int index = Math.abs(new Random().nextInt()%code.length);
        System.out.println(index);
        request.getSession().setAttribute("session_vcode",code[index]);
        postCode(code[index],response.getOutputStream());
    }


    private void postCode(String code, OutputStream os) throws IOException {
        //得到内容
        BufferedImage bi = new BufferedImage(70, 35, BufferedImage.TYPE_INT_RGB);
        //得到绘制环境
        Graphics graphics = bi.getGraphics();
        //设置环境（笔）颜色
        graphics.setColor(Color.WHITE);
        //填充矩形
        graphics.fillRect(0,0,70,35);
        //设置环境（笔）颜色
        graphics.setColor(Color.RED);
        graphics.drawString(code,10,10);
        ImageIO.write(bi,"JPEG",os);
    }
}

package httpSession.verfiyCode;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Blockhead
 * 2018/9/25 22:34
 */
public class imageVerify {
    @Test
    public void test(){
        /*
        * 1.创建图片缓冲区
        * 2.设置宽高
        * 3.得到这个图片的绘制环境（画笔）
        * 4.保存
        *
        * */
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
        graphics.drawString("hello",10,10);

        try {
            ImageIO.write(bi,"JPEG",new FileOutputStream("C:\\Users\\阿油\\Desktop/xx.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

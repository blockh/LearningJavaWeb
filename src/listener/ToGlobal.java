package listener;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Blockhead
 * 2018/10/23 20:05
 * 使项目国际化
 * 需要写两个配置文件，一个存放中文信息，一个存放英文信息
 * 使用一个类来通过语言环境来判断使用哪一个文件的信息：ResourceBundle
 * 什么是语言环境：Locale
 *  > zh_CN
 *  > en_US
 *  new Locale("zh","CN");
 *  locale.getDefault
 *  locale.US
 *
 *  资源文件名称的格式：基本名称 + Locale部分 + .properties
 *  例如：res_zh_CN.properties，其中基本名称是res，Locale部分是zh_CN
 *  必须所有的资源文件的基本命名一致
 */
public class ToGlobal {
    @Test
    public void fun1(){
        Locale locale = Locale.US;
        //得到ResourceBundle
        //第一个参数是：基本名称
        //第二个参数是：Locale
        ResourceBundle rb = ResourceBundle.getBundle("res",locale);
        //使用ResourceBundle来获取资源信息
        System.out.println(rb.getString("username"));
        System.out.println(rb.getString("password"));
        System.out.println(rb.getString("login"));
    }
}

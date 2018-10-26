package domain;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import utils.CommonUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Blockhead
 * 2018/10/3 23:10
 */
public class Demo1 {
    @Test
    public void testBeanUtils() throws Exception {
        String className = "domain.Person";
        Class clazz = Class.forName(className);
        Object bean = clazz.newInstance();


        BeanUtils.setProperty(bean,"name","张三");
        BeanUtils.setProperty(bean,"age","23");
        BeanUtils.setProperty(bean,"gender","男");
        System.out.println(bean);
    }

    /**
     * 把map中的数据封装到一个bean中
     */
    @Test
    public void test2(){
        //使用map装入属性数据
        Map<String,String> userProperty = new HashMap<>();
        userProperty.put("username","zhangSan");
        userProperty.put("password","123456");

        User user = new User();

        try {
            BeanUtils.populate(user,userProperty);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(user);
    }

    @Test
    public void test3(){
        //使用封装好的方法来，装入map数据
        //在之后获取到客户端的表单请求的时候，使用request.getParameterMap();获取表单Map，直接填入
        Map<String,String> userProperty = new HashMap<>();
        userProperty.put("username","zhangSan");
        userProperty.put("password","123456");
        User user = CommonUtils.toBean(userProperty, User.class);
        System.out.println(user);
    }
}

package utils;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.util.Map;
import java.util.UUID;

/**
 * @author Blockhead
 * 2018/9/22 20:41
 */
public class CommonUtils {
    @Test
    public void testUuid(){
        System.out.println(uuid());
    }

    /**
     * 获取32位的UUID
     * @return UUID
     */
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","").toUpperCase();
    }


    /**
     * 把map转化为指定的javabean对象
     * @param map 属性map数据
     * @param clazz javaBean类型
     * @param <T> 泛型
     * @return 转化成需要类的实例
     */
    public static <T>T toBean(Map map,Class<T> clazz){
        try {
            /*1.创建指定类型的javabean对象*/
            T bean = clazz.newInstance();
            /*2.把数据封装到javaBean中*/
            BeanUtils.populate(bean,map);
            return bean;
        } catch (Exception e) {
            //写成这样是为了让调用者不必在处理异常使用try catch
            throw new RuntimeException();
        }
    }
}

package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * @author Blockhead
 * 2018/10/22 20:14
 */
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener{
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("您向请求中添加了一个名为：" + srae.getName() + "，值为：" + srae.getValue() + "属性！");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("您向请求中删除了一个名为：" + srae.getName() + "，值为：" + srae.getValue() + "属性！");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("您向请求中替换了一个名为：" + srae.getName() + "，值为：" + srae.getValue() + "属性！" + "，新值为：" + srae.getServletRequest().getAttribute(srae.getName()));
    }
}

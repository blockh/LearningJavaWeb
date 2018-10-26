package listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author Blockhead
 * 2018/10/22 20:15
 */
public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener{
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("您向session中添加了一个名为：" + se.getName() + "，值为：" + se.getValue() + "属性！");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("您向session中移除了一个名为：" + se.getName() + "，值为：" + se.getValue() + "属性！");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("您向session中替换了一个名为：" + se.getName() + "，值为：" + se.getValue() + "属性！" + "新的值为：" + se.getSession().getAttribute(se.getName()));
    }
}

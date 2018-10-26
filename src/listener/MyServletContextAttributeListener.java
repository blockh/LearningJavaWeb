package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * @author Blockhead
 * 2018/10/22 20:14
 */
public class MyServletContextAttributeListener implements ServletContextAttributeListener{
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("您向Application中添加了一个名为：" + scae.getName() + "，值为：" + scae.getValue() + "属性！");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("您向Application中移除了一个名为：" + scae.getName() + "，值为：" + scae.getValue() + "属性！");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("您向Application中替换了一个名为：" + scae.getName() + "，值为：" + scae.getValue() + "属性！" + "，新值为：" + scae.getServletContext().getAttribute(scae.getName()));
    }
}

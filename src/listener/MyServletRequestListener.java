package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author Blockhead
 * 2018/10/22 20:02
 */
public class MyServletRequestListener implements ServletRequestListener{
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("有请求创建啦！属性有：" + sre.getServletRequest().getAttributeNames().toString());
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("有请求死亡啦！属性有：" + sre.getServletRequest().getAttributeNames().toString());
    }
}

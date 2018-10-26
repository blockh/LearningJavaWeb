package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Blockhead
 * 2018/10/22 19:59
 */
public class MyHttpSessionListener implements HttpSessionListener{
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("有session创建啦！为：" + se.getSession().getAttributeNames().toString());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("有session死亡啦！为：" + se.getSession().getAttributeNames().toString());
    }
}

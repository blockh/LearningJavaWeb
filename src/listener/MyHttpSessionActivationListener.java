package listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/**
 * @author Blockhead
 * 2018/10/23 19:43
 * 这里必须要重写序列化接口
 */
public class MyHttpSessionActivationListener implements HttpSessionActivationListener ,Serializable{
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        //这个方法在session钝化的时候会被调用
        System.out.println("我陪session一起去火星啦");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        //这个方法会在session活化的时候被调用
        System.out.println("我陪session一起重返地球啦");
    }
}

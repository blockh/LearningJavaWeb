package listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @author Blockhead
 * 2018/10/22 21:23
 */
public class User implements HttpSessionBindingListener{
    private String username;
    private String password;

    public String getUsesname() {
        return username;
    }

    public void setUsesname(String usesname) {
        this.username = usesname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "usesname='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("啊。。session添加了我！");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("我擦。。session抛弃了我！！！");
    }
}

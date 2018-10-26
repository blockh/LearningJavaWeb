package jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * @author Blockhead
 * 2018/10/15 23:58
 */
public class MyTag5 extends SimpleTagSupport {
    private boolean test;

    /**
     * 这个方法会由Tomcat来调用，并且会在doTag()之前
     */
    public void setTest(boolean test) {
        this.test = test;
    }

    @Override
    public void doTag() throws JspException, IOException {
        if (test) {
            /*
           执行标签体
            */
            this.getJspBody().invoke(null);//如果传递的输出流为null，表示使用的就是当前页面的out
        }
    }
}

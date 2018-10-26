package jsp.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import java.io.IOException;

/**
 * @author Blockhead
 * 2018/10/15 21:55
 */
public class MyTag1 implements SimpleTag {
    private PageContext pageContext;
    private JspFragment body;

    /**
     * 所有的setXxx()方法都会在doTag()方法之前被tomcat调用
     * 所以在doTag()中就可以使用Tomcat传过来的对象了；
     *
     *
     */
    @Override
    public void doTag() throws JspException, IOException {
        pageContext.getOut().print("hello Tag！");//out标签可以用来输出，可以使用getOut()，来获取
    }

    @Override
    public void setParent(JspTag jspTag) {

    }

    @Override
    public JspTag getParent() {
        return null;
    }

    @Override
    public void setJspContext(JspContext jspContext) {
        pageContext = (PageContext)jspContext;
    }

    @Override
    public void setJspBody(JspFragment jspFragment) {
        body = jspFragment;
    }
}

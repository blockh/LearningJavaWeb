package jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * @author Blockhead
 * 2018/10/15 22:33
 */
public class MyTag2 extends SimpleTagSupport{
    /**
     *SimpleTagSupport它实现了SimpleTag接口，
     * 已经把所有的Tomcat传递的数据都保存起来了，而且还提供了get方法来供子类使用
     */
    @Override
    public void doTag() throws JspException, IOException {
        this.getJspContext().getOut().print("Hello Tag Once Again!");
    }
}

package jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.Writer;

/**
 * @author Blockhead
 * 2018/10/15 23:28
 */
public class MyTag3 extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        Writer out = this.getJspContext().getOut();//获取当前jsp页面上的输出流
        out.write("*******************<br/>");
        this.getJspBody().invoke(out);//执行标签体内容，把结果写到指定的流中，即页面上
        out.write("<br/>*******************");
    }
}

package jsp.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * @author Blockhead
 * 2018/10/15 23:51
 */
public class MyTag4 extends SimpleTagSupport {
    /**
     *使用SkipPageException()跳过页面后面的内容，就好像使用forward转发的时候也会直接跳过后面的内容
     */
    @Override
    public void doTag() throws JspException, IOException {
        this.getJspContext().getOut().print("这个标签使用是为了跳过后面的内容!后面有一句话你看不到！");
        throw new SkipPageException();
    }
}

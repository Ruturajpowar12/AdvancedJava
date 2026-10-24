package com;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class SumHandler extends TagSupport {
    private int num1;
    private int num2;

    public void setNum1(int num1) { this.num1 = num1; }
    public void setNum2(int num2) { this.num2 = num2; }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            int sum = num1 + num2;
            out.print("<b>Sum of " + num1 + " + " + num2 + " = " + sum + "</b>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
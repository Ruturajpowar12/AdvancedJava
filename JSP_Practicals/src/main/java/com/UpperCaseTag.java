package com;

import java.io.IOException;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class UpperCaseTag extends SimpleTagSupport {

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void doTag() throws JspException, IOException {
        if (value != null) {
            getJspContext().getOut().print(
                value.toUpperCase(java.util.Locale.ROOT)
            );
        }
    }
}

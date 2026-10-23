package com;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class PowOfNum extends BodyTagSupport {
	private int num ,pow;
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setPow(int pow) {
		this.pow = pow;
	}
	public int doStartTag() throws JspException {
		
		 JspWriter out = pageContext.getOut();
		 
		 int res = 1;
		 
		 for(int i = 1; i<=pow;i++) {
			 res *= num;
		 }
		 
		 try {
			 out.println(num+" ^ " +pow +" = "+res);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 return SKIP_BODY;
	}
	

}

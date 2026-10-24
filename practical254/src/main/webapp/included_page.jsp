
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<p style="color: blue;">
    <b>[Included Page]</b>Retrieved from pageContext:<b>
    <%= pageContext.getAttribute("msg", PageContext.REQUEST_SCOPE) %></b>
</p>

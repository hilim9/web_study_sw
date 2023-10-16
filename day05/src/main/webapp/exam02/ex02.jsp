<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page errorPage="error.jsp" %>
<%
    int num1 = 10;
    int num2 = 0;
    int result = num1 / num2;
    out.write(result);
%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    pageContext.setAttribute("num1", 100);
    request.setAttribute("num1", 200);
    application.setAttribute("num1", 300);
%>
num1: ${num1}<br>
pageScope : ${pageScope.num1}<br>
requestScope : ${requestScope.num1}<br>
applicationScope : ${applicationScope['num1']}<br>

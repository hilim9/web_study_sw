<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page isErrorPage="true" %>
<h1>에러발생</h1>
<h2><%=exception.getMessage()%></h2>
<h2>${exception.message}</h2>
<%
    exception.printStackTrace();
%>
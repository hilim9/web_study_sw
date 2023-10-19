<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags" %>
<%
    List<String> fruits = Arrays.asList("Apple","Orange", "Melon", "Mango");
    pageContext.setAttribute("fruits", fruits);
%>
<util:forEach2 var="fruit" items="${fruits}">
    <h1>${fruit}</h1>
</util:forEach2>
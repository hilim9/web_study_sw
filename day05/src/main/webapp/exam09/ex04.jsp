<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags" %>
<util:max num1="100" num2="200" />
${maximum}
<br>
<util:min var="min" num1="100" num2="200" />
${min}

<%
    List<String> fruits = Arrays.asList("Apple", "Orange", "Melon");
    pageContext.setAttribute("fruits", fruits);
%>

<util:forEach var="fruit" items="${fruits}" >
    <h1>${fruit}</h1>
</util:forEach>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:catch var="e">
<%
    String str = null;
    str.toUpperCase();

%>
</c:catch>
<c:if test="${e != null}">
    <h1>${e.message}</h1>
</c:if>
<h1>출력</h1>
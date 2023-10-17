<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="num1" value="100" scope="application"/>
<c:set var="num2" value="200" />
${num1 + num2}<br>
pageScope.num1 : ${pageScope.num1}<br>
requestScope.num1 : ${requestScope.num1}<br>
sessionScope.num1 : ${sessionScope.num1}<br>
applicationScope.num1 : ${applicationScope.num1}<br>
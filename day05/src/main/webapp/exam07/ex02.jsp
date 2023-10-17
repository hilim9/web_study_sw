<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="num" value="100" scope="page" />
<c:set var="num" value="200" scope="request" />
<c:set var="num" value="300" scope="application" />
<c:remove var="num" scope="request"/>
pageScope : ${pageScope.num}<br>
requestScope : ${requestScope.num}<br>
applicationScope : ${applicationScope.num}<br>

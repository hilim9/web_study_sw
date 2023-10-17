<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:forEach var="num" begin="1" end="10" step="2">
    <h1>${num}회 반복</h1>
</c:forEach>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:forEach var="num" begin="1" end="10">
    <h1>반복 ${num}</h1>
</c:forEach>
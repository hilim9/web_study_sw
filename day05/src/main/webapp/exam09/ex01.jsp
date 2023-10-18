<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags" %>
<c:set var="num" value="10" />
<util:line />

<util:box>
    <h1>내용!</h1>
    <h2>${num}</h2>
    <c:forEach var="i" begin="1" end="5">
        ${i}
    </c:forEach>
</util:box >

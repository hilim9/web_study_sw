<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<c:set var="str1" value="사과_배_오렌지_키위_포도_감_파인애플_체리_귤" />
<c:set var="str2" value="<h1>안녕하세요</h1>" />
<c:set var="fruits" value="${fn:split(str1, '_')}" />

${fn:escapeXml(str2)}

<c:forEach var="fruit" items="${fn:split(str1, '_')}">
    <h1>${fruit}</h1>
</c:forEach>
<h1>${fn:join(fruits, '#')}</h1>


<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="num" value="1000000000.123" />
0 패턴 : <fmt:formatNumber value="${num}" pattern="0,000.00000" /><br>
# 패턴 : <fmt:formatNumber value="${num}" pattern="#,###.#####" /><br>
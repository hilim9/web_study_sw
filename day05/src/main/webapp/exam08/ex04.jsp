<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<fmt:formatNumber value="1000000000" groupingUsed="false" /><br>
percent : <fmt:formatNumber value="0.25" type="percent" /><br>
currency : <fmt:formatNumber value="10000" type="currency" /><br>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<jsp:useBean id="date" class="java.util.Date" />
full : <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>
long : <fmt:formatDate value="${date}" type="both" dateStyle="long" timeStyle="long" /><br>
medium : <fmt:formatDate value="${date}" type="both" dateStyle="medium" timeStyle="medium" /><br>
short : <fmt:formatDate value="${date}" type="both" dateStyle="short" timeStyle="short" /><br>

pattern : <fmt:formatDate value="${date}" type="both" pattern="yyyy/MM/dd HH:mm:ss (E)" /><br>
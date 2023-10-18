<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<jsp:useBean id="date" class="java.util.Date" />
<h1>Asia/Seoul</h1>
<fmt:setTimeZone value="Asia/Seoul" />
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />

<h1>America/New_York</h1>
<fmt:setTimeZone value="America/New_York" />
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />

<h1>Asia/Jakarta</h1>
<fmt:setTimeZone value="Asia/Jakarta" />
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />

<h1>Asia/Hong_Kong</h1>
<fmt:setTimeZone value="Asia/Hong_Kong" />
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" />
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="str" value="<script>alert('확인');</script>" />
<c:out value="${str}" escapeXml="false" />

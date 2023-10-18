<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<jsp:useBean id="date" class="java.util.Date" />

<h1>한국(ko_kr)</h1>
<fmt:setLocale value="ko_kr" />
금액 : <fmt:formatNumber value="10000" type="currency" /><br>
일시 : <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>

<h1>미국(en_us)</h1>
<fmt:setLocale value="en_us" />
금액 : <fmt:formatNumber value="10000" type="currency" /><br>
일시 : <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>

<h1>일본(ja_jp)</h1>
<fmt:setLocale value="ja_jp" />
금액 : <fmt:formatNumber value="10000" type="currency" /><br>
일시 : <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>
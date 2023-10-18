<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<fmt:setLocale value="ko" />
<fmt:setBundle basename="messages.commons" />
<c:url var="action" value="member/login" />
<fmt:message var="login" key="LOGIN" />

<%--
<fmt:bundle basename="messages.commons">
    <fmt:message key="USER_ID" />
</fmt:bundle>
--%>

<fmt:message key="LOGIN_MSG">
    <fmt:param>사용자01</fmt:param>
    <fmt:param>user01</fmt:param>
</fmt:message>
<form method="post" action="${action}">
    <dl>
        <dt>
            <fmt:message key="USER_ID" />
        </dt>
        <dd>
            <input type="text" name="userId">
        </dd>
    </dl>
    <dl>
        <dt>
            <fmt:message key="USER_PW" />
        </dt>
        <dd>
            <input type="password" name="userPw">
        </dd>
    </dl>
    <button type="submit">${login}</button>
</form>
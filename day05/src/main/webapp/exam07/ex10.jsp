<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.net.URLEncoder" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<h1>ex10.jsp - 상단</h1>

<c:import url="ex09.jsp">
    <c:param name="message" value='<%=URLEncoder.encode("안녕하세요", "UTF-8")%>' />
</c:import>

<h1>ex10.jsp - 하단</h1>

<c:import var="html" url="https://www.naver.com" />
<textarea cols="150" rows="50">${html}</textarea>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.net.URLDecoder" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="message" value='<%=URLDecoder.decode(request.getParameter("message"), "UTF-8")%>' />
<h1>ex09.jsp</h1>
${message}
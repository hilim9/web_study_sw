<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.net.URLEncoder" %>
<jsp:include page="header.jsp">
    <jsp:param name="message" value='<%=URLEncoder.encode("안녕하세요.", "UTF-8")%>' />
</jsp:include>

<h1>본문....</h1>

<jsp:include page="footer.jsp" />
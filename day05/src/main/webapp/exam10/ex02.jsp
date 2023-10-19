<%@ page contentType="text/html; charset=UTF-8" %>
<%
    Cookie cookie1 = new Cookie("key1", "value1");
    cookie1.setPath(request.getContextPath()); // /day05
    cookie1.setMaxAge(60 * 60 * 24 * 7); // 7일 (604,800) GMT+9 서울
    cookie1.setMaxAge(0); // 1970.1.1 0:0:0 -> 쿠키 삭제
    cookie1.setHttpOnly(true); // 서버쪽에서만 쿠키를 조회가능하게 만듬
    response.addCookie(cookie1);
%>
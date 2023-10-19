<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="models.members.Member" %>
<%
    Member member2 = new Member();
    member2.setUserId("user02");
    request.setAttribute("member", member2);

    Member member = (Member)session.getAttribute("member");
    System.out.println(member);
%>
아이디: ${sessionScope.member.userId}<br>
비밀번호: ${sessionScope.member.userPw}<br>
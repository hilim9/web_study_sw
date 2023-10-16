<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="member" class="models.members.Member" />
<%
    member.setUserId("user01");
    member.setUserPw("123456");
    member.setEmail("user01@test.org");
    //out.print(member);
%>

아이디 : <%=member.getUserId()%><br>
비밀번호 : <%=member.getUserPw()%><br>

아이디 : ${member.userId}<br>
비밀번호 : ${member.userPw}

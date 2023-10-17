<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="member" class="models.members.Member" />
<%--
<jsp:setProperty name="member" property="userId" value="사용자01" />
<jsp:setProperty name="member" property="userPw" value="123456" />
<jsp:setProperty name="member" property="email" value="user01@test.org" />
--%>
<%--
<jsp:setProperty name="member" property="userId" />
<jsp:setProperty name="member" property="userPw" />
<jsp:setProperty name="member" property="email" />
--%>

<jsp:setProperty name="member" property="*" />
<jsp:setProperty name="member" property="userId" param="memId" />

아이디 : <jsp:getProperty name="member" property="userId" /><br>
비밀번호 : <jsp:getProperty name="member" property="userPw" /><br>
이메일 : <jsp:getProperty name="member" property="email" />

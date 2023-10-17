<%@ page contentType="text/html; charset=UTF-8" %>
${param.num == 10 ? "10입니다" : "10이 아닙니다"}
<br>
${empty param.name ? "NONAME" : param.name}
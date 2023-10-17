<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<table border='1'>
    <thead>
        <tr>
            <th>순번</th>
            <th>아이디</th>
            <th>회원명</th>
            <th>이메일</th>
        </tr>
    </thead>
    <tbody>

    <c:forEach var="member" items="${members}" varStatus="status">
       <%--<${status.current}--%>
        <tr>
            <%--<td>${status.index}</td>--%>
            <td>
                ${status.count}
                <div>${status.first} / ${status.last}</div>
            </td>
            <td>${member.userId}</td>
            <td>${member.userNm}</td>
            <td>${status.current.email}</td>
        <tr>
    </c:forEach>

    </tbody>
</table>
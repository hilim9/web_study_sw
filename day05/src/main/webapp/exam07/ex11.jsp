<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="link" value='/exam07/ex10.jsp'>
    <c:param name="key1" value="value1" />
</c:url>

<a href="<%=request.getContextPath()%>/exam07/ex10.jsp">링크1</a>
<a href="${pageContext.request.contextPath}/exam07/ex10.jsp">링크2</a>
<a href="<c:url value='/exam07/ex10.jsp' />">링크3</a>
<a href="${link}">링크4</a>
<%@ tag body-content="scriptless" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ attribute name="items" type="java.util.List" required="true" %>
<%@ attribute name="var" required="true" rtexprvalue="false" %>
<%@ variable name-from-attribute="var" alias="item" variable-class="java.lng.String" scope="NESTED" %>
<% for (Object item : items) { %>
        <c:set var="item" value="<%=item%>" />
        <jsp:doBody />
   <%}%>
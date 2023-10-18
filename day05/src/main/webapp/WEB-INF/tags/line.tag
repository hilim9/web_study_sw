<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ tag pageEncoding="UTF-8" %>
<%@ attribute name="color" %>
<%@ attribute name="size" type="java.lang.Integer" required="true" %>
<div style="color: ${color};">
<%
    for (int i = 0; i < size; i++) {
        out.print("-");
    }
%>

</div>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    // _jspService(...) 메서드 지역 안에 번역
    // 메서드 정의 불가
    // 내장 객체는 jspService()안에서 사용 가능
    int num1 = 100;
    int num2 = 200;
    //out.write("합계 : " + (num1 + num2 + num3 + num4));
    //out.write("합계 : " + add(num1 + num2));
    int result = add(num1, num2);
%>

<%=result%>

<%!
    // 클래스명 바로 아래쪽 멤버 변수로 추가
    // 메서드 정의 가능
    // 내장객체 사용 불가
    int num3 = 300;
    int num4 = 400;

    int add(int num1, int num2) {
        return num1 + num2
    }
%>


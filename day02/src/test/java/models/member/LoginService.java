package models.member;

import jakarta.servlet.http.HttpServletRequest;

public class LoginService {
    public void login(HttpServletRequest request) { // 스텁을 통해 만들기 때문에 데이터가 들어있음(가짜 데이터)

        String userId = request.getParameter("userId");
        String userPw = request.getParameter("userPw");

        System.out.printf("userId=%s, userPw=%s%n", userId, userPw);

    }
}

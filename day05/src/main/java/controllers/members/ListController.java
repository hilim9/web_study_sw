package controllers.members;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.members.Member;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

@WebServlet("/member/list")
public class ListController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Member> members = IntStream.rangeClosed(1, 10).mapToObj(this::addMember).toList();

        // 속성을 입력할 때 forward보다 위에 위치 해야 한다 (인식 못함)
        req.setAttribute("members", members);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/member/list.jsp");

        rd.forward(req, resp);

    }

    private Member addMember(int num) {
        Member member = new Member();
        member.setUserId("user" + num);
        member.setUserPw("123456");
        member.setUserNm("사용자" + num);
        member.setEmail("user" + num + "@test.org");

        return member;
    }

}

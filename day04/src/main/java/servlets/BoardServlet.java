package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class BoardServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        //resp.setCharacterEncoding("UTF-8"); // Servlet 4버전은 Encoding을 UTF-8로 설정해주어야 한글이 깨지지 않는다

        PrintWriter out = resp.getWriter();
        out.print("<form method='post' action='/day04/board'>");
        out.print("제목: <input type='text' name='subject'><br>");
        out.print("내용: <textarea name='content'></textarea><br>");
        out.print("취미: <input type='checkbox' name='hobby' value='취미1'>취미1");
        out.print("<input type='checkbox' name='hobby' value='취미2'>취미2");
        out.print("<input type='checkbox' name='hobby' value='취미3'>취미3");
        out.print("<input type='checkbox' name='hobby' value='취미4'>취미4");
        out.print("<input type='checkbox' name='hobby' value='취미5'>취미5<br>");
        out.print("<button type='submit'>작성하기</button>");
        out.print("</form>");

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8"); // 데이터를 2byte롤 처리하기 때문에 Servlet 4이전 버전은 Encoding 설정
        String subject = req.getParameter("subject");
        String content = req.getParameter("content");

        String hobby = req.getParameter("hobby");
        System.out.printf("subject=%s, content=%s, hobby=%s%n", subject, content, hobby);

        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));

    }
}

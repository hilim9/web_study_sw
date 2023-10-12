package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // super.doGet(req, resp); -> 유지시 동작 안함
        //System.out.println("안녕하세요");
        System.out.println("doGet!!");
    }

    @Override
    public void destroy() { // 가장 마지막에 한번만 호출
        System.out.println("destroy!!");
    }

    @Override
    public void init() throws ServletException { // 가장 처음 한번만 호출
        System.out.println("init!!");
    }
}

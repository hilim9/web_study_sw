package controllers.members;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/member/login")
public class LoginController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] addCss = {"member/style", "file/style"};
        req.setAttribute("addCss", addCss);

        List<String> addScript = Arrays.asList("file/fileupload","member/form");
        req.setAttribute("addScript", addScript);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/member/login.jsp");

        rd.forward(req, resp);
    }
}

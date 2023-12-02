package homework.homework22;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/adult")
public class AdultServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int age = Integer.parseInt(req.getParameter("age"));
        resp.setContentType("text/html");
        try(PrintWriter printWriter = resp.getWriter()){
            if(age < 18){
                printWriter.println("Minor");
            }else {
                printWriter.println("Adult");
            }
        }
    }
}

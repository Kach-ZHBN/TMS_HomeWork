package homework.homework23;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet("/homework23/book")
public class BookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        File bookFolder = new File("D:\\TeachMeSkills\\TMS_HomeWork\\src\\test\\homework\\homework23");
        List<File> files = Arrays.asList(bookFolder.listFiles());
        try (PrintWriter printWriter = resp.getWriter()) {
            for (File file : files) {
                printWriter.println(file.getName());
                printWriter.println("<a href='/homework23/download?name=" + file.getName() + "'>Download</a>");
                printWriter.println("<hr>");
            }
            printWriter.println("<a href='/homework23/load-book'>Upload book</a>");
        }
    }
}

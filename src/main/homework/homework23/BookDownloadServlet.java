package homework.homework23;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet("/homework23/download")
public class BookDownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileName = req.getParameter("name");
        ServletOutputStream out = resp.getOutputStream();
        byte[] byteArray = Files.readAllBytes(Path.of("D:\\TeachMeSkills\\TMS_HomeWork\\src\\test\\homework\\homework23\\"+fileName));
        resp.setContentType("text/plain");
        resp.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
        out.write(byteArray);
        out.flush();
        out.close();
    }
}

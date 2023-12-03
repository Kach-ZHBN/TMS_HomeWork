package homework.homework20.servlets;

import homework.homework20.dao.UserDAO;
import homework.homework20.model.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/homework20/create")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        try (PrintWriter printWriter = resp.getWriter()) {
            printWriter.println("Create user.<br><hr>");
            printWriter.println(
                    "<form action='/homework20/create' method='POST'>\n" +
                            "  <label for='firstName'>Fist name:</label>\n" +
                            "  <input type='text' id='firstName' name='firstName'><br>\n" +
                            "  <label for='lastName'>Last name:</label>\n" +
                            "  <input type='text' id='lastName' name='lastName'><br>\n" +
                            "  <label for='age'>Age:</label>\n" +
                            "  <input type='text' id='age' name='age'><br>\n" +
                            "  <label for='country'>Country:</label>\n" +
                            "  <input type='text' id='country' name='country'><br>\n" +
                            "  <label for='email'>Email:</label>\n" +
                            "  <input type='text' id='email' name='email'><br>\n" +
                            "  <input type='submit' value='Create'>\n" +
                            "</form>"
            );
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        int age = Integer.parseInt(req.getParameter("age"));
        String country = req.getParameter("country");
        String email = req.getParameter("email");

        User user = new User(firstName, lastName, age, country, email);
        UserDAO userDAO = new UserDAO();
        userDAO.save(user);

        resp.sendRedirect("/homework20/get");
    }
}

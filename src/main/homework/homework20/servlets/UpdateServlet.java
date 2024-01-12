package homework.homework20.servlets;

import homework.homework20.dao.UserDAO;
import homework.homework20.model.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


/*
Немного не по условию.
1. Решил сделать через форму.
2. У моего User нет логина. Чтобы не изменять всю структуру дз, позволил себе работать с тем что есть.
 */
@WebServlet("/homework20/change")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        UserDAO userDAO = new UserDAO();
        System.out.println(req.getParameter("id"));
        try (PrintWriter printWriter = resp.getWriter()) {
            int id = Integer.parseInt(req.getParameter("id"));
            User updatedUser = userDAO.getById(id);
            printWriter.println("Update user.<br>");
            printWriter.println(
                    "<form action='/homework20/change' method='POST'>\n" +
                            "  <label for='firstName'>Fist name:</label>\n" +
                            "  <input type='text' id='firstName' name='firstName' value=\"" + updatedUser.getFirstName() + "\"><br>\n" +
                            "  <label for='lastName'>Last name:</label>\n" +
                            "  <input type='text' id='lastName' name='lastName' value=\"" + updatedUser.getLastName() + "\"><br>\n" +
                            "  <label for='age'>Age:</label>\n" +
                            "  <input type='text' id='age' name='age' value=\"" + updatedUser.getAge() + "\"><br>\n" +
                            "  <label for='country'>Country:</label>\n" +
                            "  <input type='text' id='country' name='country' value=\"" + updatedUser.getCountry() + "\"><br>\n" +
                            "  <label for='email'>Email:</label>\n" +
                            "  <input type='text' id='email' name='email' value=\"" + updatedUser.getEmail() + "\"><br>\n" +
                            "  <input type='hidden' name='id' value=\"" + updatedUser.getId() + "\">\n" +
                            "  <input type='submit' value='Create'>\n" +
                            "</form>"
            );
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        int age = Integer.parseInt(req.getParameter("age"));
        String country = req.getParameter("country");
        String email = req.getParameter("email");

        User user = new User(id, firstName, lastName, age, country, email);
        UserDAO userDAO = new UserDAO();
        userDAO.update(id, user);

        resp.sendRedirect("/homework20/get");
    }
}

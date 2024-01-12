package homework.homework20.servlets;

import homework.homework20.dao.UserDAO;
import homework.homework20.model.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/homework20/get")
public class GetUserServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        UserDAO userDAO = new UserDAO();
        resp.setContentType("text/html");
        try (PrintWriter printWriter = resp.getWriter()) {
            if (req.getParameter("id") == null) {
                List<User> users = userDAO.getAll();
                printWriter.println("Numbers of users = " + users.size() + "<br><hr>");
                for (User user : users) {
                    printWriter.println(user);
                    printWriter.println(
                            "<form action='/homework20/delete?id=" + user.getId() + "' method='POST'>\n" +
                                    "  <input type='submit' value='Delete'>\n" +
                                    "</form>"
                    );
                    printWriter.println("<a href=\"/homework20/change?id=" + user.getId() + "\">Change</a>");
                    printWriter.println("<hr>");
                }
            } else {
                int id = Integer.parseInt(req.getParameter("id"));
                User user = userDAO.getById(id);
                printWriter.println();
                if (user != null) {
                    printWriter.println(user);
                } else {
                    printWriter.println("User doesn't exist");
                }
            }
            printWriter.println("<a href='/homework20/create'>Create</a>");
        }
    }
}

package homework.homework20.servlets;

import homework.homework20.dao.UserDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/homework20/delete")
public class DeleteUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        UserDAO userDAO = new UserDAO();
        if (req.getParameter("id") != null) {
            int id = Integer.parseInt(req.getParameter("id"));
            userDAO.delete(id);
        }
        resp.sendRedirect(req.getContextPath() + "/homework20/get");
    }
}

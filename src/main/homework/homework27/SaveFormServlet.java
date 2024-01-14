package homework.homework27;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
Создать страницу save-request.jsp, содержащую форму для ввода заявки. Форма должна
отправлять данные в POST запросе сервлету, который их проверяет. Если одно из полей
не указано, сервлет должен снова перенаправить на страницу ввода данных. Если
указаны верно, сервлет должен перенаправить на страницу, на которой нужно отобразить
текст: «Заявка успешно сохранена" с отображенной информацией из формы.
 */
@WebServlet("/save-request")
public class SaveFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("errorMessage", "");
        getServletContext().getRequestDispatcher("/homework27/save-request.jsp").forward(req, resp);
    }

    /*
    Основную валидацию выполняю на стороне jsp-страницы. В сервлете проверяю совпадает ли пароль с подтверждением.
    Если пароль и подтверждение не совпадают, перенаправляю на эту же страницу с выводом ошибки.
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        if (password.equals(confirmPassword)) {
            getServletContext().getRequestDispatcher("/homework27/success-page.jsp").forward(req, resp);
        } else {
            req.setAttribute("errorMessage", "Password does not match confirmation");
            getServletContext().getRequestDispatcher("/homework27/save-request.jsp").forward(req, resp);
        }

    }
}

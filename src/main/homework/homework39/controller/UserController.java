package homework.homework39.controller;

import homework.homework39.dao.UserDAO;
import homework.homework39.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserDAO userDAO;

    @Autowired
    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping("")
    public String getAllUsers(Model model) {
        List<User> users = userDAO.getAll();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/create")
    public String getCreatePage(Model model) {
        model.addAttribute("user", new User());
        return "create-user-page";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute("user") @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new IllegalArgumentException("Illegal arguments");
        }
        userDAO.save(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/edit")
    public String getEditPage(@PathVariable("id") int id, Model model) {
        User user = userDAO.getById(id);
        model.addAttribute("user", user);
        return "edit-user-page";
    }

    @PostMapping("/{id}/edit")
    public String editUser(@PathVariable("id") int id,
                           @ModelAttribute("user") @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new IllegalArgumentException("Illegal arguments");
        }
        userDAO.update(id, user);
        return "redirect:/users/" + id + "/edit";
    }

    @PostMapping("/{id}/delete")
    public String deleteUser(@PathVariable("id") int id) {
        userDAO.delete(id);
        return "redirect:/users";
    }


    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException(){
        //Какая-то логика
        System.out.println("Invalid values. The frontend needs to do something");
        //дальше какая-то логика
        return "error";
    }
}

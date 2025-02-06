package dev.pixellogic.authguardian.controller;


import dev.pixellogic.authguardian.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {


    private List<User> users;

    public UserController(List<User> users) {
        this.users = users;
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }


    @PostMapping("/login")
    public String login(@ModelAttribute User user, Model model) {
        users.add(user);
        model.addAttribute("users", users);
        return "users";
    }
}

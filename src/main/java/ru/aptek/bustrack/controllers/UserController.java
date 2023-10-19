package ru.aptek.bustrack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.aptek.bustrack.entities.User;
import ru.aptek.bustrack.services.UserService;

import java.util.UUID;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String index(){

        return "index";

    }
}

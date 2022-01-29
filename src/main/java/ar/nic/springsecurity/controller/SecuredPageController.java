package ar.nic.springsecurity.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SecuredPageController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/myUser")
    public String users(Authentication authentication) {
        return authentication.toString();
    }

    @GetMapping("/con2")
    String confirmation() {
        return "confirmation";
    }
}

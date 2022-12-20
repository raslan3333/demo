package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @GetMapping("/user")
    public CustomUser user(CustomUser currentUser) {
        return currentUser;
    }

    @GetMapping("/")
    public String index() {
        return "currentUser";
    }

    @PostMapping("/login")
    public String index(@RequestBody LoginBody body, HttpServletRequest request) throws ServletException {
        request.login(body.getUsername(), body.getPassword());
        System.out.println("helllllllllo");
        return "currentUser";
    }

}

class LoginBody {
    public String username;
    public String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
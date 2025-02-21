package com.demo.uc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@Controller
class HelloWebController {

    @GetMapping("/web")
    public String hello() {
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message", "This is a custom message");
        return "message";
    }
}

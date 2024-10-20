package ru.isntrui.holodos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api/")
public class SwaggerController {
    @GetMapping()
    private static String swagger() {
        return "redirect:../swagger-ui.html";
    }
}

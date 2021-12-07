package com.github.marcelobikerdev.citiesapi;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Home {

    @RequestMapping("/")
    public String home() {
        return "Funcionou porraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!";
    }
}

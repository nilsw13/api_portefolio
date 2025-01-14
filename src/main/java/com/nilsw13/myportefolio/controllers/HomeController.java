package com.nilsw13.myportefolio.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/home")
public class HomeController {



        public String home() {
            return "Welcome to my portefolio";
        }



}

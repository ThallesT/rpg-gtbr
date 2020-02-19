package com.gtbr.rpg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        //if(has session goto dashboard)
        return "login.html";
    }

    @RequestMapping("/teste")
    public String paginaTeste(){

        return "home.html";
    }

    @RequestMapping("/registro")
    public String paginaRegistro(){

        return "registro/register.html";
    }




}

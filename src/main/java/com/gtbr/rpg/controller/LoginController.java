package com.gtbr.rpg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){

        return "login.html";
    }

    @RequestMapping("/registra-novo-usuario")
    public String registraUsuarioNovo(@RequestParam("username")String username, @RequestParam("senha")String senha, @RequestParam("email")String email){



        return null;
    }


}

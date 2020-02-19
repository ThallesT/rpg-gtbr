package com.gtbr.rpg.controller;


import com.gtbr.rpg.entity.Jogador;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(HttpServletRequest request){
        if(request.getSession().getAttribute("usuarioLogado") != null) return "home.html";


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

package com.gtbr.rpg.controller;


import com.gtbr.rpg.crud.JogadorServicoCrud;
import com.gtbr.rpg.entity.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    private JogadorServicoCrud jogadorServicoCrud;

    @RequestMapping("/")
    public String index(HttpServletRequest request, Model model){
        if(request.getSession().getAttribute("usuarioLogado") != null) {
            Jogador jogador = jogadorServicoCrud.getJogadorById((Long) request.getSession().getAttribute("usuarioLogado"));
            model.addAttribute("jogador", jogador);
            return "home.html";
        }


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

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        request.getSession().invalidate();
        return "redirect:/";
    }




}

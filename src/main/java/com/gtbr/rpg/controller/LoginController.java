package com.gtbr.rpg.controller;

import com.gtbr.rpg.crud.JogadorServicoCrud;
import com.gtbr.rpg.entity.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private JogadorServicoCrud jogadorServicoCrud;

    @RequestMapping("/login")
    public String login(){

        return "login.html";
    }

    @RequestMapping("/registra-novo-usuario")
    public String registraUsuarioNovo(@RequestParam("username")String username, @RequestParam("senha")String senha,
                                      @RequestParam("email")String email, HttpServletRequest request, Model model){
        if(jogadorServicoCrud.hasAccount(email)) return "registro/usuarioJaExiste.html";

        Jogador jogador = jogadorServicoCrud.insertJogador(username,senha,email);
        model.addAttribute("jogador", jogador);
        return "redirect:/";
    }


}

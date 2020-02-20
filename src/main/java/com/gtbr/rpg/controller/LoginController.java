package com.gtbr.rpg.controller;

import com.gtbr.rpg.crud.JogadorServicoCrud;
import com.gtbr.rpg.entity.Jogador;
import com.gtbr.rpg.service.GeneralServices;
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
    public String login(HttpServletRequest request){
        if(request.getSession().getAttribute("usuarioLogado") != null) return "redirect:/";

        return "login.html";
    }

    @RequestMapping("/logar")
    public String loga(HttpServletRequest request, @RequestParam("email")String email, @RequestParam("senha")String senha){
        Jogador jogador = jogadorServicoCrud.getJogadorByEmail(email);
            if(jogador == null) return "redirect:/registro";
            if(GeneralServices.validaConfirmaSenha(GeneralServices.gerarHash(senha), jogador.getSenha())){
            request.getSession().setAttribute("usuarioLogado", jogador.getIdJogador());
            return "redirect:/";
        }

        return "redirect:/login";
    }

    @RequestMapping("/registra-novo-usuario")
    public String registraUsuarioNovo(@RequestParam("username")String username, @RequestParam("senha")String senha,
                                      @RequestParam("email")String email, HttpServletRequest request, Model model){
        if(jogadorServicoCrud.hasAccount(email)) return "registro/usuarioJaExiste.html";

        Jogador jogador = jogadorServicoCrud.insertJogador(username, GeneralServices.gerarHash(senha),email);
        model.addAttribute("jogador", jogador);
        request.getSession().setAttribute("usuarioLogado", jogador.getIdJogador());
        return "redirect:/";
    }


}

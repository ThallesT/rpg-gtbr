package com.gtbr.rpg.controller;

import com.gtbr.rpg.crud.JogadorServicoCrud;
import com.gtbr.rpg.entity.Jogador;
import com.gtbr.rpg.service.GeneralServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
public class PerfilController {

    @Autowired
    private JogadorServicoCrud jogadorServicoCrud;

    @RequestMapping("/meu-perfil")
    public String mostraPerfil(HttpServletRequest request, Model model){
        if(request.getSession().getAttribute("usuarioLogado") != null) {
            Jogador jogador = jogadorServicoCrud.getJogadorById((Long) request.getSession().getAttribute("usuarioLogado"));
            model.addAttribute("jogador", jogador);
            return "perfil/perfil-jogador.html";
        }


        return "redirect:/";
    }


    @PostMapping("/teste-foto")
    public String testeFoto(@RequestParam("foto") MultipartFile foto, Model model) throws Exception {
        String baseImg = GeneralServices.decodificaImagem(foto);
        model.addAttribute("baseImg", baseImg);
        return "exibindoFoto.html";
    }
}

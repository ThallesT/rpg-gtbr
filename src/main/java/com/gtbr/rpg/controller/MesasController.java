package com.gtbr.rpg.controller;

import com.gtbr.rpg.crud.JogadorServicoCrud;
import com.gtbr.rpg.crud.MesaServicoCrud;
import com.gtbr.rpg.dto.MesaDTO;
import com.gtbr.rpg.entity.Jogador;
import com.gtbr.rpg.entity.Mesa;
import com.gtbr.rpg.entity.MesaJogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MesasController {

    @Autowired
    private JogadorServicoCrud jogadorServicoCrud;
    @Autowired
    private MesaServicoCrud mesaServicoCrud;

    @RequestMapping("/mesas")
    public String exibeSalas(HttpServletRequest request, Model model){
        Jogador jogador = jogadorServicoCrud.getJogadorById((Long)request.getSession().getAttribute("usuarioLogado"));
        List<MesaDTO> listaMesaDTO = mesaServicoCrud.getListaMesaDTO(jogador.getIdJogador());

        model.addAttribute("listaMesaDTO", listaMesaDTO);
        return "mesas/menu-mesas.html";
    }
}

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
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/mesa/criar")
    public String exibeTelaDeCriacaoDeMesa(){

        return "mesas/criar-mesa.html";
    }

    @RequestMapping("/mesa/registra-mesa")
    public String registraMesa(@RequestParam("nome")String nome, @RequestParam("sistema")String sistema,
                               @RequestParam("introducao")String introducao, HttpServletRequest request){
        Jogador jogador = jogadorServicoCrud.getJogadorById((Long)request.getSession().getAttribute("usuarioLogado"));
        mesaServicoCrud.insereMesa(nome, sistema, introducao, jogador.getIdJogador());

        return "redirect:/mesas";
    }

    @RequestMapping("/mesa/convite")
    public String cadastraJogadorNaMesaPorConvite(@RequestParam("invite")String invite, HttpServletRequest request){
        Jogador jogador = jogadorServicoCrud.getJogadorById((Long)request.getSession().getAttribute("usuarioLogado"));
        mesaServicoCrud.cadastroJogadorByInviteCode(invite, jogador.getIdJogador());

        return "redirect:/mesas";
    }

    @RequestMapping("/mesa/entrar/{idMesa}")
    public String acessaMesa(@PathVariable("idMesa")Long idMesa, HttpServletRequest request, Model model){
        Jogador jogador = jogadorServicoCrud.getJogadorById((Long)request.getSession().getAttribute("usuarioLogado"));
        if(mesaServicoCrud.validaMesaJogador(idMesa, jogador.getIdJogador())) {
            MesaDTO mesaDTO = mesaServicoCrud.getMesaDTO(idMesa);
            model.addAttribute("mesaDTO",mesaDTO);
            return "mesas/tela-principal-mesa.html";
        }

        return "redirect:/mesas";
    }

}

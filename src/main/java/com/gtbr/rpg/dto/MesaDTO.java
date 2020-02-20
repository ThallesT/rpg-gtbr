package com.gtbr.rpg.dto;

import com.gtbr.rpg.entity.Jogador;
import com.gtbr.rpg.entity.Mesa;

import java.util.List;

public class MesaDTO {

    private Mesa mesa;

    private List<JogadorDTO> listaJogadorDTO;

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<JogadorDTO> getListaJogador() {
        return listaJogadorDTO;
    }

    public void setListaJogador(List<JogadorDTO> listaJogadorDTO) {
        this.listaJogadorDTO = listaJogadorDTO;
    }
}

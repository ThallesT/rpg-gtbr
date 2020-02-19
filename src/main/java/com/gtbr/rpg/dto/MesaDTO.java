package com.gtbr.rpg.dto;

import com.gtbr.rpg.entity.Jogador;
import com.gtbr.rpg.entity.Mesa;

import java.util.List;

public class MesaDTO {

    private Mesa mesa;

    private List<Jogador> listaJogador;

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Jogador> getListaJogador() {
        return listaJogador;
    }

    public void setListaJogador(List<Jogador> listaJogador) {
        this.listaJogador = listaJogador;
    }
}

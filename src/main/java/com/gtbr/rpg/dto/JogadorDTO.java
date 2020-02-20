package com.gtbr.rpg.dto;

import com.gtbr.rpg.entity.Jogador;

public class JogadorDTO {
    private Jogador jogador;
    private String fotoDePerfil;

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public String getFotoDePerfil() {
        return fotoDePerfil;
    }

    public void setFotoDePerfil(String fotoDePerfil) {
        this.fotoDePerfil = fotoDePerfil;
    }
}

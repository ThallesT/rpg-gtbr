package com.gtbr.rpg.dto;

import com.gtbr.rpg.entity.Jogador;

public class JogadorDTO extends Jogador{

    private String fotoDePerfil;

    public String getFotoDePerfil() {
        return fotoDePerfil;
    }

    public void setFotoDePerfil(String fotoDePerfil) {
        this.fotoDePerfil = fotoDePerfil;
    }
}

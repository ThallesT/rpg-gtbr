package com.gtbr.rpg.dto;

import com.gtbr.rpg.entity.Jogador;

public class JogadorDTO extends Jogador{

    private String fotoDePerfil;

    public JogadorDTO(Jogador jogador){
        super.setEmail(jogador.getEmail());
        super.setNome(jogador.getNome());
        super.setSenha(jogador.getSenha());
        super.setIdJogador(jogador.getIdJogador());
        super.setFotoJogador(jogador.getFotoJogador());
    }

    public String getFotoDePerfil() {
        return fotoDePerfil;
    }

    public void setFotoDePerfil(String fotoDePerfil) {
        this.fotoDePerfil = fotoDePerfil;
    }
}

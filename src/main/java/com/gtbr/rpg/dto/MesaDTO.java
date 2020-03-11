package com.gtbr.rpg.dto;

import com.gtbr.rpg.entity.Jogador;
import com.gtbr.rpg.entity.Mesa;

import java.util.List;

public class MesaDTO extends Mesa{



    private List<JogadorDTO> listaJogadorDTO;


    public List<JogadorDTO> getListaJogadorDTO() {
        return listaJogadorDTO;
    }

    public void setListaJogadorDTO(List<JogadorDTO> listaJogadorDTO) {
        this.listaJogadorDTO = listaJogadorDTO;
    }

}

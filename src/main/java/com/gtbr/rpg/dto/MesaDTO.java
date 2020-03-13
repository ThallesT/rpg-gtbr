package com.gtbr.rpg.dto;

import com.gtbr.rpg.entity.Mesa;

import java.util.List;

public class MesaDTO extends Mesa{

    private List<JogadorDTO> listaJogadorDTO;

    public MesaDTO(Mesa mesa){
        super.setIdMestre(mesa.getIdMestre());
        super.setIntroducao(mesa.getIntroducao());
        super.setInviteCode(mesa.getInviteCode());
        super.setNome(mesa.getNome());
        super.setSistema(mesa.getSistema());
        super.setIdMesa(mesa.getIdMesa());
        super.setMestre(mesa.getMestre());
    }

    public List<JogadorDTO> getListaJogadorDTO() {
        return listaJogadorDTO;
    }

    public void setListaJogadorDTO(List<JogadorDTO> listaJogadorDTO) {
        this.listaJogadorDTO = listaJogadorDTO;
    }

}

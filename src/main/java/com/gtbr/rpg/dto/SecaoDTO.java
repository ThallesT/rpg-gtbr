package com.gtbr.rpg.dto;

import com.gtbr.rpg.entity.Campo;
import com.gtbr.rpg.entity.Secao;

import java.util.List;

public class SecaoDTO extends Secao {

    private List<Campo> listaCampo;

    public List<Campo> getListaCampo() {
        return listaCampo;
    }

    public void setListaCampo(List<Campo> listaCampo) {
        this.listaCampo = listaCampo;
    }
}

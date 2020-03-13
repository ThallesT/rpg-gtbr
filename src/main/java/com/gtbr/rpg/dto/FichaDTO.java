package com.gtbr.rpg.dto;

import com.gtbr.rpg.entity.Ficha;
import com.gtbr.rpg.entity.Idioma;
import com.gtbr.rpg.entity.Item;
import com.gtbr.rpg.entity.Skill;

import java.util.List;

public class FichaDTO extends Ficha{

    private List<SecaoDTO> listaSkill;


    public List<SecaoDTO> getListaSkill() {
        return listaSkill;
    }

    public void setListaSkill(List<SecaoDTO> listaSkill) {
        this.listaSkill = listaSkill;
    }
}

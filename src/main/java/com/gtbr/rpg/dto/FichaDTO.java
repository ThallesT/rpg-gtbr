package com.gtbr.rpg.dto;

import com.gtbr.rpg.entity.Ficha;
import com.gtbr.rpg.entity.Idioma;
import com.gtbr.rpg.entity.Item;
import com.gtbr.rpg.entity.Skill;

import java.util.List;

public class FichaDTO {

    private Ficha ficha;
    private List<Skill> listaSkill;
    private List<Item> listaItem;
    private List<Item> listaEquipamento;
    private List<Idioma> listaIdioma;

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public List<Skill> getListaSkill() {
        return listaSkill;
    }

    public void setListaSkill(List<Skill> listaSkill) {
        this.listaSkill = listaSkill;
    }

    public List<Item> getListaItem() {
        return listaItem;
    }

    public void setListaItem(List<Item> listaItem) {
        this.listaItem = listaItem;
    }

    public List<Item> getListaEquipamento() {
        return listaEquipamento;
    }

    public void setListaEquipamento(List<Item> listaEquipamento) {
        this.listaEquipamento = listaEquipamento;
    }

    public List<Idioma> getListaIdioma() {
        return listaIdioma;
    }

    public void setListaIdioma(List<Idioma> listaIdioma) {
        this.listaIdioma = listaIdioma;
    }
}

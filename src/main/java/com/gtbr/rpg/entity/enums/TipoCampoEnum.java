package com.gtbr.rpg.entity.enums;

public enum TipoCampoEnum {

    STRING(1, "Texto"),
    LONG(2, "Numero inteiro"),
    DOUBLE(3, "Numero real");

    private Integer codigo;
    private String descricao;

    TipoCampoEnum(Integer codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}

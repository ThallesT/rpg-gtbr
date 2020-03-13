package com.gtbr.rpg.entity;

import com.gtbr.rpg.entity.enums.TipoCampoEnum;

import javax.persistence.*;

@Entity
@Table(name = "campo", schema = "public")
public class Campo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_campo")
    private Long idCampo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "tipo_campo")
    private TipoCampoEnum tipoCampo;


    public Long getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(Long idCampo) {
        this.idCampo = idCampo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCampoEnum getTipoCampo() {
        return tipoCampo;
    }

    public void setTipoCampo(TipoCampoEnum tipoCampo) {
        this.tipoCampo = tipoCampo;
    }
}

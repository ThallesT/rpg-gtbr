package com.gtbr.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "ficha", schema = "public")
public class Ficha{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ficha")
    private Long idFicha;

    public Long getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Long idFicha) {
        this.idFicha = idFicha;
    }
}

package com.gtbr.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "secao", schema = "public")
public class Secao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_secao")
    private Long idSecao;

    @Column(name = "titulo")
    private Long titulo;


    public Long getIdSecao() {
        return idSecao;
    }

    public void setIdSecao(Long idSecao) {
        this.idSecao = idSecao;
    }

    public Long getTitulo() {
        return titulo;
    }

    public void setTitulo(Long titulo) {
        this.titulo = titulo;
    }
}

package com.gtbr.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "ficha_idioma", schema = "public")
public class FichaIdioma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ficha_idioma")
    private Long idFichaIdioma;

    @Column(name = "id_ficha")
    private Long idFicha;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_ficha",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_ficha_idioma_id_ficha"))
    private Ficha ficha;

    @Column(name = "id_idioma")
    private Long idIdioma;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_idioma",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_ficha_idioma_id_idioma"))
    private Idioma idioma;


    public Long getIdFichaIdioma() {
        return idFichaIdioma;
    }

    public void setIdFichaIdioma(Long idFichaIdioma) {
        this.idFichaIdioma = idFichaIdioma;
    }

    public Long getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Long idFicha) {
        this.idFicha = idFicha;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Long getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Long idIdioma) {
        this.idIdioma = idIdioma;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }
}

package com.gtbr.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "ficha_secao", schema = "public")
public class FichaSecao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ficha_secao")
    private Long idFichaSecao;

    @Column(name = "id_ficha")
    private Long idFicha;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_ficha",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_ficha_secao_id_ficha"))
    private Ficha ficha;

    @Column(name = "id_secao")
    private Long idsecao;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_secao",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_ficha_secao_id_secao"))
    private Secao secao;


    public Long getIdFichaSecao() {
        return idFichaSecao;
    }

    public void setIdFichaSecao(Long idFichaSecao) {
        this.idFichaSecao = idFichaSecao;
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

    public Long getIdsecao() {
        return idsecao;
    }

    public void setIdsecao(Long idsecao) {
        this.idsecao = idsecao;
    }

    public Secao getSecao() {
        return secao;
    }

    public void setSecao(Secao secao) {
        this.secao = secao;
    }
}

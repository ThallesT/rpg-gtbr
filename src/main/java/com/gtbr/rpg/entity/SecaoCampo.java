package com.gtbr.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "secao_campo", schema = "public")
public class SecaoCampo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_secao_campo")
    private Long idSecaoCampo;

    @Column(name = "id_secao")
    private Long idSecao;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_secao",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_secao_campo_id_secao"))
    private Secao secao;

    @Column(name = "id_campo")
    private Long idCampo;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_campo",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_secao_campo_id_campo"))
    private Campo campo;

    public Long getIdSecaoCampo() {
        return idSecaoCampo;
    }

    public void setIdSecaoCampo(Long idSecaoCampo) {
        this.idSecaoCampo = idSecaoCampo;
    }

    public Long getIdSecao() {
        return idSecao;
    }

    public void setIdSecao(Long idSecao) {
        this.idSecao = idSecao;
    }

    public Secao getSecao() {
        return secao;
    }

    public void setSecao(Secao secao) {
        this.secao = secao;
    }

    public Long getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(Long idCampo) {
        this.idCampo = idCampo;
    }

    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }
}

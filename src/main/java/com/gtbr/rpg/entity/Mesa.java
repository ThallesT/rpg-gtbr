package com.gtbr.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "mesa", schema = "public")
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mesa")
    private Long idMesa;

    @Column(name = "introducao", length = 1000)
    private String introducao;

    @Column(name = "nome")
    private String nome;

    @Column(name = "invite_code")
    private String inviteCode;

    @Column(name = "sistema")
    private String sistema;

    @Column(name = "id_jogador_mestre")
    private Long idMestre;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_jogador_mestre",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_mesa_id_jogador"))
    private Jogador mestre;


    public Long getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Long idMesa) {
        this.idMesa = idMesa;
    }

    public Jogador getMestre() {
        return mestre;
    }

    public void setMestre(Jogador mestre) {
        this.mestre = mestre;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public Long getIdMestre() {
        return idMestre;
    }

    public void setIdMestre(Long idMestre) {
        this.idMestre = idMestre;
    }

    public String getIntroducao() {
        return introducao;
    }

    public void setIntroducao(String introducao) {
        this.introducao = introducao;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getSistema() {
        return sistema;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

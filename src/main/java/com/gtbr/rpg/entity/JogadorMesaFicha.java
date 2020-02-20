package com.gtbr.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "JOGADOR_MESA_FICHA")
public class JogadorMesaFicha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jogador_mesa_ficha")
    private Long idJogadorMesaFicha;

    @Column(name = "id_mesa")
    private Long idMesa;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_mesa",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_jogador_mesa_ficha_id_mesa"))
    private Mesa mesa;

    @Column(name = "id_jogador")
    private Long idJogador;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_jogador",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_jogador_mesa_ficha_id_jogador"))
    private Jogador jogador;

    @Column(name = "id_ficha")
    private Long idFicha;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_ficha",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_jogador_mesa_ficha_id_ficha"))
    private Ficha ficha;


    public Long getIdJogadorMesaFicha() {
        return idJogadorMesaFicha;
    }

    public void setIdJogadorMesaFicha(Long idJogadorMesaFicha) {
        this.idJogadorMesaFicha = idJogadorMesaFicha;
    }

    public Long getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Long idMesa) {
        this.idMesa = idMesa;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Long getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(Long idJogador) {
        this.idJogador = idJogador;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
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
}

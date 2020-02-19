package com.gtbr.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "MESA_JOGADOR", schema = "PUBLIC")
public class MesaJogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mesa_jogador")
    private Long idMesaJogador;

    @Column(name = "id_mesa")
    private Long idMesa;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_mesa",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_mesa_jogador_id_mesa"))
    private Mesa mesa;

    @Column(name = "id_jogador")
    private Long idJogador;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_jogador",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_mesa_jogador_id_jogador"))
    private Jogador jogador;

    public Long getIdMesaJogador() {
        return idMesaJogador;
    }

    public void setIdMesaJogador(Long idMesaJogador) {
        this.idMesaJogador = idMesaJogador;
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
}

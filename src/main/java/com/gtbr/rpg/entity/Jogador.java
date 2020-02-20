package com.gtbr.rpg.entity;

import javax.persistence.*;


@Entity
@Table(name = "jogador", schema = "public")
public class Jogador {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJogador")
    private Long idJogador;

    @Column(name = "fotoJogador")
    private Byte[] fotoJogador;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    public Long getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(Long idJogador) {
        this.idJogador = idJogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Byte[] getFotoJogador() {
        return fotoJogador;
    }

    public void setFotoJogador(Byte[] fotoJogador) {
        this.fotoJogador = fotoJogador;
    }
}

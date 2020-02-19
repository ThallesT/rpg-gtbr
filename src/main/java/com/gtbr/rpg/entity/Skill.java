package com.gtbr.rpg.entity;


import javax.persistence.*;

@Entity
@Table(name = "skill", schema = "public")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_skill")
    private Long idSkill;

    @Column(name = "imagem_da_skill")
    private Byte[] imagemSkill;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public Byte[] getImagemSkill() {
        return imagemSkill;
    }

    public void setImagemSkill(Byte[] imagemSkill) {
        this.imagemSkill = imagemSkill;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

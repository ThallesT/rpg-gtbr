package com.gtbr.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "ficha_skill", schema = "public")
public class FichaSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ficha_skill")
    private Long idFichaSkill;

    @Column(name = "id_ficha")
    private Long idFicha;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_ficha",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_ficha_skill_id_ficha"))
    private Ficha ficha;

    @Column(name = "id_skill")
    private Long idSkill;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_skill",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_ficha_skill_id_skill"))
    private Skill skill;


    public Long getIdFichaSkill() {
        return idFichaSkill;
    }

    public void setIdFichaSkill(Long idFichaSkill) {
        this.idFichaSkill = idFichaSkill;
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

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}

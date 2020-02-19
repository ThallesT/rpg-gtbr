package com.gtbr.rpg.entity;


import javax.persistence.*;

@Entity
@Table(name = "pericias", schema = "public")
public class Pericias {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pericia")
    private Long idPericia;

    @Column(name = "acrobacia")
    private Long acrobacia;

    @Column(name = "arcanismo")
    private Long arcanismo;

    @Column(name = "atletismo")
    private Long atletismo;

    @Column(name = "atuacao")
    private Long atuacao;

    @Column(name = "blefar")
    private Long blefar;

    @Column(name = "furtividade")
    private Long furtividade;

    @Column(name = "historia")
    private Long historia;

    @Column(name = "intimidacao")
    private Long intimidacao;

    @Column(name = "intuicao")
    private Long intuicao;

    @Column(name = "investigacao")
    private Long investigacao;

    @Column(name = "lidar_com_animais")
    private Long lidarComAnimais;

    @Column(name = "medicina")
    private Long medicina;

    @Column(name = "natureza")
    private Long natureza;

    @Column(name = "percepcao")
    private Long percepcao;

    @Column(name = "persuasao")
    private Long persuasao;

    @Column(name = "prestidigitacao")
    private Long prestidigitacao;

    @Column(name = "religiao")
    private Long religiao;

    @Column(name = "sobrevivencia")
    private Long sobrevivencia;

    public Long getAcrobacia() {
        return acrobacia;
    }

    public void setAcrobacia(Long acrobacia) {
        this.acrobacia = acrobacia;
    }

    public Long getArcanismo() {
        return arcanismo;
    }

    public void setArcanismo(Long arcanismo) {
        this.arcanismo = arcanismo;
    }

    public Long getAtletismo() {
        return atletismo;
    }

    public void setAtletismo(Long atletismo) {
        this.atletismo = atletismo;
    }

    public Long getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(Long atuacao) {
        this.atuacao = atuacao;
    }

    public Long getBlefar() {
        return blefar;
    }

    public void setBlefar(Long blefar) {
        this.blefar = blefar;
    }

    public Long getFurtividade() {
        return furtividade;
    }

    public void setFurtividade(Long furtividade) {
        this.furtividade = furtividade;
    }

    public Long getHistoria() {
        return historia;
    }

    public void setHistoria(Long historia) {
        this.historia = historia;
    }

    public Long getIntimidacao() {
        return intimidacao;
    }

    public void setIntimidacao(Long intimidacao) {
        this.intimidacao = intimidacao;
    }

    public Long getIntuicao() {
        return intuicao;
    }

    public void setIntuicao(Long intuicao) {
        this.intuicao = intuicao;
    }

    public Long getInvestigacao() {
        return investigacao;
    }

    public void setInvestigacao(Long investigacao) {
        this.investigacao = investigacao;
    }

    public Long getLidarComAnimais() {
        return lidarComAnimais;
    }

    public void setLidarComAnimais(Long lidarComAnimais) {
        this.lidarComAnimais = lidarComAnimais;
    }

    public Long getMedicina() {
        return medicina;
    }

    public void setMedicina(Long medicina) {
        this.medicina = medicina;
    }

    public Long getNatureza() {
        return natureza;
    }

    public void setNatureza(Long natureza) {
        this.natureza = natureza;
    }

    public Long getPercepcao() {
        return percepcao;
    }

    public void setPercepcao(Long percepcao) {
        this.percepcao = percepcao;
    }

    public Long getPersuasao() {
        return persuasao;
    }

    public void setPersuasao(Long persuasao) {
        this.persuasao = persuasao;
    }

    public Long getPrestidigitacao() {
        return prestidigitacao;
    }

    public void setPrestidigitacao(Long prestidigitacao) {
        this.prestidigitacao = prestidigitacao;
    }

    public Long getReligiao() {
        return religiao;
    }

    public void setReligiao(Long religiao) {
        this.religiao = religiao;
    }

    public Long getSobrevivencia() {
        return sobrevivencia;
    }

    public void setSobrevivencia(Long sobrevivencia) {
        this.sobrevivencia = sobrevivencia;
    }

    public Long getIdPericia() {
        return idPericia;
    }

    public void setIdPericia(Long idPericia) {
        this.idPericia = idPericia;
    }
}

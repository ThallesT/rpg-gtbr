package com.gtbr.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "ficha", schema = "public")
public class Ficha{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ficha")
    private Long idFicha;

    @Column(name = "nome_do_personagem")
    private String nomePersonagem;

    @Column(name = "classe")
    private String classe;

    @Column(name = "historia", length = 10000)
    private String historia;

    @Column(name = "raca")
    private String raca;

    @Column(name = "level")
    private Long level;

    @Column(name = "classe_de_armadura")
    private Long classeArmadura;

    @Column(name = "iniciativa")
    private Long iniciativa;

    @Column(name = "deslocamento")
    private Long deslocamento;

    @Column(name = "peca_de_cobre")
    private Long pecaCobre;

    @Column(name = "peca_de_prata")
    private Long pecaPrata;

    @Column(name = "peca_de_ouro")
    private Long pecaOuro;

    @Column(name = "peca_de_platina")
    private Long pecaPlatina;

    @Column(name = "percepcao_passiva")
    private Long percepcaoPassiva;

    @Column(name = "antecendente")
    private String antecedente;

    @Column(name = "tendencia")
    private String tendencia;

    @Column(name = "experiencia")
    private Long experiencia;

    @Column(name = "forca")
    private Long forca;

    @Column(name = "destreza")
    private Long destreza;

    @Column(name = "constituicao")
    private Long constituicao;

    @Column(name = "inteligencia")
    private Long inteligencia;

    @Column(name = "sabedoria")
    private Long sabedoria;

    @Column(name = "carisma")
    private Long carisma;

    @Column(name = "bonus_de_proficiencia")
    private Long bonusProficiencia;

    @Column(name = "id_pericias")
    private Long idPericia;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_pericias",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_pericias_id_pericias"))
    private Pericias pericias;

    public Long getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Long idFicha) {
        this.idFicha = idFicha;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getClasseArmadura() {
        return classeArmadura;
    }

    public void setClasseArmadura(Long classeArmadura) {
        this.classeArmadura = classeArmadura;
    }

    public Long getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(Long iniciativa) {
        this.iniciativa = iniciativa;
    }

    public Long getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(Long deslocamento) {
        this.deslocamento = deslocamento;
    }

    public Long getPecaOuro() {
        return pecaOuro;
    }

    public void setPecaOuro(Long pecaOuro) {
        this.pecaOuro = pecaOuro;
    }

    public Long getPercepcaoPassiva() {
        return percepcaoPassiva;
    }

    public void setPercepcaoPassiva(Long percepcaoPassiva) {
        this.percepcaoPassiva = percepcaoPassiva;
    }

    public String getAntecedente() {
        return antecedente;
    }

    public void setAntecedente(String antecedente) {
        this.antecedente = antecedente;
    }

    public String getTendencia() {
        return tendencia;
    }

    public void setTendencia(String tendencia) {
        this.tendencia = tendencia;
    }

    public Long getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Long experiencia) {
        this.experiencia = experiencia;
    }

    public Long getForca() {
        return forca;
    }

    public void setForca(Long forca) {
        this.forca = forca;
    }

    public Long getDestreza() {
        return destreza;
    }

    public void setDestreza(Long destreza) {
        this.destreza = destreza;
    }

    public Long getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(Long constituicao) {
        this.constituicao = constituicao;
    }

    public Long getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Long inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Long getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(Long sabedoria) {
        this.sabedoria = sabedoria;
    }

    public Long getCarisma() {
        return carisma;
    }

    public void setCarisma(Long carisma) {
        this.carisma = carisma;
    }

    public Long getBonusProficiencia() {
        return bonusProficiencia;
    }

    public void setBonusProficiencia(Long bonusProficiencia) {
        this.bonusProficiencia = bonusProficiencia;
    }

    public Pericias getPericias() {
        return pericias;
    }

    public void setPericias(Pericias pericias) {
        this.pericias = pericias;
    }

}

package com.gtbr.rpg.entity;

import javax.persistence.*;

@Entity
@Table(name = "ficha_item_equipado", schema = "public")
public class FichaItemEquipado {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ficha_equipado")
    private Long idFichaItemEquipado;

    @Column(name = "id_ficha")
    private Long idFicha;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_ficha",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_ficha_item_equipado_id_ficha"))
    private Ficha ficha;

    @Column(name = "id_item")
    private Long idItem;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_item",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_ficha_item_equipado_id_item"))
    private Item item;


    public Long getIdFichaItemEquipado() {
        return idFichaItemEquipado;
    }

    public void setIdFichaItemEquipado(Long idFichaItemEquipado) {
        this.idFichaItemEquipado = idFichaItemEquipado;
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

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}

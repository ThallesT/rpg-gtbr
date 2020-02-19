package com.gtbr.rpg.entity;

import javax.persistence.*;


@Entity
@Table(name = "ficha_item", schema = "public")
public class FichaItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ficha_item")
    private Long idFichaItem;

    @Column(name = "id_ficha")
    private Long idFicha;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_ficha",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_ficha_item_id_ficha"))
    private Ficha ficha;

    @Column(name = "id_item")
    private Long idItem;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_item",insertable=false,updatable=false, foreignKey = @ForeignKey(name="fk_ficha_item_id_item"))
    private Item item;


    public Long getIdFichaItem() {
        return idFichaItem;
    }

    public void setIdFichaItem(Long idFichaItem) {
        this.idFichaItem = idFichaItem;
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

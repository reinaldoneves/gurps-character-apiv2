package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.*;

/***
 * The entity class for the <i>passive_defense<i/> .
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Embeddable
public class PassiveDefense {

    @Column(name = "shield")
    private int shield;
    @Column(name = "armor")
    private int armor;
    @Column(name = "total")
    private int total;

    @PrePersist
    protected void onCreate() {
        total = shield + armor;
    }

    @PreUpdate
    public void preUpdate() {
        total = shield + armor;
    }

}

package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.*;

/***
 * The entity class for the <i>passive_defense<i/> .
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "passive_defense")
@Table(name = "passive_defense")
public class PassiveDefense {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "shield", nullable = false)
    private int shield;
    @Column(name = "armor", nullable = false)
    private int armor;
    @Column(name = "passive_defense_total", nullable = false)
    private int passiveDefenseTotal;

    @PrePersist
    protected void onCreate() {
        passiveDefenseTotal = shield + armor;
    }

    @PreUpdate
    public void preUpdate() {
        passiveDefenseTotal = shield + armor;
    }

}

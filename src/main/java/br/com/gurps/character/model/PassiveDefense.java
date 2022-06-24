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

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "shield", nullable = false)
    private int shield;
    @Column(name = "armor", nullable = false)
    private int armor;
    @Column(name = "total", nullable = false)
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

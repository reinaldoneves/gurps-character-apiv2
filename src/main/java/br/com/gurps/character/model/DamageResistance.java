package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * The entity class for the <i>damage_resistance<i/>
 * This is the class responsible for holding the damage resistance of the character
 * Famoso RD
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "damage_resistance")
@Table(name = "damage_resistance")
public class DamageResistance {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "head", nullable = false)
    private int head;

    @Column(name = "body", nullable = false)
    private int body;

    @Column(name = "arms", nullable = false)
    private int arms;

    @Column(name = "legs", nullable = false)
    private int legs;

    @Column(name = "hands", nullable = false)
    private int hands;

    @Column(name = "foot", nullable = false)
    private int foot;

}

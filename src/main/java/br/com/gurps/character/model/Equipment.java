package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * The entity class for the <i>equipment<i/>
 * This is the class responsible for holding the equipment of the character
 * a character have a {@link java.util.List<Equipment>}
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "equipment")
@Table(name = "equipment")
public class Equipment {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "passive_defense_modifier", nullable = false)
    private Long passiveDefenseModifier;
    @Column(name = "damage_resistance", nullable = false)
    private int damageResistance;
    @Column(name = "price", nullable = false)
    private Long price;
    @Column(name = "weight", nullable = false)
    private Long weight;

}

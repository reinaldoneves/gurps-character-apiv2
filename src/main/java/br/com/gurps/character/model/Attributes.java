package br.com.gurps.character.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * The entity class for the <i>attributes<i/>
 * Class responsible for holding the Active Defenses of the character
 * Defesas ativas do personagem
 * @author reinaldo_neves@hotmail.com
 */
@Data
@AllArgsConstructor
@Embeddable
@NoArgsConstructor
public class Attributes {

    public Attributes(Long strength, Long dexterity, Long intelligence, Long health) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.health = health;
    }

    @Column(name = "strength", nullable = false)
    private Long strength;

    @Column(name = "dexterity", nullable = false)
    private Long dexterity;

    @Column(name = "intelligence", nullable = false)
    private Long intelligence;

    @Column(name = "health", nullable = false)
    private Long health;

    @Column(name = "life_points")
    private Long lifePoints = health;

    @Column(name = "fatique")
    private Long fatique = strength;

    @Column(name = "will")
    private Long will = intelligence;

    @Column(name = "perception")
    private Long perception = intelligence;

}
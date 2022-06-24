package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The entity class for the <i>attributes<i/>
 * Class responsible for holding the Active Defenses of the character
 * Defesas ativas do personagem
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "attributes")
@Table(name = "attributes")
public class Attributes {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "strength", nullable = false)
    private Long strength;

    @Column(name = "dexterity", nullable = false)
    private Long dexterity;

    @Column(name = "intelligence", nullable = false)
    private Long intelligence;

    @Column(name = "health", nullable = false)
    private Long health;

    @Column(name = "life_points", nullable = false)
    private Long lifePoints;

    @Column(name = "fatique", nullable = false)
    private Long fatique;

    @Column(name = "will", nullable = false)
    private Long will;

    @Column(name = "perception", nullable = false)
    private Long perception;

}
package br.com.gurps.character.model;

import lombok.Data;
import org.springframework.core.annotation.AliasFor;

import javax.persistence.*;

/**
 * The entity class for the <i>attributes<i/>
 * Class responsible for holding the Active Defenses of the character
 * Defesas ativas do personagem
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Embeddable
public class Attributes {

    @Column(name = "strength", nullable = false)
    private Long strength;

    @Column(name = "dexterity", nullable = false)
    private Long dexterity;

    @Column(name = "intelligence", nullable = false)
    private Long intelligence;

    @Column(name = "health", nullable = false)
    private Long health;

    @Column(name = "life_points")
    private Long lifePoints;

    @Column(name = "fatique")
    private Long fatique;

    @Column(name = "will")
    private Long will;

    @Column(name = "perception")
    private Long perception;

}
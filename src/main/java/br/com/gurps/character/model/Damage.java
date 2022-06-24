package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.*;

/***
 * The entity class for the <i>damage<i/>
 * This is the class responsible for holding the damage of the character
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Embeddable
public class Damage {

    @Column(name = "ball", nullable = false)
    private Long ball;

    @Column(name = "gdp", nullable = false)
    private Long gdp;

    @Column(name = "ball_modificator", nullable = false)
    private Long ballModificator;

    @Column(name = "gdp_modificator", nullable = false)
    private Long gdpModificator;

}

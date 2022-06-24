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
    private int ball;

    @Column(name = "gdp", nullable = false)
    private int gdp;

    @Column(name = "ball_modificator", nullable = false)
    private int ballModificator;

    @Column(name = "gdp_modificator", nullable = false)
    private int gdpModificator;

}

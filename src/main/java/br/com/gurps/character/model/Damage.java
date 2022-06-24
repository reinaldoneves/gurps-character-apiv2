package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * The entity class for the <i>damage<i/>
 * This is the class responsible for holding the damage of the character
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "damage")
@Table(name = "damage")
public class Damage {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "ball", nullable = false)
    private int ball;

    @Column(name = "gdp", nullable = false)
    private int gdp;

    @Column(name = "ball_modificator", nullable = false)
    private int ballModificator;

    @Column(name = "gdp_modificator", nullable = false)
    private int gdpModificator;

}

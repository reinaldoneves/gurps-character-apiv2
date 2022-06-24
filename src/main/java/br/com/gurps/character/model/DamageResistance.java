package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.*;

/***
 * The entity class for the <i>damage_resistance<i/>
 * This is the class responsible for holding the damage resistance of the character
 * Famoso RD
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Embeddable
public class DamageResistance {

    @Column(name = "skin")
    private int skin;

    @Column(name = "head")
    private int head;

    @Column(name = "body")
    private int body;

    @Column(name = "arms")
    private int arms;

    @Column(name = "hands")
    private int hands;

    @Column(name = "legs")
    private int legs;

    @Column(name = "foot")
    private int foot;

}

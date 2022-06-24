package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.*;

/***
 * The entity class for the <i>movement<i/>
 * This is the class responsible for holding the movement amount of the character
 * Deslocamento do personagem
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Embeddable
public class Movement {

    /**
    * velocidade básica
     */
    @Column(name = "basic_speed", nullable = false)
    private Long basicSpeed;

    /***
     * deslocamento de viagem
     */
    @Column(name = "trip_movement", nullable = false)
    private Long tripMovement;

    /***
     * deslocamento
     */
    @Column(name = "battle_movement", nullable = false)
    private Long battleMovement;

}

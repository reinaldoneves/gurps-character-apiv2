package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/***
 * The entity class for the <i>disadvantage<i/>
 * This is the class responsible for holding the disadvantage of the character
 * a character have a {@link java.util.List<Disadvantage>}
 * Desvantagens do personagem
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "disadvantage")
@Table(name = "disadvantage")
public class Disadvantage extends InnateAbilities implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne(targetEntity =CharacterEntity.class, cascade = CascadeType.DETACH)
    private Long characterId;

}

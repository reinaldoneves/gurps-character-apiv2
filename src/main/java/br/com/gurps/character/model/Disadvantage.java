package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
public class Disadvantage extends InnateAbilities {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}

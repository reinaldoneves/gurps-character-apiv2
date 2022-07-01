package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

/**
 * The entity class for the <i>advantage<i/>
 * Class responsible for holding the advantages of the character
 * Vantagens do personagem
 * @author reinaldo_neves@hotmail.com
 */
@Entity(name = "advantage")
@Table(name = "advantage")
@Data
public class Advantage extends InnateAbilities implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}

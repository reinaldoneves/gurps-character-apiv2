package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The entity class for the <i>advantage<i/>
 * Class responsible for holding the advantages of the character
 * Vantagens do personagem
 * @author reinaldo_neves@hotmail.com
 */
@Entity(name = "advantage")
@Table(name = "advantage")
@Data
public class Advantage extends InnateAbilities{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}

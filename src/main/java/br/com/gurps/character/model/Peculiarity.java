package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * The entity class for the <i>peculiarity<i/>
 * A character have a {@link java.util.List<Peculiarity>}, witch gives him a single personality
 * Peculiaridades do personagem
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "peculiarity")
@Table(name = "peculiarity")
public class Peculiarity extends InnateAbilities{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}

package br.com.gurps.character.model;

import br.com.gurps.character.enums.ExpertiseType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * The entity class for the <i>expertise<i/>
 * This is the class responsible for holding one expertise of the character
 * a character have a {@link java.util.List<Expertise>}
 * Perícias do personagem
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "expertise")
@Table(name = "expertise")
public class Expertise {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "type", nullable = false)
    private ExpertiseType type;
    //ex. Modificador (DX+2)
    @Column(name = "modifier", nullable = false)
    private Long modifier;
    @Column(name = "cost", nullable = false)
    private Long cost;
    @Column(name = "page", nullable = false)
    private int page;
    //NH - Nível de habilidade
    @Column(name = "ability_level", nullable = false)
    private int abilityLevel;

}

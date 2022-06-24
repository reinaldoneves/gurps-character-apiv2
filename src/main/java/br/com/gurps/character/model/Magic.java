package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * The entity class for the <i>magic<i/>
 * This is the class responsible for holding all magics of the character if he/she/? is a mage/sorcerer
 * a {@link Grimoire} has a {@link java.util.List<Magic>}
 * Magias do personagem
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "magic")
@Table(name = "magic")
public class Magic {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "ability_level", nullable = false)
    private Long abilityLevel;

    @Column(name = "magic_class", nullable = false)
    private String magicClass;

    @Column(name = "magic_school", nullable = false)
    private String magicSchool;

    @Column(name = "operation_time", nullable = false)
    private int operationTime;

    @Column(name = "duration", nullable = false)
    private int duration;

    @Column(name = "energy_cost", nullable = false)
    private int energyCost;

    @Column(name = "page", nullable = false)
    private int page;

}

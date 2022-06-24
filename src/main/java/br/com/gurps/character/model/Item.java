package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/***
 * The entity class for the <i>equipment<i/>
 * This is the class responsible for holding the itens of the character
 * a character have a {@link java.util.List<Item>}
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "item")
@Table(name = "item")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne(targetEntity =CharacterEntity.class, cascade = CascadeType.DETACH)
    private Long characterId;
    @Column(name = "name", nullable = false)
    private String name;
    @Lob
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "passive_defense_modifier")
    private Long passiveDefenseModifier;
    @Column(name = "damage_resistance")
    private int damageResistance;
    @Column(name = "price")
    private Long price;
    @Column(name = "weight", nullable = false)
    private Long weight;

}

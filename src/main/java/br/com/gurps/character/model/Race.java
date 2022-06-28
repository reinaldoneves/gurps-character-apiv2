package br.com.gurps.character.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import java.io.Serializable;

/***
 * The entity class for the <i>race<i/> .
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "race")
@Table(name = "race")
@Builder
public class Race implements Serializable {

  private static final long serialVersionUID = 1L;

  public Race() {
  }

  @Id
  @SequenceGenerator(
          name = "character_sequence",
          sequenceName = "character_sequence",
          allocationSize = 1
  )
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "character_sequence"
  )
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "cost", nullable = false)
  private int cost;

  @Column(name = "name")
  private String name;

  @Lob
  @Column(name = "appearance", nullable = false)
  private String appearance;

  @Column(name = "page")
  private int page;

  @Column(name = "st_modifier")
  private Long stModifier;

  @Column(name = "dx_modifier")
  private Long dxModifier;

  @Column(name = "iq_modifier")
  private Long iqModifier;

  @Column(name = "ht_modifier")
  private Long htModifier;

  @Column(name = "fatique_modifier")
  private Long fatiqueModifier;

  @Column(name = "damage_resistance_modifier")
  private Long damageResistanceModifier;

  @Column(name = "movement_modifier")
  private Long movementModifier;

}

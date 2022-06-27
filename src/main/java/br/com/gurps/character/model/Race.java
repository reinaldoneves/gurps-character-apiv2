package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/***
 * The entity class for the <i>race<i/> .
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "race")
@Table(name = "race")
public class Race implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
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

}

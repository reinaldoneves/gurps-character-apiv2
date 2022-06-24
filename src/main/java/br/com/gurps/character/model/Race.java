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

  @Column(name = "name", nullable = false)
  private String name;

  @Lob
  @Column(name = "appearance", nullable = false)
  private String appearance;

  @Column(name = "page", nullable = false)
  private int page;

  @Column(name = "st_modifier", nullable = false)
  private Long stModifier;

  @Column(name = "dx_modifier", nullable = false)
  private Long dxModifier;

  @Column(name = "iq_modifier", nullable = false)
  private Long iqModifier;

  @Column(name = "ht_modifier", nullable = false)
  private Long htModifier;

}

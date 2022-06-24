package br.com.gurps.character.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The entity class for the <i>active_defense<i/>
 * Class responsible for holding the Active Defenses of the character
 * Defesas ativas do personagem
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "active_defense")
@Table(name = "active_defense")
public class ActiveDefense {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * Esquiva
     * */
    @Column(name = "dodge", nullable = false)
    private int dodge;
    /**
     * Aparar
     * */
    @Column(name = "trim", nullable = false)
    private int trim;
    /**
     * Bloqueio
     * */
    @Column(name = "block", nullable = false)
    private int block;

}

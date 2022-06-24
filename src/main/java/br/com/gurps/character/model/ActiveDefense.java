package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.*;

/**
 * The entity class for the <i>active_defense<i/>
 * Class responsible for holding the Active Defenses of the character
 * Defesas ativas do personagem
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Embeddable
public class ActiveDefense {

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

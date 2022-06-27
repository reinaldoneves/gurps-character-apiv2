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
    @Column(name = "dodge")
    private Long dodge;
    /**
     * Aparar
     * */
    @Column(name = "trim")
    private Long trim;
    /**
     * Bloqueio
     * */
    @Column(name = "block")
    private Long block;

}

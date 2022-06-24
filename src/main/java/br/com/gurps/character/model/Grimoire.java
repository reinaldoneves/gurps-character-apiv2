package br.com.gurps.character.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/***
 * The entity class for the <i>grimoire<i/>
 * This is the class responsible for holding one grimoire of the character if he is a mage/sorcerer
 * a {@link Grimoire} has a {@link List<Magic>}
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Embeddable
public class Grimoire {

    @Column(name = "magic")
    @OneToMany(mappedBy = "id", cascade = CascadeType.DETACH)
    private List<Magic> magicList = new ArrayList<>();

}

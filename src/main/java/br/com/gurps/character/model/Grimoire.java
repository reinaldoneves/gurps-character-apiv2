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
@Entity(name = "grimoire")
@Table(name = "grimoire")
public class Grimoire {

    @Id
    @Column(name = "id")
    private Long id;

    //generated by JPA Buddy
    @ElementCollection
    @Column(name = "magic")
    @CollectionTable(name = "magic_list", joinColumns = @JoinColumn(name = "id"))
    private List<Magic> magics = new ArrayList<>();

//    @Column(name = "magic_list", nullable = false)
//    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
//    List<Magic> magicList;


}

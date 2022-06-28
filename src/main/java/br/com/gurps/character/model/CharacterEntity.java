package br.com.gurps.character.model;

import br.com.gurps.character.enums.Gender;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/***
 * The entity class for the <i>character_entity<i/> .
 * @author reinaldo_neves@hotmail.com
 */
@Builder
@Entity(name = "character_entity")
@Table(name = "character_entity")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CharacterEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

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

    @Column(name="player_id", nullable = false)
    private Long playerId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;

    @Lob
    @Column(name = "history", nullable = false)
    private String history;

    @Column(name = "created_on")
    @DateTimeFormat
    private LocalDateTime createdOn;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "id",
            referencedColumnName = "id",
            insertable = false,
            updatable = false
    )
    private Race race;

    @Column(name = "appearance", nullable = false)
    private String appearance;

    @Embedded
    private Attributes atributtes;

    @Embedded
    private Damage damage;

    @Embedded
    private PassiveDefense passiveDefense;

    @Embedded
    private ActiveDefense activeDefense;

    @Embedded
    private DamageResistance damageResistance;

    @Embedded
    private Movement movement;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "characters_itens_map",
            joinColumns = @JoinColumn(
                    name = "character_id",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "item_id",
                    referencedColumnName = "id"
            )
    )
    private List<Expertise> expertises = new ArrayList<>();


    @ManyToMany(
            cascade = CascadeType.DETACH
    )
    @JoinTable(
            name = "characters_advantages_map",
            joinColumns = @JoinColumn(
                    name = "character_id",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "advantage_id",
                    referencedColumnName = "id"
            )
    )
    private List<Advantage> advantages;

    @ManyToMany(
            cascade = CascadeType.DETACH
    )
    @JoinTable(
            name = "characters_disadvantages_map",
            joinColumns = @JoinColumn(
                    name = "character_id",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "disadvantage_id",
                    referencedColumnName = "id"
            )
    )
    private List<Disadvantage> disadvantages;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "characters_peculiarities_map",
            joinColumns = @JoinColumn(
                    name = "character_id",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "item_id",
                    referencedColumnName = "id"
            )
    )
    private List<Peculiarity> peculiarities;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "characters_itens_map",
            joinColumns = @JoinColumn(
                    name = "character_id",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "item_id",
                    referencedColumnName = "id"
            )
    )
    private List<Item> itemList;

    @ManyToMany(
            cascade = CascadeType.DETACH
    )
    @JoinTable(
            name = "characters_grimoire_map",
            joinColumns = @JoinColumn(
                    name = "character_id",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "magic_id",
                    referencedColumnName = "id"
            )
    )
    List<Magic> grimoire = new ArrayList<Magic>();

    @Column(name = "is_alive", nullable = false)
    private boolean isAlive;

    @Column(name = "is_awake", nullable = false)
    private boolean isAwake;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @PrePersist
    protected void onCreate() {
        createdOn = LocalDateTime.now();
        isAlive = true;
        isAwake = true;

        Long basicMovement = atributtes.getDexterity()+atributtes.getHealth()/4;
        this.getActiveDefense().setDodge((long) basicMovement.intValue());
        this.getMovement().setBattleMovement(basicMovement);
        this.getMovement().setTripMovement(basicMovement);
        this.getMovement().setBasicSpeed(basicMovement);
    }

    @PreUpdate
    protected void onUpdate() {
        //TODO: calculate the dodge on update the list of the equipments
    }

}

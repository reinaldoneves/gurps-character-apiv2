package br.com.gurps.character.model;

import br.com.gurps.character.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/***
 * The entity class for the <i>character_entity<i/> .
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "character_entity")
@Table(name = "character_entity")
public class CharacterEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "created_on", nullable = false)
    private LocalDate createdOn;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="race_id", nullable = false,
            referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_race"))
    @Transient
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

    /***
     * TODO: watch nelson course and discover how to reference super classes in JPA
     * https://www.youtube.com/watch?v=XszpXoII9Sg&ab_channel=DailyCodeBuffer
     */
    @OneToMany(mappedBy = "id", cascade = CascadeType.DETACH)
    private List<Expertise> expertises = new ArrayList<>();

    @OneToMany(mappedBy = "id", cascade = CascadeType.DETACH)
    private List<Advantage> advantages;

    @OneToMany(mappedBy = "id", cascade = CascadeType.DETACH)
    private List<Disadvantage> disadvantages;

    @OneToMany(mappedBy = "id", cascade = CascadeType.DETACH)
    private List<Peculiarity> peculiarities;

    @OneToMany(mappedBy = "id", cascade = CascadeType.DETACH)
    private List<Item> equipmentList;

    @Embedded
    private Grimoire grimoire;

    @Column(name = "is_alive", nullable = false)
    private boolean isAlive;

    @Column(name = "is_awake", nullable = false)
    private boolean isAwake;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Long getId() {
        return id;
    }

    @PrePersist
    protected void onCreate() {
        createdOn = LocalDate.now();
        isAlive = true;
        isAwake = true;

        Long basicMovement = atributtes.getDexterity()+atributtes.getHealth()/4;
        this.activeDefense.setDodge((long) basicMovement.intValue());
        this.movement.setBattleMovement(basicMovement);
        this.movement.setTripMovement(basicMovement);
        this.movement.setBasicSpeed(basicMovement);
    }

    @PreUpdate
    protected void onUpdate() {
        //TODO: calculate the dodge on update the list of the equipments
    }

}

package br.com.gurps.character.model;

import br.com.gurps.character.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/***
 * The entity class for the <i>character_entity<i/> .
 * @author reinaldo_neves@hotmail.com
 */
@Data
@Entity(name = "character_entity")
@Table(name = "character_entity")
public class CharacterEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Race race;

    @Column(name = "appearance", nullable = false)
    private String appearance;

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
    private List<Expertise> expertises;

    @OneToMany(mappedBy = "id")
    private List<Advantage> advantages;

    @OneToMany(mappedBy = "id")
    private List<Disadvantage> disadvantages;

    @OneToMany(mappedBy = "id")
    private List<Peculiarity> peculiarities;

    @OneToMany(mappedBy = "id")
    private List<Equipment> equipment;

    @Embedded
    private Grimoire grimoire;

    @Column(name = "is_alive", nullable = false)
    private boolean isAlive;

    @Column(name = "is_awake", nullable = false)
    private boolean isAwake;

    @Column(name = "gender", nullable = false)
    private Gender gender;

    @PrePersist
    protected void onCreate() {
        createdOn = LocalDate.now();
        isAlive = true;
        isAwake = true;
    }

}

package br.com.gurps.character.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.List;

/***
 * A abstract class to represent the <i>innate abilities<i/> of the character,
 * witch can be a {@linkplain Disadvantage}, {@linkplain Advantage} or {@linkplain Peculiarity}
 */
public abstract class InnateAbilities {

    private String name;
    private int cost;
    @Lob
    private String description;
    private int page;

}

package br.com.gurps.character.model;

import java.util.List;

/***
 * A abstract class to represent the <i>innate abilities<i/> of the character,
 * witch can be a {@linkplain Disadvantage}, {@linkplain Advantage} or {@linkplain Peculiarity}
 */
public abstract class InnateAbilities {

    private String name;
    private int cost;
    private List<String> description;
    private int page;

}

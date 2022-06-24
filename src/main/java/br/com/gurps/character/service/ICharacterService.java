package br.com.gurps.character.service;

import br.com.gurps.character.model.CharacterEntity;

import java.util.List;

public interface ICharacterService {

    /**
     * Returns the character based on the given id
     **/
    CharacterEntity getCharacterById(Long id);

    /**
     * return true if the character is alive or false otherwise.
     **/
    boolean isAlive(Long id);

    /***
     * Retrieve the {@link List<CharacterEntity>} of all characters
     */
    List<CharacterEntity> getAllCharacters();

    /***
     * Retrieve the {@link List<CharacterEntity>} of all characters of a given player
     * @param id the id of the player
     * A NPC must belong to the player GM, and GM must have an id like any player
     */
    List<CharacterEntity> getCharactersByPlayerId(Long playerId);

    /***
     * The born of the character
     * @param characterEntity
     */
    CharacterEntity createCharacter(CharacterEntity characterEntity);

    /***
     * Update the character
     * @param characterEntity
     */
    CharacterEntity updateCharacter(CharacterEntity characterEntity);

    /***
     * Kill the character setting the isAlive to false
     * @param id
     */
    @Deprecated
    void killCharacter(Long id);

    /***
     * Returns true if the character is awake
     */
    boolean isAwake(Long id);

}

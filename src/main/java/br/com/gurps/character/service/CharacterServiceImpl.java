package br.com.gurps.character.service;
import br.com.gurps.character.model.CharacterEntity;
import br.com.gurps.character.repo.CharacterRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CharacterServiceImpl implements ICharacterService {

    private final CharacterRepo repository;

    @Autowired
    public CharacterServiceImpl(CharacterRepo repository) {
        this.repository = repository;
    }

    @Override
    public CharacterEntity getCharacterById(Long id) {
        log.info("Looking for character with id {}", id);
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean isAlive(Long id) {
        log.info("Looking if character with id {} is alive", id);
        //TODO: refactor this logic. The character must existsById and isAlive must be true
        return repository.existsById(id);
    }

    @Override
    public List<CharacterEntity> getAllCharacters() {
        return repository.findAll();
    }

    @Override
    public List<CharacterEntity> getCharactersByPlayerId(Long playerId) {
        log.info("Looking for characters for the player with id {}", playerId);
        return repository.findAllByPlayerId(playerId);
    }

    @Override
    public CharacterEntity createCharacter(CharacterEntity characterEntity) {
        log.info("A new hero shall born today! And his/shes/it name is {}", characterEntity.getName());
        return repository.save(characterEntity);
    }

    @Override
    public CharacterEntity updateCharacter(CharacterEntity characterEntity) {
        log.info("Updating character: {}", characterEntity.getName());
        return repository.save(characterEntity);
    }

    /**Kill character is the same that update it and set isAlive to false.
     * If the character's LP(life points) is lower than (HT*10)*-1, than he's dead!
     */
    @Override
    public void killCharacter(Long id) {
        throw new UnsupportedOperationException("You've reached killCharacter(Long id) @ CharacterServiceImpl.java Jack, but it is not supported yet.");
    }

    @Override
    public boolean isAwake(Long id) {
        throw new UnsupportedOperationException("You've reached isAwake(Long id) @ CharacterServiceImpl.java Jack, but it is not supported yet.");
    }
}

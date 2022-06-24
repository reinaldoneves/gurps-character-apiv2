package br.com.gurps.character.service;
import br.com.gurps.character.model.CharacterEntity;
import br.com.gurps.character.repo.CharacterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements ICharacterService {

    private final CharacterRepo repository;

    @Autowired
    public CharacterServiceImpl(CharacterRepo repository) {
        this.repository = repository;
    }

    @Override
    public CharacterEntity getCharacterById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean isAlive(Long id) {
        return repository.existsById(id);
    }

    @Override
    public List<CharacterEntity> getAllCharacters() {
        return repository.findAll();
    }

    @Override
    public List<CharacterEntity> getCharactersByPlayerId(Long id) {
        return repository.findAllByPlayerId(id);
    }

    @Override
    public CharacterEntity createCharacter(CharacterEntity characterEntity) {
        return repository.save(characterEntity);
    }

    @Override
    public CharacterEntity updateCharacter(CharacterEntity characterEntity) {
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

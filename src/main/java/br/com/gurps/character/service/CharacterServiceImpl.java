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
//        throw new UnsupportedOperationException("You've reached getCharacterById(Long id) method @ CharacterServiceImpl.java Jack, but it is not supported yet.");
    }

    @Override
    public boolean isAlive(Long id) {
        return repository.existsById(id);
//        throw new UnsupportedOperationException("You've reached isAlive() @ CharacterServiceImpl.java Jack, but it is not supported yet.");
    }

    @Override
    public List<CharacterEntity> getAllCharacters() {
        return repository.findAll();
//        throw new UnsupportedOperationException("You've reached getAllCharacters() @ CharacterServiceImpl.java Jack, but it is not supported yet.");
    }

    @Override
    public List<CharacterEntity> getPlayersByCharacterId(Long id) {
        return repository.findAllCharacterByPalyerId(id);
//        throw new UnsupportedOperationException("You've reached getPlayersCharacters(Long id) @ CharacterServiceImpl.java Jack, but it is not supported yet.");
    }

    @Override
    public CharacterEntity createCharacter(CharacterEntity characterEntity) {
        return repository.save(characterEntity);
//        throw new UnsupportedOperationException("You've reached createCharacter(CharacterEntity characterEntity) @ CharacterServiceImpl.java Jack, but it is not supported yet.");
    }

    @Override
    public CharacterEntity updateCharacter(CharacterEntity characterEntity) {
        return repository.save(characterEntity);
//        throw new UnsupportedOperationException("You've reached updateCharacter(CharacterEntity characterEntity) @ CharacterServiceImpl.java Jack, but it is not supported yet.");
    }

    /**Kill character is the same that update it and set isAlive to false.
     *
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

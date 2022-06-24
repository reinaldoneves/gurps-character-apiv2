package br.com.gurps.character.repo;

import br.com.gurps.character.model.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharacterRepo extends JpaRepository<CharacterEntity,Long> {

    void deleteCharacterById(Long id);
    Optional<CharacterEntity> findCharacterById(Long id);
    Optional<CharacterEntity> findCharacterByName(String name);
    List<CharacterEntity> findAllByPalyerId(Long playerId);

}

package br.com.gurps.character.repo;

import br.com.gurps.character.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepo extends JpaRepository<Race,Long> {
}

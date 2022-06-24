package br.com.gurps.character;

import br.com.gurps.character.service.CharacterServiceImpl;
import br.com.gurps.character.model.CharacterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/character")
public class CharacterResource {
     private final CharacterServiceImpl service;

    @Autowired
    public CharacterResource(CharacterServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CharacterEntity>> getAllCharacters(){
        List<CharacterEntity> allCharacters = service.getAllCharacters();
        return new ResponseEntity<>(allCharacters, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<CharacterEntity> getCharacterById(@PathVariable("id") Long id){
        CharacterEntity character = service.getCharacterById(id);
        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<CharacterEntity> addCharacter(@RequestBody CharacterEntity character){
        CharacterEntity newCharacter = service.createCharacter(character);
        return new ResponseEntity<>(newCharacter, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<CharacterEntity> updateCharacter(@RequestBody CharacterEntity character){
        CharacterEntity updatedCharacter = service.updateCharacter(character);
        return new ResponseEntity<>(updatedCharacter, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> killCharacter(@PathVariable("id") Long id){
        service.killCharacter(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

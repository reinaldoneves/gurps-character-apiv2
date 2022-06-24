package br.com.gurps.character.exception;

public class CharacterNotFoundException extends RuntimeException {
    public CharacterNotFoundException(String message) {
        super(message);
    }
}

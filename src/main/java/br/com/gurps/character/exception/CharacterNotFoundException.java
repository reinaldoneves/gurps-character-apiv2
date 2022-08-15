package br.com.gurps.character.exception;

//public class CharacterNotFoundException extends RuntimeException {
////    public CharacterNotFoundException(String message) {
////        super(message);
////    }
//}

import lombok.Getter;

@Getter
public class CharacterNotFoundException extends GeneralException {

    public CharacterNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(resourceName,
                fieldName,
                fieldValue,
                String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
    }
}

package br.com.gurps.character.validator;

import java.util.function.Predicate;

public interface GenericValidator <Value extends Number>{

    boolean dispute(Value challenger, Value target);
}

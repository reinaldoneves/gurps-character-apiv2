package br.com.gurps.character;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * Class responsible for starting the Character application
 * @author Reinaldo Neves (reinaldo_neves@hotmail.com)
 * @version 2.0
 * A Steve Jackson Generic Universal role playing Third edition game implementation exercise.
 * @link https://1drv.ms/b/s!AlWQNTQVM0lyhJo5B4BAXaDRDHBGQA
 */
@SpringBootApplication
public class CharacterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharacterAppApplication.class, args);
	}

}

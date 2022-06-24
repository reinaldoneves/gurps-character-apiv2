package br.com.gurps.character;

import br.com.gurps.character.model.CharacterEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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

	@Bean
	CommandLineRunner commandLineRunner(
//			StudentRepository studentRepository,
//			StudentIdCardRepository studentIdCardRepository
		) {
		return args -> {
//			Faker faker = new Faker();

			CharacterEntity newChar = new CharacterEntity();

			//TODO: Fill the new character with his life and attributes and etc.
//			String firstName = faker.name().firstName();
//			String lastName = faker.name().lastName();
//			String email = String.format("%s.%s@amigoscode.edu", firstName, lastName);

//			Student student = new Student(
//					firstName,
//					lastName,
//					email,
//					faker.number().numberBetween(17, 55));
//					email,
//					faker.number().numberBetween(17, 55));

//			studentRepository.save(student);

//			studentRepository.findById(1L)
//					.ifPresent(s -> {
//						System.out.println("fetch book lazy...");
//						List<Book> books = student.getBooks();
//						books.forEach(book -> {
//							System.out.println(
//									s.getFirstName() + " borrowed " + book.getBookName());
//						});
//					});

		};
	}

}

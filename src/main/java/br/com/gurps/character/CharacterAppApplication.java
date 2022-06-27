package br.com.gurps.character;

import br.com.gurps.character.model.CharacterEntity;
import br.com.gurps.character.model.Race;
import br.com.gurps.character.repo.CharacterRepo;
import br.com.gurps.character.repo.RaceRepo;
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
	CommandLineRunner commandLineRunner(RaceRepo raceRepository, CharacterRepo characterRepository) {
		return args -> {

			//Create a race Dwarf
			Race dwarf = new Race();
			dwarf.setName("Dwarf");
			dwarf.setAppearance("Short beardad men like frowning sulky creature." +
					"\n No taller than a ten old regular kid.");
			dwarf.setCost(30);
			dwarf.setPage(40);
			dwarf.setStModifier(2L);
			dwarf.setHtModifier(2L);
			dwarf.setIqModifier(-2L);

			raceRepository.save(dwarf);

			//Create a race Elf
			Race elf = new Race();
			elf.setName("Dwarf");
			elf.setAppearance("Short beardad men like frowning sulky creature." +
					"\n No taller than a ten old regular kid.");
			elf.setCost(30);
			elf.setPage(40);
			elf.setStModifier(2L);
			elf.setHtModifier(2L);
			elf.setIqModifier(-2L);

			//Create a character
			CharacterEntity newChar = new CharacterEntity();
			newChar.setRace(elf);



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

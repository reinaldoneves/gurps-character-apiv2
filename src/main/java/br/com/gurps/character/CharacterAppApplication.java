package br.com.gurps.character;

import br.com.gurps.character.model.ActiveDefense;
import br.com.gurps.character.model.Attributes;
import br.com.gurps.character.model.CharacterEntity;
import br.com.gurps.character.model.Race;
import br.com.gurps.character.repo.CharacterRepo;
import br.com.gurps.character.repo.RaceRepo;
import org.springframework.beans.factory.annotation.Autowired;
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

//	@Bean
//	CommandLineRunner commandLineRunner(RaceRepo raceRepository, CharacterRepo characterRepository) {
//		return args -> {
//
//			//Create a race Dwarf
//			Race dwarf = new Race();
//			dwarf.builder()
//					.name("Dwarf")
//					.description("Dwarves are a race of miners, met-\n" +
//					"alworkers, and craftsmen. They live underground, which is their workplace\n" +
//					"and protection from enemies. Dwarves are small but strong and enduring,\n" +
//					"with highly developed combat skills.\n" +
//					"They may become alchemists or specialize in enchanting, if they are magically gifted, but few dwarves practice\n" +
//					"other sorts of magic."+ "\nMany have Magic Resistance.\n" +
//					"Dwarves might be only 2/3 as tall as humans, but they are much longer-lived, with a nose for gold and a flair\n" +
//					"for all forms of craftsmanship.\n" +
//					"Dwarves often live in underground halls, and their eyes are adapted to dim\n" +
//					"light. Many dwarves have Miserliness, but this is not a racial trait.")
//					.cost(30)
//					.page(107)
//					.stModifier(2L)
//					.htModifier(2L)
//					.dxModifier(0L)
//					.iqModifier(-2L)
//					.damageResistanceModifier(2L)
//					.movementModifier(-1L);
//
//			raceRepository.save(dwarf);
//
//			//Create a race Elf
//			Race elf = new Race();
//			dwarf.builder()
//					.name("Elf")
//					.description("Elves are slender, long-lived humanoids. Most Elves live in\n" +
//					"small tribes (20 to 100 members) apart from the lands of men.\n" +
//					"They multiply slowly; the teeming hordes of men and Orcs are a\n" +
//					"great threat to their existence. All Elves are of the same basic\n" +
//					"race, but tribal habits differ greatly.")
//					.cost(40)
//					.page(120)
//					.stModifier(-1L)
//					.dxModifier(1L)
//					.htModifier(2L)
//					.iqModifier(1L)
//					.movementModifier(-1L);
//
//			raceRepository.save(elf);
//
//			//Create a race Human
//			Race human = new Race();
//			human.builder()
//					.name("Human")
//					.description("A lost and fuzzy big monkey calling it self a political animal. Destroys the planet and slaves other creatures in the name of ''God'' ")
//					.cost(0)
//					.stModifier(0L)
//					.dxModifier(0L)
//					.htModifier(0L)
//					.iqModifier(0L)
//					.page(115)
//					.movementModifier(-1L);
//
//			raceRepository.save(human);
//
//			//Create the three basic characters
//			CharacterEntity newChar = new CharacterEntity();
//			newChar.builder().race(human)
//					.appearance("A tall beatiful men with browned eyes and long hair")
//					.age(27)
//					.atributtes(
//					new Attributes(12L,12L,10L,12L));
//
//			characterRepository.save(newChar);
//
//		};
//	}
}

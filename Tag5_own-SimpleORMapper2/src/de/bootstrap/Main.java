package de.bootstrap;

import de.sopra.persistence.PersonRepository;
import de.sopra.persistence.PersonRepositoryMariaDBImpl;
import de.sopra.services.PersonServiceImpl;

public class Main {

	public static void main(String[] args) {
		try (PersonRepository repository = new PersonRepositoryMariaDBImpl()) {
			PersonServiceImpl personService = new PersonServiceImpl(repository);
			personService.tuewas();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

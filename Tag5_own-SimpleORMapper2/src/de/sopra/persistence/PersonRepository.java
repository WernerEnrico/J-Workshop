package de.sopra.persistence;

import java.util.List;

import de.sopra.persistence.models.Person;

public interface PersonRepository extends AutoCloseable{
	
	public void save(Person person) throws Exception;
	public void update(Person person)  throws Exception;
	public void remove(Person person)  throws Exception;
	public void remove(int id)  throws Exception;
	
	public Person findByPrimaryKey(int id)  throws Exception;
	public List<Person> findAll() throws Exception;
	public List<Person> findByVorname(String vorname)  throws Exception;
	public List<Person> findByNachname(String nachname)  throws Exception;
	

}

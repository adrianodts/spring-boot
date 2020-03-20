package br.com.adrianodts.cursos.java.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.adrianodts.cursos.java.springboot.exception.ResourceNotFoundException;
import br.com.adrianodts.cursos.java.springboot.model.Person;
import br.com.adrianodts.cursos.java.springboot.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;
		
	public Person getPersonById(Long id) {
		return personRepository.findById(id).orElseThrow(()
				-> new ResourceNotFoundException("No records found for this ID"));
	}

	public List<Person> getAllPerson() {
		return personRepository.findAll();
	}

	public Person create(Person person) {
		return personRepository.save(person);
	}

	public Person update(Person person) {
		Person entity = getPersonById(person.getId());
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		personRepository.save(entity);
		return entity;
	}

	public void delete(Long id) {
		Person entity = getPersonById(id);
		personRepository.delete(entity);
	}
}

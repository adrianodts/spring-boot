package br.com.adrianodts.cursos.java.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adrianodts.cursos.java.springboot.model.Person;
import br.com.adrianodts.cursos.java.springboot.services.PersonService;

@RestController
@RequestMapping("person")
public class PersonController {

	@Autowired
	PersonService personService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> getAllPerson() {		
		return personService.getAllPerson();
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Person getPersonById(@PathVariable(name="id") Long id) {		
		return personService.getPersonById(id);
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person create(@RequestBody Person person) {		
		return personService.create(person);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person update(@RequestBody Person person) {		
		return personService.update(person);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable(name="id") Long id) {		
		personService.delete(id);
	}
	
}

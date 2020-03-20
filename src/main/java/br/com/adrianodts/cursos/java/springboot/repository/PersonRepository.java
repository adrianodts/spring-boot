package br.com.adrianodts.cursos.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.adrianodts.cursos.java.springboot.model.Person;

@Repository 
public interface PersonRepository extends JpaRepository<Person, Long> {

}

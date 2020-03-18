package br.com.adrianodts.cursos.java.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedCalculadoraException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public UnsuportedCalculadoraException(String message) {
		super(message);
	}
	
}

package br.com.adrianodts.cursos.java.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.adrianodts.cursos.java.springboot.exception.UnsuportedCalculadoraException;

@RestController
public class CalculadoraController {

	@GetMapping("/calculadora/numberOne/{numberOne}/numberTwo/{numberTwo}")
	public Double greeting(@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo) {
		try {			
			System.out.println(numberOne);
			System.out.println(numberTwo);
			return Double.parseDouble(numberOne) + Double.parseDouble(numberTwo);
		}catch(NumberFormatException e) {
			throw new UnsuportedCalculadoraException("Dados inválidos!");
		}
	}
}

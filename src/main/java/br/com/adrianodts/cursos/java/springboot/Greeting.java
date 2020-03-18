package br.com.adrianodts.cursos.java.springboot;

public class Greeting {
	private final Long id;
	private final String content;
	
	public Long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	public Greeting(long l, String content) {
		super();
		this.id = l;
		this.content = content;
	}
}

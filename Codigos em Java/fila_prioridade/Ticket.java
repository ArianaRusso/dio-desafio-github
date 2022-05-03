package com.arianarusso.fila_prioridade;

public class Ticket {
	
	//atributos da classe
	public String nome;
	public Tipo prioridade; 
	
	//construtor
	public Ticket(String nome, Tipo tipo) {
		super();
		this.nome= nome;
		this.prioridade = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome= nome;
	}
	
	public Tipo getPrioridade() {
		return prioridade;
	}

}

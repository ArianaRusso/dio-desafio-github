package com.arianarusso.fila_prioridade;

import java.util.Arrays;

public class FilaPrioridade {
	private Ticket[] tickets;
	private int tamanho;
	private int capacidade;
	
	//construtor
	public FilaPrioridade(int capacidade) {
		this.tamanho=0;
		this.capacidade= capacidade;
		this.tickets= new Ticket[this.capacidade];
	}
	//construtor
	public FilaPrioridade() {
		this(10);
	}
	
	public boolean ehVazia() {
		return this.tamanho==0;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public void enfileira(Ticket t) {
		if(this.capacidade == this.tamanho) {
			throw new RuntimeException("A fila esta cheia");
		}
		this.tickets[this.tamanho++]= t;
	}
	
	public Ticket desenfileira() {
		if(this.ehVazia()) {
			throw new RuntimeException("A fila esta vazia");
		}
		int indice= this.buscaMaiorPrioridade();
		Ticket altaPrioridade= this.tickets[indice];
		for(int i=indice; i<this.getTamanho()-1; i++) {
			this.tickets[i]= this.tickets[i+1];
		}
		this.tamanho--;
		return altaPrioridade;
	}
	
	private int buscaMaiorPrioridade() {
		int p=0;
		for(int i=0; i<this.getTamanho(); i++) {
			if (this.tickets[i].getPrioridade().valor < this.tickets[p].getPrioridade().valor) {
				p=i;
			}
		}
		return p;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.tickets);
	}
	
}

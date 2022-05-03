package com.arianarusso.fila_prioridade;

public enum Tipo {//ENUMERADOR
	IDOSO(0), GESTANTE(1), CRIANCA(2), DEMAIS(3);
	
	public int valor;
	
	private Tipo(int valor) {
		this.valor= valor; 
	}

}

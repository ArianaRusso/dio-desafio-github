package com.arianarusso.pilha_caminhao;

public class Pedido {
	private String produto;
	private int distanciaDaCentral;
	
	//construtor
	public Pedido(String produto, int distanciaDaCentral) {
		super();
		this.produto= produto;
		this.distanciaDaCentral= distanciaDaCentral;
	}
	
	//gets e sets
	public String getProduto() {
		return produto;
	}
	
	public void setProduto(String produto) {
		this.produto= produto;
	}
	
	public int getDistanciaDaCentral() {
		return distanciaDaCentral;
	}
	
	public void setDistanciaDaCentral(int distanciaDaCentral) {
		this.distanciaDaCentral= distanciaDaCentral;
	}

}

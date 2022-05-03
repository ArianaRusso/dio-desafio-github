package com.arianarusso.pilha_caminhao;

public class CarregaCaminhao {
	public static void main(String[] args) {
		ListaPedidos lista= new ListaPedidos();
		while(!lista.finalizou())
			System.out.println(lista.getPedido().getProduto());//produtos desempilhados
	}

}

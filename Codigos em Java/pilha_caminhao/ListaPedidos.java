package com.arianarusso.pilha_caminhao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaPedidos {
	
	private ArrayList<Pedido> pedidos= new ArrayList<Pedido>();
	
	public ListaPedidos() {
		pedidos.add(new Pedido("computador", 10));
		pedidos.add(new Pedido("TV", 5));
		pedidos.add(new Pedido("rack", 8));
		pedidos.add(new Pedido("cadeira", 14));
		pedidos.add(new Pedido("camera", 20));
		
		Collections.sort(pedidos, Comparator.comparing(Pedido::getDistanciaDaCentral));
	}
	
	//removendo os pedidos para serem armazenados no caminhão
	public Pedido getPedido() {
		return pedidos.remove(pedidos.size()-1);//removendo pelo final
	}
	
	public boolean finalizou() {
		return pedidos.isEmpty();
	}

}

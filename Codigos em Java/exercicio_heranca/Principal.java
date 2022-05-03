package exercicio_heranca;

import java.util.ArrayList;
import java.util.List;

public class Principal {

//	public static void main(String[] args) {
//		
//		List<Forma2d> formas = List.of(
//				
//			new Quadrado (10),	
//			new Triangulo (5,10),	
//			new Circulo (5),
//			new Retangulo (7,5)
//			
//				);
//		
//		System.out.println("\n ---Lista de Formas ---");
//		System.out.println(formas);
//		
//		
//
//	}
	
	public static int somarAreas(List<Forma2d> listaDeFormas) {
		int soma = 0;
		for (Forma2d forma : listaDeFormas) {
			soma += forma.calcularArea();
		}
		return soma;
	}
	
	public static void main(String[] args) {
		
		Forma2d minhaForma = new Quadrado(10);
		Forma2d minhaOutraForma = new Triangulo(4, 6);
		Forma2d maisUma = new Circulo(5);
		
		List<Forma2d> listaComFormas = new ArrayList<Forma2d>();
		
		listaComFormas.add(minhaForma);
		listaComFormas.add(minhaOutraForma);
		listaComFormas.add(maisUma);
		
		int soma = somarAreas(listaComFormas);
		
		System.out.println("soma total das areas: " + soma);
	}


}

package ordenação_simples;


import java.util.Scanner;

public class ExercicioOrdenacao {

	//Adicione uma classe Trabalhador, com os atributos: nome, salario e id. 
	//Armazene em um array de objetos e ordene-o pelo valor de id.

	public static void bublleSort(Trabalhador[] lista) {

		int auxiliar;

		for(int i= 0; i < lista.length-1; i++) {	
			for(int j= 0; j < lista.length; j++){
				if (lista[i].id > lista[i+1].id) {
					auxiliar= lista[i].id;
					lista[i].id= lista[i+1].id;
					lista[i+1].id= auxiliar;
				}

			}
		}
		
	}
	
	
private static void exibir(Trabalhador[] lista) {
		for(int i=0;i<lista.length;i++){
			System.out.print(lista[i]+" ");
		}
		System.out.println("");
	}

public static void main(String[] args) {

	Trabalhador [] lista = new Trabalhador[3];

	Scanner teclado= new Scanner(System.in);

	int contador= 0;

	while(contador<lista.length) {
		System.out.println("Nome: ");
		String nome= teclado.nextLine();

		System.out.println("Salário: ");
		double salario= teclado.nextDouble();

		System.out.println("ID: ");
		int id= teclado.nextInt();

		lista[contador]= new Trabalhador(nome, salario, id);
		teclado.nextLine();

		contador++;
	}

	for(int i=0; i<lista.length; i++) {
		System.out.print(lista[i]+ "");
	}
	System.out.println("");
	
	ExercicioOrdenacao.bublleSort(lista);
	ExercicioOrdenacao.exibir(lista);
}
}

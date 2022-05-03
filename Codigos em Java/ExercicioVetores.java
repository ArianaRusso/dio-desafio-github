//Exercicios para analisar vetores. 

package com.arianarusso.exerciciovetores;

import java.util.Scanner;

public class ExercicioVetores {

	public static int maiorDiferenca(int[] vetor) {
		int maior = vetor[0];
		int menor = vetor[0];

		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		return maior - menor;
	}

	public static boolean ehCrescente(int[] vetor, int tamanho) {
		for (int i = 0; i < tamanho -1; i++) {
			if (vetor[i] > vetor[i + 1]) {
	          return false;
			}	
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Qual tamanho do vetor?");
		int tamanho = teclado.nextInt();

		int[] vetor = new int[tamanho];
		System.out.print("Digite " + tamanho + " números");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
		}

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+ " ");
		}
		System.out.println();
		System.out.println("Valor da maior diferença entre dois elementos: " + maiorDiferenca(vetor));
		System.out.println("Ordem crescente: " + ehCrescente(vetor, tamanho));

		teclado.close();

		
	}

}

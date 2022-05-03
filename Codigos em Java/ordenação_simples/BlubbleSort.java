/**
 * 
 */
package ordenação_simples;

import java.util.Arrays;

/**
 * @author arian
 *
 */
public class BlubbleSort {
	
	public static void bubbleSort(int[]vetor) {
		for (int i=0; i<vetor.length; i++) {
			for(int j= 0; j<vetor.length-1; j++) {
				if(vetor[j]>vetor[j+1]) 
					troca(vetor,j,j+1);
				}
			}
		}
	public static void troca(int[] v, int a, int b) {
		int aux= v[a];
		v[a]= v[b];
		v[b]= aux;
	
	}
	
	public static void main(String[] args) {
		int[] a = {36, 15, 75, 2, 16, 48, 42, 51};
		int[] b = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};
		int[] c = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		bubbleSort(a);
		bubbleSort(b);
		bubbleSort(c);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
	}

}

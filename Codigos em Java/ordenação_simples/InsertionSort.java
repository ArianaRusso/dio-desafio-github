/**
 * 
 */
package ordenação_simples;

import java.util.Arrays;

/**
 * @author arian
 *
 */
public class InsertionSort {
	
	public static void insertSort(int[] vetor) {
		for (int i=0;i<vetor.length; i++) {
			int auxiliar= vetor[i];
			for (int j= i-1; j>=0 && vetor[j]>auxiliar; j--) {
				vetor[j+1]= vetor[j];
				vetor[j]= auxiliar;
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] a = {36, 15, 75, 2, 16, 48, 42, 51};
		int[] b = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};
		int[] c = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		insertSort(a);
		insertSort(b);
		insertSort(c);
		
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

	}
}

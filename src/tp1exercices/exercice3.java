package tp1exercices;

import java.util.Arrays;

public class exercice3 {
	 public static void main(String[] args) {
	        int[] tableau = {3, 8, 5, 2, 4, 7};
	        int indice = 0; 
	        System.out.println("Avant tri : " + Arrays.toString(tableau));
	        for (int i = 0; i < tableau.length; i++) {
	            if (tableau[i] % 2 == 0) { 
	                int temp = tableau[i];
	                tableau[i] = tableau[indice];
	                tableau[indice] = temp;
	                indice++; 	            
	                }
	        }

	        System.out.println("Après tri : " + Arrays.toString(tableau));
	    }

}

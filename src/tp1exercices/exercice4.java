package tp1exercices;

import java.util.Arrays;

public class exercice4 {
	public static void main(String[] args) {
        int[][] matrice = {
            {-2, 1, -3, 4},
            {-1, 2, 1, -5},
            {4, -1, 2, 1}
        };

        int maxSom = Integer.MIN_VALUE;
        int[] sousTab = {};

  
        for (int i = 0; i < matrice.length; i++) { 
            for (int j = i; j < matrice.length; j++) { 
                int[] temp = new int[matrice[0].length];

                for (int k = 0; k < matrice[0].length; k++) { 
                    for (int l = i; l <= j; l++) { 
                        temp[k] += matrice[l][k];
                    }
                }

                for (int a = 0; a < temp.length; a++) {
                    for (int b = a; b < temp.length; b++) {
                        int somCourante = 0;
                        for (int m = a; m <= b; m++) {
                            somCourante += temp[m];
                        }

                        if (somCourante > maxSom) {
                            maxSom = somCourante;
                            sousTab = Arrays.copyOfRange(temp, a, b + 1);
                        }
                    }
                }
            }
        }

        // Affichage du résultat
        System.out.println("Sous-tableau maximal " + Arrays.toString(sousTab) + ", Somme = " + maxSom);
    }

}

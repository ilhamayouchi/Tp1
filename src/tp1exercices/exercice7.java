package tp1exercices;

public class exercice7 {
	 public static void main(String[] args) {
	        int[][] tableau = {
	            {2, 5},
	            {1, 2, 3, 4},
	            {7, 1, 8}
	        };

	        int maxsom = 0;
	        int maxligne = 0;
	        
	        for (int i = 0; i < tableau.length; i++) {
	            int somme = 0;
	            for (int nb : tableau[i]) {
	                somme += nb;
	            }

	            if (somme > maxsom) {
	                maxsom = somme;
	                maxligne = i + 1; 
	            }
	        }
	        System.out.println("La ligne avec la plus grande somme est la ligne " + maxligne + " avec une somme de " + maxsom);
	        
	        
	    }

}

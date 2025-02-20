package tp1exercices;

public class exercice2 {
	public static void main(String[] args) {
        int[] tableau = {1, 4, 6, 2, 3, 5, 7}; 
        int cible = 7; 

        System.out.println("Paires dont la somme est " + cible );

        for (int i = 0; i < tableau.length; i++) { 
            for (int j = i + 1; j < tableau.length; j++) { 
                if (tableau[i] + tableau[j] == cible) { 
                    System.out.println("(" + tableau[i] + "," + tableau[j] + ")");
                }
            }
        }
	}

}

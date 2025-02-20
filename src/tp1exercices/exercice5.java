package tp1exercices;

public class exercice5 {
 
	 public static void main(String[] args) {
	        int[][] matrice = {
	            {1, 2, 3},
	            {4, 7, 6},
	            {7, 8, 9}
	        };
	        int N = matrice.length;
	        boolean[] nombresTrouves = new boolean[N * N + 1]; 

	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                int valeur = matrice[i][j];

	                
	                if (valeur < 1 || valeur > N * N || nombresTrouves[valeur]) {
	                    System.out.println("Ce n'est pas une permutation.");
	                    return;
	                }

	                nombresTrouves[valeur] = true; 
	            }
	        }
	        System.out.println("C'est une permutation.");

}
}

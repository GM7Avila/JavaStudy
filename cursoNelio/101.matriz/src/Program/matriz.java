package Program;
import java.util.Scanner;

//create a integer NxN matrix, after that, print the main diagonal and the negative values.

public class matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira n");
		int n = sc.nextInt();	
		int[][] mat = new int[n][n];

		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.println("Insira o valor da posição: l["+i+"],j["+j+"]");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		
		for (int i=0; i<mat.length; i++) {
			System.out.println(mat[i][i] + " ");		
		}
		
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for(int j=0; i<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		sc.close();
	}
}

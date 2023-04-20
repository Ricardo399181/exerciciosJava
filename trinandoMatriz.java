package exercicios;

import java.util.Scanner;

public class trinandoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] matriz = new int[n][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("diagonal principal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][i] + " ");
		}

		System.out.println("quantidade de negativos: ");
		int negativos = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j <  matriz[i].length; j++) {

				if (matriz[i][j] < 0) {
					negativos ++;
				}

			}

		}

		System.out.println(negativos);

		sc.close();

	}

}

package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Ejercicio03 ejer = new Ejercicio03();

		Scanner sc = new Scanner(System.in);

		int tabla[][];

		int n;

		int m;

		System.out.print("Numero de filas: ");
		n = sc.nextInt();
		System.out.println("Numero de columnas: ");
		m = sc.nextInt();

		tabla = new int[n][m];

	}

	public void tablaBidi(int tabla[][], int n, int m) {

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = 10 * (i + j);
			}
		}

	}

}

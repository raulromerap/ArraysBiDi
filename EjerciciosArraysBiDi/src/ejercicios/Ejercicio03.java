package ejercicios;

public class Ejercicio03 {

	public static void main(String[] args) {

		int tabla[][] = new int [5][5];
		
		tablaBidi(tabla);
		
		for(int fila[] : tabla) {
			for(int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
		
	}

	public static void tablaBidi(int tabla[][]) {

		for (int n = 0; n < tabla.length; n++) {
			for (int m = 0; m < tabla[n].length; m++) {
				tabla[n][m] = 10 * (n + m);
			}
		}

	}

}

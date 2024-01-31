package ejercicios;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		hacerTabla();
		
	}

	public static int[][] hacerTabla(){
		
		int tabla[][] = new int [10][10];
		
		for(int i=0; i< tabla.length;i++) {
			for(int j=0; j < tabla[i].length;j++) {
				System.out.print(i+1 + " x " + (j+1) + " = " + ((i+1)*(j+1)) + "\t");
			}
			System.out.println();
		}
		
		return tabla;
		
	}
}

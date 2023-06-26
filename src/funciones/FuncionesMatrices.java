package funciones;

import java.util.Scanner;

public class FuncionesMatrices {

	public static void pedirMatriz(int m[][]) {
		Scanner teclado = new Scanner(System.in);
		for (int fila=0; fila<m.length;fila++) {
			for(int col=0;col<m[0].length;col++) {
				System.out.printf("Introduce el elemento (%d,%d):",fila,col);
				m[fila][col]=teclado.nextInt();
			}
		}
	}
	
	public static void mostrarMatriz(int m[][]) {
		for (int fila=0; fila<m.length;fila++) {
			for(int col=0;col<m[0].length;col++) {
				System.out.printf("%d ",m[fila][col]);
			}
			System.out.println();
		}
	}
	
}

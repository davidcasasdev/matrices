package ejercicios;
import java.util.Scanner;

import funciones.FuncionesMatrices;
/**
 * 9. Dada un array de tamaño (M,N) de reales, almacenarlo 
 * sobre otro array de tamaño (N,M) de forma transpuesta, 
 * es decir, el elemento (1,2) del primer array se 
 * almacenará en el elemento (2,1) del segundo 
 * @author David
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int matriz [][] = new int [3][3];
		
//		System.out.println("Introduce los datos de la matriz");
//		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("Rellenado matriz");
		FuncionesMatrices.inicilizaAleatorioEntre(matriz,-10,11);
		
		System.out.println("La matriz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		System.out.printf("EL determinante de la matriz es %d", 
				FuncionesMatrices.determinante3x3(matriz));
		
		
		

	}

}

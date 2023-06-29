package ejercicios;
import java.util.Scanner;

import funciones.FuncionesMatrices;
/**
 * 6. Dado un array de tamaño (N,M) de enteros, buscar el 
 * máximo valor almacenado. 
 * @author David
 *
 */
public class Ejercicio8 {

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

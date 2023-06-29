package ejercicios;
import java.util.Scanner;

import funciones.FuncionesMatrices;
/**
 * 4. Dado un array de tamaño (N,M) de reales, decir si la
 *  matriz así representada es triangular superior.
 * @author David
 *
 */
public class Ejercicio5bis {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantas filas quieres:?");
		int filas = teclado.nextInt();
		
		System.out.println("¿Cuantas columnas quieres:?");
		int columnas = teclado.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		
		System.out.println("Introduce los datos de la mnatriz");
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("La matriz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		if (FuncionesMatrices.esDiagonal(matriz)) {
			System.out.printf("Es diagonal");
		} else {
			System.out.printf("No es diagonal");
		}
		
		

	}

}

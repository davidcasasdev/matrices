package ejercicios;

import java.util.Scanner;

import funciones.FuncionesMatrices;

/**
 * 2. Dado un array de tamaño (N,M) de enteros, decir si todos sus 
 * elementos son cero. 
 * @author David
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantas filas quieres:?");
		int filas = teclado.nextInt();
		
		System.out.println("¿Cuantas columnas quieres:?");
		int columnas = teclado.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		
		System.out.println("Introduce los datos de la mnatriz");
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("L matriz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		if (FuncionesMatrices.esMatrizNula(matriz)) {
			System.out.printf("ES matriz nula");
		} else {
			System.out.printf("NO es matriz nula");
		}

	}

}

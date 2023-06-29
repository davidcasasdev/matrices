
package ejercicios;

import java.util.Scanner;

import funciones.FuncionesMatrices;

/**
 * 1. Dado un array de tamaño (N,M) de enteros, 
 * inicializarlo a un valor dado A. 

 * @author David
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el numero de filas");
		int filas = teclado.nextInt();
		
		System.out.println("Introduce el numero de columnas");
		int cols = teclado.nextInt();
		
		int matriz [][] = new int [filas][cols];
		
		System.out.println("A que número quieres inicializar?");
		int num = teclado.nextInt();
		
		FuncionesMatrices.inicilizaMatriz(matriz, num);
		
		System.out.println("Tu matriz inicializada es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		System.out.println("Y esta es aleatoria");
		int aleatoria[][]=new int [filas][cols];
		FuncionesMatrices.inicilizaAleatorioEntre1y10(aleatoria);
		FuncionesMatrices.mostrarMatriz(aleatoria);
	}

}

package ejercicios;

import java.util.Scanner;

import funciones.FuncionesMatrices;

public class MatricesBase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantas filas quieres:?");
		int filas = teclado.nextInt();
		
		System.out.println("¿Cuantas columnas quieres:?");
		int columnas = teclado.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		
		System.out.println("Introduce los datos de la mnatriz");
		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("Tu matriz es: ");
		FuncionesMatrices.mostrarMatriz(matriz);
	}

}
package ejercicios;
import java.util.Scanner;

import funciones.FuncionesMatrices;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int matrizExtension [][] = { {1,2,3},{2,7,3}};
		
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
		
		System.out.println("Introduce el número a buscar");
		int num = teclado.nextInt();
		
		int cuenta = FuncionesMatrices.cuentaVeces(matriz, num);
		System.out.printf("El número %d aparece %d veces en la matriz", num, cuenta);
		

	}

}

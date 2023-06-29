package ejercicios;
import java.util.Scanner;

import funciones.FuncionesMatrices;
/**
 * 6. Dado un array de tamaño (N,M) de enteros, buscar el 
 * máximo valor almacenado. 
 * @author David
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantas filas quieres:?");
		int filas = teclado.nextInt();
		
		System.out.println("¿Cuantas columnas quieres:?");
		int columnas = teclado.nextInt();
		
		int matriz [][] = new int [filas][columnas];
		
//		System.out.println("Introduce los datos de la matriz");
//		FuncionesMatrices.pedirMatriz(matriz);
		
		System.out.println("Rellenado matriz");
		FuncionesMatrices.inicilizaAleatorioEntre(matriz,-100,101);
		
		System.out.println("La matriz es ");
		FuncionesMatrices.mostrarMatriz(matriz);
		
		System.out.printf("EL mayor elemento de la matriz es %d", 
				FuncionesMatrices.mayor(matriz));
		
		
		

	}

}

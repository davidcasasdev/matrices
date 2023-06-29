package funciones;

import java.util.Random;
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
				System.out.printf("%4d ",m[fila][col]);
			}
			System.out.println();
		}
	}
	
	public static void inicilizaMatriz(int m[][], int num) {
		for (int fila=0;fila<m.length;fila++) {
			for (int col=0; col<m[0].length;col++) {
				m[fila][col]=num;
			}
		}
	}
	
	
	public static void inicilizaAleatorioEntre(int m[][], int inicio, int fin) {
		Random aleatorio = new Random();
		for (int fila=0;fila<m.length;fila++) {
			for (int col=0; col<m[0].length;col++) {
				m[fila][col]=aleatorio.nextInt(inicio, fin);
			}
		}
	}
	
	public static void inicilizaAleatorioEntre1y10(int m[][]) {
		inicilizaAleatorioEntre(m, 1, 11);
	}
	public static boolean esMatrizNula(int matriz[][]) {
		boolean sonCeros=true;
		for (int fila=0;fila<matriz.length && sonCeros ;fila++) {
			for (int col=0; col<matriz[0].length && sonCeros;col++) {
				if (matriz[fila][col]!=0) {
					sonCeros=false;
				}
			}
		}
		return sonCeros;
	}
	
	
	public static boolean esMatrizNula2(int matriz[][]) {
		for (int fila=0;fila<matriz.length ;fila++) {
			for (int col=0; col<matriz[0].length;col++) {
				if (matriz[fila][col]!=0) {
					return false;
				}
			}
		}
		return true;
	}

	public static int cuentaVeces(int[][] matriz, int num) {
		int contador=0;
		for (int fila=0;fila<matriz.length ;fila++) {
			for (int col=0; col<matriz[0].length;col++) {
				if (matriz[fila][col]==num) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public static boolean matrizNula3(int matriz[][]) {
		return cuentaVeces(matriz,0)==matriz.length*matriz[0].length;
	}
	
	public static boolean esTriangSuperior2(int matriz[][]) {
		boolean esTriangular=true;
		for (int fila=0;fila<matriz.length ;fila++) {
			for (int col=0; col<matriz[0].length;col++) {
				if (matriz[fila][col]!=0 && fila<col) {
					esTriangular=false;
				}	
			}
		}
		return esTriangular;
	}
	
	public static boolean esTriangSuperior(int matriz[][]) {
		boolean esTriangular=true;
		if (matriz.length!=matriz[0].length) return false;
		for (int fila=1;fila<matriz.length && esTriangular;fila++) {
			for (int col=0; col<fila && esTriangular;col++) {
				if (matriz[fila][col]!=0) {
					esTriangular=false;
				}	
			}
		}
		return esTriangular;
	}
	
	
	public static boolean esTriangInferior(int matriz[][]) {
		boolean esTriangular=true;
		if (matriz.length!=matriz[0].length) return false;
		for (int fila=0;fila<matriz.length-1 && esTriangular;fila++) {
			for (int col=fila+1; col<fila && esTriangular;col++) {
				if (matriz[fila][col]!=0) {
					esTriangular=false;
				}	
			}
		}
		return esTriangular;
	}
	
	public static boolean esTriangInferiorV2(int matriz[][]) {
		boolean esTriangular=true;
		if (matriz.length!=matriz[0].length) return false;
		for (int fila=1;fila<matriz[0].length && esTriangular;fila++) {
			for (int col=0; col<fila && esTriangular;col++) {
				if (matriz[col][fila]!=0) {
					esTriangular=false;
				}	
			}
		}
		return esTriangular;
	}
	
	public static boolean esDiagonal(int matriz[][]) {
		return esTriangInferior(matriz) && esTriangSuperior(matriz) 
				&& !matrizNula3(matriz);
	}

	/**
	 * Función que devuelve el mayor elemento de la matriz
	 * @param matriz int [][] matriz con los valores a comprobar
	 * @return int con el valos máximo de la matriz
	 */
	public static int mayor(int[][] matriz) {
		int mayor = matriz[0][0];
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[0].length; col++) {
				if (matriz[fila][col]>mayor) {
					mayor = matriz[fila][col];
				}
			}
		}
		return mayor;
	}
	
	public static int menor(int[][] matriz) {
		int menor = matriz[0][0];
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[0].length; col++) {
				if (matriz[fila][col]<menor) {
					menor = matriz[fila][col];
				}
			}
		}
		return menor;
	}

	public static int determinante3x3(int[][] matriz) {

		int res = 
				matriz[0][0]*matriz[1][1]*matriz[2][2] +
				matriz[1][0]*matriz[2][1]*matriz[0][2] +
				matriz[0][1]*matriz[1][2]*matriz[2][0] -
				matriz[0][2]*matriz[1][1]*matriz[2][0] -
				matriz[0][0]*matriz[1][2]*matriz[2][1] -
				matriz[0][1]*matriz[1][0]*matriz[2][2];
				
		return res;
	}
}

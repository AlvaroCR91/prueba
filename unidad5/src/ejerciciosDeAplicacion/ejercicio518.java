package ejerciciosDeAplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio518 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas=0;
		int columnas=0;
		
		System.out.println("Cuantas filas quieres que haya");
		filas = new Scanner(System.in).nextInt();
		
		System.out.println("Cuantas columnas quieres que haya");
		columnas = new Scanner(System.in).nextInt();
		
		int matrizSolicitada [][] = new int [filas][columnas];
		
		for(int i = 0; i < matrizSolicitada.length; i++ ) {
			for(int j = 0; j < matrizSolicitada.length; j++ ) {
				System.out.println("Introduce el numero "+j+" para la fila "+i);
				matrizSolicitada[i][j] = new Scanner(System.in).nextInt();
			}
		}

		for(int i=0; i < matrizSolicitada.length; i++) {
			System.out.println(Arrays.toString(matrizSolicitada[i])); 
		}
			
		double acum=0;
		double sumaTotalFila=0;
		double sumaTotalColumna=0;
		
		for(int i=0 ; i < filas ; i++) {
			for(int j = 0; j < columnas ; j++ ) {
				acum += matrizSolicitada[i][j];
				sumaTotalFila = acum;
			}
			System.out.println(sumaTotalFila);
	}
}
}

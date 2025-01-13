package ejercicioAhorcado;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Introduce el número de filas: ");
        int filas = new Scanner(System.in).nextInt();
        
        int numero = 1;

        for (int i = 1; i <= filas; i++) {
            // Imprime espacios en blanco antes de las estrellas
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            // Imprime las estrellas
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Salto de línea para la siguiente fila
            System.out.println();
        }
	}
}
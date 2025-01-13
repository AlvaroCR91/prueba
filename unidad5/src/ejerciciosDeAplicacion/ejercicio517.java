package ejerciciosDeAplicacion;

import java.util.Scanner;

public class ejercicio517 {
	public static void main(String[] args) {

        int[] t = {10, 1, 5, 8, 9, 2};
        int numElementos = 3;

        int[] resultado = suma(t, numElementos);

        for (int i=0; i < resultado.length; i++) {
            System.out.println(resultado[i] + " ");
        }
	}



    public static int [] suma(int t[], int numElementos) {
        int numSumas = t.length - numElementos + 1;
        int[] resultado = new int[numSumas];

        for (int i=0; i < numSumas; i++) {
        int sumaTotal = 0;
            for (int j = 0; j < numElementos; j++) {
                sumaTotal += t[i + j];
            }
            resultado[i] = sumaTotal;
        }

        return resultado;
    }
}

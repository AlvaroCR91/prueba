package ejerciciosDeAplicacion;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio515 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numAlumnos;
		int numNotas = 3;
		
		System.out.println("¿Cuantos alumnos van a ser?");
		numAlumnos = new Scanner(System.in).nextInt();
		
		double alumnosNotas [][] = new double [numAlumnos][numNotas];
		
		for(int i = 0; i < numAlumnos; i++ ) {
			for(int j = 0; j < numNotas; j++ ) {
				System.out.println("Introduce la nota "+j+" para alumno "+i);
				alumnosNotas[i][j] = (new Scanner(System.in)).nextDouble();
			}
		}
		
		for(int i=0; i < numAlumnos; i++) {
			System.out.println(Arrays.toString(alumnosNotas[i]));
		}
		
		System.out.println("Introduzca la posicion del alumno");
		int posicion = new Scanner(System.in).nextInt();
		
		int acumNota=0;
		
		double notasMedias[]=new double[numAlumnos];
		for(int i=0 ; i < numAlumnos ; i++) {
			notasMedias[i] = calcularMedia(alumnosNotas[i]);
			acumNota += notasMedias[i];
		}
		
		double mediaAlumnos [][] = new double [acumNota][posicion];
		
		
		
		System.out.println("Nota media de ese alumno es " +(Arrays.toString(mediaAlumnos)));
		
	}
	public static double calcularMedia(double [] array) {
		double acum=0;
		for(int i=0 ; i < array.length ; i++) {
				acum += array[i];
			}
			double media = (int)(acum/array.length);
			return media;
		
	}

}

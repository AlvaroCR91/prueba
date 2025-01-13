package unidad4;

import java.util.Scanner;

public class ejercicioAmpliacion418 {
	public static void main(String[] args) 
	{
		int cantidadNum;
		int valorMin;
		int valorMax;
		int resultado;
		
		System.out.println("Indica la cantidad de numeros que quieres mostrar");
		cantidadNum= new Scanner(System.in).nextInt();
		System.out.println("Indica el valor minimo que quieres mostrar");
		valorMin= new Scanner(System.in).nextInt();
		System.out.println("Indica el valor maximo que quieres mostrar");
		valorMax= new Scanner(System.in).nextInt();
		
		numEnteros(cantidadNum, valorMin, valorMax);

	}
	public static void numEnteros(int cantidadNum, int valorMin, int valorMax)
	{
		for (int i=0;i<cantidadNum;i++)
		{
			int resultado=(int) ((Math.random() * (valorMax-valorMin+1 )) + valorMin);
			System.out.println(resultado);
		}
	}
}
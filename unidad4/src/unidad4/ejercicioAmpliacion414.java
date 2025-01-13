package unidad4;

import java.util.Scanner;

public class ejercicioAmpliacion414
{
	public static void main(String[] args) 
	{
		double dias;
		double horas;
		double minutos;
		double segundos;
		
		System.out.println("Indica la cantidad de dias");
		dias=new Scanner(System.in).nextDouble();
		System.out.println("Indica la cantidad de horas");
		horas=new Scanner(System.in).nextDouble();
		System.out.println("Indica la cantidad de minutos");
		minutos=new Scanner(System.in).nextDouble();
		
		segundos=calcular(dias, horas, minutos);
		System.out.println("La cantidad de dias, horas y minutos en segundos es "+segundos);
		
	}
	public static double calcular(double dias, double horas, double minutos)
	{
		return ((dias*24)*3600)+(horas*3600)+(minutos*60);
	}
}

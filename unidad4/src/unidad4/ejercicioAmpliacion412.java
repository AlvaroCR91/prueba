package unidad4;
import java.util.Scanner;

public class ejercicioAmpliacion412 {

	public static void main(String[] args) 
	{
		double x1;
		double x2;
		double y1;
		double y2;
		double resultado;
		
		System.out.println("Señala las 1º distancia");
		x1=new Scanner(System.in).nextDouble();
		System.out.println("Señala las 2º distancia");
		x2=new Scanner(System.in).nextDouble();
		System.out.println("Señala las 3º distancia");
		y1=new Scanner(System.in).nextDouble();
		System.out.println("Señala las 4º distancia");
		y2=new Scanner(System.in).nextDouble();
		
		resultado= distancia(x1, x2, y1, y2);
		
		System.out.println("El resultado es " + resultado);
		
	}
	public static double distancia(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x1-x2),2))+((Math.pow((y1-y2),2)));
	}
}

package unidad4;
import java.util.Scanner;

public class ejercicioAmpliacion413 {
	public static void main(String[] args) 
	{
		int n;

		System.out.println("Indica la cantidad de numeros que quieras saber");
		n=new Scanner(System.in).nextInt();

		mostrarPares(n);
	}
	public static void mostrarPares(int n) 
	{	
		for (int i = 0; i != n; i++) 
		{
			System.out.println(i * 2);
		}
	}
}
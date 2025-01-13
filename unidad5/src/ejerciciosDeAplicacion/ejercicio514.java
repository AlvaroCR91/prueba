package ejerciciosDeAplicacion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ejercicio514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solo usaremos que hay N encuestados
		
		//entrada
		
//		-numero de encuestados int
//		-array de los sueldos de los encuestados
//		
//		sueldos -> 012345....
		
		int numeroEncuestados;
		
		System.out.println("¿Cuantos encuestados van a ser?");
		numeroEncuestados = new Scanner(System.in).nextInt();
		
		double sueldos [] = new double [numeroEncuestados];
		
		for(int i = 0; i < numeroEncuestados; i++) {
			System.out.println("Introduce el sueldo del encuestado");
			sueldos[i] = (new Scanner(System.in)).nextDouble();
		}
		Arrays.sort(sueldos);
		System.out.println(Arrays.toString(sueldos));
		
		double min = sueldos[0];
		double max = sueldos[0];
		
		for (int i=0;i<sueldos.length;i++)
		{
			if(min > sueldos[i])
			{
				min = sueldos[i];
			}
			if(max < sueldos[i])
			{
				max = sueldos[i];
			}
		}
		System.out.println("valor resultado minimo es: "+min);
		System.out.println("valor resultado minimo es: "+max);
		
		
		
		
	}
}

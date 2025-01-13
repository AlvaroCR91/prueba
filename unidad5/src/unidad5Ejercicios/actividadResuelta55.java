package unidad5Ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class actividadResuelta55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = new int [6];
		System.out.println(Arrays.toString(numeros) );
		
		Arrays.fill(numeros, -1);
//		System.out.println(Arrays.toString(numeros) );

		for( int elem   : numeros   ) // for each  - para cada
		{
			elem = elem + 5;
		}
		System.out.println(Arrays.toString(numeros) );

		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random()*100) + 1;
		}
		System.out.println(Arrays.toString(numeros) );
		
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros) );
		

		System.out.println( Arrays.toString( rellenarPares( 5 , 20 ))     );
		
	}
	public static int [] rellenarPares( int longitud , int fin  )
	{
		// crear un array
		int [] array = new int[longitud];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = aleatorioPar(fin);
		}
		Arrays.sort(array);
		return array;
	}
	
	public static int aleatorioPar(int fin) {
		int numAleatorioPar;
		do {
			numAleatorioPar = (int) (Math.random()*fin) + 1;
		}
		while( numAleatorioPar % 2 != 0);
		
		return numAleatorioPar;
	}
}

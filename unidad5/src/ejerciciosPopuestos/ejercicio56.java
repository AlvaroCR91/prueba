package ejerciciosPopuestos;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t[] = {12,27,33,38,72,92};
		int aBorrar = new Scanner (System.in).nextInt();
		int indiceBorrado = Arrays.binarySearch(t, aBorrar);
		if (indiceBorrado >=0) {
			System.arraycopy(t, indiceBorrado+1,t, indiceBorrado, t.length- indiceBorrado-1);
		}
		t = Arrays.copyOf(t, t.length - 1);
		System.out.println(Arrays.toString(t));
		else {
			...
		}
		
		
	}
public static int[] borrarOrdenado(int[]array, int valor) {
	return 
}
}

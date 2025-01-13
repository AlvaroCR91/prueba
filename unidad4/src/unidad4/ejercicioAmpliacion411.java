package unidad4;
import java.util.Scanner;

public class ejercicioAmpliacion411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio;
		double resultadoSuperficie;
		double resultadoVolumen;
		
		System.out.println("indidca el radio deseado");
		radio=new Scanner(System.in).nextDouble();
		
		resultadoSuperficie=superficie(radio);
		resultadoVolumen=volumen(radio);
		
		
		System.out.println("la superficie es :" + resultadoSuperficie);
		System.out.println("El volumen es : " + resultadoVolumen);
	}
	public static double superficie(double radio) {
		return (4.0*Math.PI)* Math.pow(radio, 2);
	}
		
	public static double volumen(double radio) {
		return ((4.0/3.0)*Math.PI)*(Math.pow(radio, 3));
	}
}

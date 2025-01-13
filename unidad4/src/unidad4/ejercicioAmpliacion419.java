package unidad4;
import java.util.Scanner;

public class ejercicioAmpliacion419 
{
	public static void main(String[] args)
	{
	int cantidadNum;
	int valorMin;
	int valorMax;
	int eleccion;
	
	System.out.println("Elige si quieres que solo salgan numeros entre 0 y 1 o añade tu manualmentes los valores. Elige opcion 1 u opcion 2");
	eleccion=new Scanner(System.in).nextInt();
	if(eleccion==1) 
	{
	System.out.println("Indica la cantidad de numeros que quieres mostrar");
	cantidadNum= new Scanner(System.in).nextInt();
	
	numEnteros(cantidadNum);
	}
	else {
	System.out.println("Indica la cantidad de numeros que quieres mostrar");
	cantidadNum= new Scanner(System.in).nextInt();
	
	System.out.println("Indica el valor minimo que quieres m10ostrar");
	valorMin= new Scanner(System.in).nextInt();
	
	System.out.println("Indica el valor maximo que quieres mostrar");
	valorMax= new Scanner(System.in).nextInt();
	
	numEnteros(cantidadNum, valorMin, valorMax);
	}

}
public static void numEnteros(int cantidadNum)
{
	for (int i=0;i<cantidadNum;i++)
	{
		double resultado= (double) Math.random();
		System.out.println(resultado);
	}
}
static void numEnteros(int cantidadNum, int valorMin, int valorMax)
{
	for (int i=0;i<cantidadNum;i++)
	{
		int resultado=(int) ((Math.random() * (valorMax-valorMin+1 )) + valorMin);
		System.out.println(resultado);
	}
}
}
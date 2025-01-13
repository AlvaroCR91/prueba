package unidad7;

import java.util.Arrays;

public class Alumno {
	
	// Atributos
	private String nombre;
	private int edad;
	private double [] notas;
	private int indiceNota;
	
	
	
	// Constructores
	public Alumno() {
		nombre="";
		edad=-1;
//		notas=null;
		notas=new double[3];
		indiceNota=0;
	}
	
	// ocultación de nombre de variables
	public Alumno( String nombre , int edad , double [] notas ) {
		this.nombre = nombre;
		this.edad=edad;
		this.notas=notas.clone();
	}
	
	// método para calcular la nota media
	public double calcularMedia() {
		double acum=0;
		for(int i = 0; i < notas.length;i++) {
			acum+=notas[i];
		}
		return acum/notas.length;
	}
	
	public void addNota(double nota) {
		if(indiceNota<notas.length) {
			notas[indiceNota]=nota;
			indiceNota++;
		}
		else {
			System.out.println("No caben más notas.");
		}
	}
	
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre( String nombre ) {
		this.nombre=nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad( int edad ) {
		if(edad<99) {
			this.edad=edad;
		}
		else {
			System.out.println("Edad incorrecta.");
		}
	}
	
	public double [] getNotas() {
		return notas.clone();
	}
	
	public void setNotas(double [] notas) {
		this.notas=notas.clone();
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", notas=" + Arrays.toString(notas) + "]";
	}
}
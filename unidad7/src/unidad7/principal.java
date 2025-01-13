package unidad7;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] notas = {5,6,7};
		
		Alumno alumno;
		alumno = new Alumno("Javi", 43, notas);
		
		notas[0]=145657;
		
		alumno.setEdad(199);
		
		int edadAlumno = alumno.getEdad();
		
		System.out.println( alumno.toString() );
		
		//Trabajo con vectores de objetos
		System.out.println("### Vectores de objetos");
		
		Alumno alumnos [];
		alumnos = new Alumno[3];
		double [] notas0 = {7,5,8};
		double [] notas1 = {9,9,9};
		double [] notas2 = {4,6,8};

		Alumno alumno0;
		alumno0 = new Alumno("Javi", 43, notas0);
		
		alumnos[0] = alumno0;
		alumnos[1] = new Alumno ("Paco", 23, notas1);
		alumnos[2] = new Alumno ("Mark", 26, notas2);

		Alumno alu = new Alumno();
		alu.setNombre("Pepito");
		alu.setEdad(18);
		alu.addNota(8);
		alu.addNota(9);
		alu.addNota(10);
		alu.addNota(5);
		
		System.out.println(alu);
		
		for(int i=0; i<alumnos.length;i++) {
			System.out.println("Nota media del alumno " + i + " : " + alumnos[i].calcularMedia());
		}

	}
}
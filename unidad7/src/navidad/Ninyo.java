package navidad;

public class Ninyo {

	enum Comportamiento { BUENO, REGULAR, MALO};
	
	private String nombre;
	private Comportamiento comportamiento;
	private int edad;
	
	public Ninyo(String nombre, Comportamiento comportamiento, int edad) {
		this.nombre = nombre;
		this.comportamiento = comportamiento;
		this.edad = edad;
	}
	
	public Carta escribirCarta( Carta carta, String direccion, Juguete [] juguetes ) {
		carta.setDireccion(direccion);
		carta.setJuguetes(juguetes.clone());
		carta.setNinyo(this);
	
		return carta;
	}
	
	public Carta enviarCarta(Carta carta) {
		return carta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Comportamiento getComportamiento() {
		return comportamiento;
	}

	public void setComportamiento(Comportamiento comportamiento) {
		this.comportamiento = comportamiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Ninyo [nombre=" + nombre + ", comportamiento=" + comportamiento + ", edad=" + edad + "]";
	}
	
}

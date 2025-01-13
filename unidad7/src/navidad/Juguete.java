package navidad;

public class Juguete {

	private String nombre;
	private double precio;
	private double peso;
	
	//Constructor por defecto (Sin argumentos)
	public Juguete() {
		nombre="";
		precio=-1;
		peso=-1;
		
	}
	
	public Juguete(String nombre) {
		this();
		this.nombre=nombre;
	}
	
	public Juguete(String nombre, double precio) {
		this(nombre);
		this.precio=precio;
	}
	
	// constructor parametrizado
	public Juguete(String nombre, double precio, double peso) {
		this(nombre, precio);
		this.peso=peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Juguete [nombre=" + nombre + ", precio=" + precio + ", peso=" + peso + "]";
	}
}

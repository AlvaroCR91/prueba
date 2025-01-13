package navidad;

import java.util.Arrays;

public class Carta {
	
	private String direccion;
	private Ninyo ninyo;
	private Juguete[] juguetes;
	
	public Carta() {}
	
	public Carta(String direccion, Ninyo ninyo, Juguete[] juguetes) {
		this.direccion = direccion;
		this.ninyo = ninyo;
		this.juguetes = juguetes.clone();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Ninyo getNinyo() {
		return ninyo;
	}

	public void setNinyo(Ninyo ninyo) {
		this.ninyo = ninyo;
	}

	public Juguete[] getJuguetes() {
		return juguetes.clone();
	}

	public void setJuguetes(Juguete[] juguetes) {
		this.juguetes = juguetes.clone();
	}

	@Override
	public String toString() {
		return "Carta [direccion=" + direccion + ", ninyo=" + ninyo + ", juguetes=" + Arrays.toString(juguetes) + "]";
	}

	
}

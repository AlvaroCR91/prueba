package navidad;

public class Main {
	
	public static void main(String[] args)  {
		
		Juguete juguete1 = new Juguete("Cochecito", 20, 0.5);
		Juguete juguete2 = new Juguete("Peluche", 20, 0.5);
		Juguete juguete3 = new Juguete("barco", 20, 0.5);
		
		Ninyo ninyo1 = new Ninyo("Pepito", Ninyo.Comportamiento.BUENO, 7);
		Ninyo ninyo2 = new Ninyo("Pepito2", Ninyo.Comportamiento.MALO, 7);
		Ninyo ninyo3 = new Ninyo("Pepito3", Ninyo.Comportamiento.REGULAR, 7);
		
		Juguete [] juguetes = new Juguete[3];
		juguetes [0]=juguete1;
		juguetes [1]=juguete2;
		juguetes [2]=juguete3;
		
//		Carta carta = new Carta("Calle Rue del Percebe 13", ninyo, juguetes);
		
		Carta carta1 = new Carta();
		carta1 = ninyo1.escribirCarta(carta1, "direccion ninyo1", juguetes);
		Carta carta2 = new Carta();
		carta2 = ninyo2.escribirCarta(carta2, "direccion ninyo2", juguetes);
		Carta carta3 = new Carta();
		carta3 = ninyo3.escribirCarta(carta3, "direccion ninyo3", juguetes);
		
		PapaNoel papaNoel = new PapaNoel();
		
		papaNoel.evaluarCarta(carta1);
		papaNoel.evaluarCarta(carta2);
		papaNoel.evaluarCarta(carta3);
		
		papaNoel.repartirJuguetes();
	}

}

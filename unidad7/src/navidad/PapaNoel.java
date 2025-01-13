package navidad;

import java.util.Arrays;

public class PapaNoel {
	//el termino final es para valores estaticos, por ejemplo maximos o minimos
	private final int MAX_CARTAS = 5;
	
	private Carta [] cartas;
	private Juguete [][] saco;
	private int contadorCartas;
	
	public PapaNoel() {
		cartas = new Carta[5];
		saco = new Juguete[cartas.length][3];
		contadorCartas=0;
	}
	
	public void evaluarCarta(Carta carta) {
		
		cartas[contadorCartas]=carta;
		Ninyo ninyo = carta.getNinyo();
		
		if(ninyo.getComportamiento().equals(Ninyo.Comportamiento.BUENO)) {
			rellenarSaco(carta.getJuguetes() , 3 );
		}
		else if(ninyo.getComportamiento().equals(Ninyo.Comportamiento.REGULAR)) {
			rellenarSaco(carta.getJuguetes() , 2 );
		}
		else if(ninyo.getComportamiento().equals(Ninyo.Comportamiento.MALO)) {
			rellenarSaco(carta.getJuguetes() , 1 );
		}
	}

	public void rellenarSaco(Juguete[] juguetes, int cantidad) {
		
		if(contadorCartas < MAX_CARTAS) {
			for(int i = 0; i < cantidad; i++) {
				saco[contadorCartas][i] = juguetes[i];
			}
			contadorCartas++;
		}
	}
	
	
	public void repartirJuguetes() {
		for(int i = 0; i < contadorCartas; i++) {
			//imprime el niño, la direccion y los juguetes
			System.out.println(cartas[i].getNinyo());
			System.out.println(cartas[i].getDireccion());
			//con el toString de saco, saca el vector de los juguetes que hay dentro del saco
			System.out.println(Arrays.toString(saco[i]));
			System.out.println("---");
		}
		System.out.println("MUAJA JA JA¡¡¡¡ Soy el Grinch");
	}
}

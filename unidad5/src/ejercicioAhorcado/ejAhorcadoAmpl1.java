package ejercicioAhorcado;

import java.util.Arrays;
import java.util.Scanner;

public class ejAhorcadoAmpl1 {
	
public static void main(String[] args) {
        // TODO Auto-generated method stub
        String palabraOculta;
        String[] palabraResuelta;
        String[] dibujoAhorcado = {
        	    "   +---+\n       |\n       |\n       |\n      ===",
        	    "   +---+\n   O   |\n       |\n       |\n      ===",
        	    "   +---+\n   O   |\n   |   |\n       |\n      ===",
        	    "   +---+\n   O   |\n  /|   |\n       |\n      ===",
        	    "   +---+\n   O   |\n  /|\\  |\n       |\n      ===",
        	    "   +---+\n   O   |\n  /|\\  |\n  /    |\n      ===",
        	    "   +---+\n   O   |\n  /|\\  |\n  / \\  |\n      ==="
        	};
        
        char[] letraOculta = null;
        String platano = "platano";
        String edificio = "edificio";
        String destornillador = "destornillador";
        String cuerda = "cuerda";
        String tenedor = "tenedor";
        String pista = "pista";
        
        
        int eleccion = (int) ((Math.random() * 5 ) + 1);
        
        switch(eleccion) {
        case 1 -> {letraOculta = platano.toCharArray(); pista = "Es una fruta amarilla";}
        case 2 -> {letraOculta = edificio.toCharArray(); pista = "Es una estructura habitable";}
        case 3 -> {letraOculta = destornillador.toCharArray(); pista ="Es una herramienta";}
        case 4 -> {letraOculta = cuerda.toCharArray(); pista="Esta presente en el dibujo";}
        case 5 -> {letraOculta = tenedor.toCharArray(); pista="Util metalico para uso diario";}
        }
        
        palabraResuelta = new String[letraOculta.length];  // Inicializar el arreglo con el tamaño adecuado
        

        // Inicializar la palabra resuelta con guiones bajos
        for (int i = 0; i < letraOculta.length; i++) {
            palabraResuelta[i] = "_";  // Inicializamos con un guion bajo
        }
        System.out.println (Arrays.toString(palabraResuelta));

        String adivinar;
        int intentos=7;
        int numeroIntentos=7;
        int numeroDePista=0;
        String respuesta;
        int fallos = -1;
        
        System.out.println("Bienvenido al juego del ahorcado");
        System.out.println("La palabra ya se ha escogido, puedes empezar a adivinar las letras o pedir una pista");

        // Ciclo de intentos
        for (int i = 0; i < intentos; i++) {
        	while(numeroDePista<1) {
        	System.out.println("Quieres una pista? Si/No");
        	respuesta = new Scanner(System.in).next();
        		if(respuesta.equals("si")) {
        			System.out.println("La pista es: "+pista);
        			numeroDePista++;
        		}
        		else {break;}
        	}
            System.out.println("Introduce la letra");
            adivinar = new Scanner(System.in).next();
            char[] letraAdivinar = adivinar.toCharArray();
            boolean letraEncontrada = false;  // Para verificar si la letra adivinada fue encontrada

            // Verificar si la letra adivinada está en la palabra
            for (int j = 0; j < letraOculta.length; j++) {
                if (letraAdivinar[0] == letraOculta[j]) {
                    palabraResuelta[j] = String.valueOf(letraAdivinar[0]);  // Reemplazamos el guion bajo por la letra adivinada
                    letraEncontrada = true;
                    System.out.println("Correcto, la letra "+adivinar+ " coincide");
                    intentos++;
                }
            }

            if (!letraEncontrada) {
                System.out.println("No coincide");
                System.out.println("Te quedan "+(numeroIntentos--)+" intentos");
                fallos++;
                System.out.println(dibujoAhorcado[fallos]); 
            }

            // Mostrar la palabra resuelta hasta ahora
            System.out.println(Arrays.toString(palabraResuelta));

            // Verificar si ya se adivinó toda la palabra
            boolean palabraAdivinada = true;
            for (String letra : palabraResuelta) {
                if (letra.equals("_")) {
                    palabraAdivinada = false;
                    break;
                }
            }

            if (palabraAdivinada) {
                System.out.println("¡Felicidades, has adivinado la palabra!");
                break;  // Termina el juego si la palabra fue adivinada
            }
            else if(fallos==6) {
            	System.out.println("Lo siento, has perdido, la palabra era "+Arrays.toString(letraOculta));
            }
        }
    }
}
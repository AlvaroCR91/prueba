package ejercicioAhorcado;

import java.util.Arrays;
import java.util.Scanner;

public class ejAhorcado {
	
public static void main(String[] args) {
        // TODO Auto-generated method stub
        String palabraOculta;
        String[] palabraResuelta;
        int fallos=0;
        String[] dibujoAhorcado = {
        	    """
        	    +---+
        	        |
        	        |
        	        |
        	       ===
        	    """,
        	    """
        	    +---+
        	    O   |
        	        |
        	        |
        	       ===
        	    """,
        	    """
        	    +---+
        	    O   |
        	    |   |
        	        |
        	       ===
        	    """,
        	    """
        	    +---+
        	    O   |
        	   /|   |
        	        |
        	       ===
        	    """,
        	    """
        	    +---+
        	    O   |
        	   /|\\  |
        	        |
        	       ===
        	    """,
        	    """
        	    +---+
        	    O   |
        	   /|\\  |
        	   /    |
        	       ===
        	    """,
        	    """
        	    +---+
        	    O   |
        	   /|\\  |
        	   / \\  |
        	       ===
        	    """
        	};


        // Solicitar la palabra a adivinar
        System.out.println("Introduce la palabra que quieras");
        palabraOculta = new Scanner(System.in).next();

        char[] letraOculta = palabraOculta.toCharArray();
        palabraResuelta = new String[letraOculta.length];  // Inicializar el arreglo con el tamaño adecuado
        for (int i = 0; i < 20; i++) {
            System.out.println(" ");
        }  // Inicializar el arreglo con el tamaño adecuado
        

        // Inicializar la palabra resuelta con guiones bajos
        for (int i = 0; i < letraOculta.length; i++) {
            palabraResuelta[i] = "_";  // Inicializamos con un guion bajo
        }
        System.out.println (Arrays.toString(palabraResuelta));

        String adivinar;

        // Ciclo de intentos
        for (int i = 0; i < 7; i++) {
            System.out.println("Introduce la letra");
            adivinar = new Scanner(System.in).next();
            char[] letraAdivinar = adivinar.toCharArray();
            boolean letraEncontrada = false;  // Para verificar si la letra adivinada fue encontrada

            // Verificar si la letra adivinada está en la palabra
            for (int j = 0; j < letraOculta.length; j++) {
                if (letraAdivinar[0] == letraOculta[j]) {
                    palabraResuelta[j] = String.valueOf(letraAdivinar[0]);  // Reemplazamos el guion bajo por la letra adivinada
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
            	fallos++;
                System.out.println("No coincide");
                System.out.println(dibujoAhorcado[fallos - 1]); 
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
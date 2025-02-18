package genc181802.desafio01;

import java.util.Scanner;

public class Preguntas {
    
    // Usar metodos System.out.println y el next(), para recibir informacion por consola e imprimir
    // Debe realizar como minimo 3 Preguntas
    // Concatenar las respuestas en una misma linea
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cual es tu apodo o nickname?");
        String respuesta1 = sc.nextLine();
        //System.out.println("Apodo: " + respuesta1);
        
        System.out.println("¿Cual es tu juego favorito?");
        String respuesta2 = sc.nextLine();
        //System.out.println("¿Cual es tu juego favorito?" + respuesta2);

        System.out.println("¿Cuanto tiempo llevas jugando (años)?");
        String respuesta3 = sc.nextLine();
        //System.out.println("Tiempo: " + respuesta3);

        System.out.println("Hola, " + respuesta1 + " tu juego favorito es " + respuesta2 + " y llevas " + respuesta3 + " Jugando");

    }
}

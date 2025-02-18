package genc181802;

import java.util.Scanner;

// Comentarios de linea
/* Comentarios de Bloques */

public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenido a las clases de Java!");

        // Metodos de entrada y salida por consola
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("name = " + name);

        sc.close();

    }
}
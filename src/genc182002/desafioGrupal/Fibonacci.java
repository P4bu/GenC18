package genc182002.desafioGrupal;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        // el Fibonacci debe comenzar con dos variables 0 y 1
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;

        // Le solicitamos al usuario que ingrese cuantas veces sumara (cuantas vuelta dara)
        System.out.println("Ingrese el limite de Fibonacci");
        int limite = sc.nextInt();

        // Imprimimos el 0 y 1 para que se vea bonito
        System.out.println(a);
        System.out.println(b);

        // Se comieza el ciclo con i = 2, porque ya mostramos el 0 y 1 arriba
        // int siguiente guardara la suma de los dos numero a y b
        // La magia: se debe asignar en a el valor de b y b tomara el valor de siguiente, esto para ir avanzando
        // a + b = siguiente
        // 0 + 1 = 1
        // 1 + 1 = 2
        // 1 + 2 = 3
        // 2 + 3 = 5
        // 3 + 5 = 8 y asi

        for(int i = 2; i < limite; i++) {
            int siguiente = a + b;
            System.out.println(siguiente);
            a = b;
            b = siguiente;
        }
    }
}

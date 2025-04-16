package ejercicios.ejerciciosEntrevistas;

import java.util.Scanner;

public class Fibonacci {

    // TODO: Realizar ejercicio fibonacci con un numero ingresado por el usuario (cuantas vueltas).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        System.out.println(a);
        System.out.println(b);

        for(int i = 2; i <= numero; i++) {
            int siguente = a + b;
            System.out.println(siguente);
            a = b;
            b = siguente;
        }
    }
}

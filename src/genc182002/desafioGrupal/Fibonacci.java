package genc182002.desafioGrupal;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;

        System.out.println("Ingrese el limite de Fibonacci");
        int limite = sc.nextInt();

        System.out.println(a);
        System.out.println(b);

        for(int i = 2; i < limite; i++) {
            int siguiente = a + b;
            System.out.println(siguiente);
            a = b;
            b = siguiente;
        }
    }
}

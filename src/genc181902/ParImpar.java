package genc181902;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        //Ingresar un numero y guardarlo
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();

        // Validar si el numero divido en 2 su resto es 0 para Par
        if(numero % 2 == 0) {
            System.out.println("el numero " + numero + " es par");
        } else {
            System.out.println("el numero " + numero + " es impar");
        }
    }
}

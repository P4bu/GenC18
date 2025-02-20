package genc182002.desafioGrupal;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int resultado = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        int numero = sc.nextInt();

        for(int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        System.out.println("el factorial de " + numero + " = " + resultado);
    }
}

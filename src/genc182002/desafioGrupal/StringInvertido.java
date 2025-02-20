package genc182002.desafioGrupal;

import java.util.Scanner;

public class StringInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = sc.nextLine();
        String invertido = "";

        for(int i = palabra.length() - 1; i >= 0; i--) {
            invertido = invertido + palabra.charAt(i);
        }
        System.out.println("palabra = " + palabra);
        System.out.println("invertido = " + invertido);
    }
}

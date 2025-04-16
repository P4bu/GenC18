package ejercicios.ejerciciosEntrevistas;

import java.util.Scanner;

public class Invertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra para invertir: ");
        String palabra = sc.nextLine();
        String invertido = "";

        for(int i = palabra.length()-1; i >= 0; i--) {
            invertido = invertido + palabra.charAt(i);
        }

        System.out.println(palabra);
        System.out.println(invertido);
    }

}

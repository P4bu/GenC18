package ejercicios.ejerciciosEntrevistas;

import java.util.Scanner;

public class ContadorPalabras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");

        String frase = sc.nextLine();

        String[] palabras = frase.trim().split("\\s+");

        // int cantidad = (frase.trim().isEmpty()) ? 0 : palabras.length;
        int cantidad;
        if(frase.trim().isEmpty()){
            cantidad = 0;
        }
        else {
            cantidad = palabras.length;
        }
        System.out.println("Cantidad de palabras: " + cantidad);
    }
}

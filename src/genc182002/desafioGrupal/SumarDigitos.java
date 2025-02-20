package genc182002.desafioGrupal;

import java.util.Scanner;

public class SumarDigitos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Solicitar una cifra de dos o mas digitos");
        int numero = sc.nextInt();
        int suma = 0;

        while(numero != 0) {
            suma = suma + numero % 10;
            numero =  numero / 10;
        }
        System.out.println("suma = " + suma);
    }
}

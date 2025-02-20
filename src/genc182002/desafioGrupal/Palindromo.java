package genc182002.desafioGrupal;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = sc.nextLine();

        boolean palindromo = true;

        for(int i = 0; i <= palabra.length() / 2; i++) {
            if(palabra.charAt(i) != palabra.charAt(palabra.length() -1 - i)){
                palindromo = false;
                break;
            }
        }
        if(palindromo) {
            System.out.println("Es un palindromo");

        }else {
            System.out.println("No lo es");
        }



    }
}

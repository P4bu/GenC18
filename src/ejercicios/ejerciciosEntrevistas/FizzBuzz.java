package ejercicios.ejerciciosEntrevistas;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 1;

        do {
            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();
            for (int i = 0; i <= numero; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                } else if ( i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
        while(numero > 0);
    }
}

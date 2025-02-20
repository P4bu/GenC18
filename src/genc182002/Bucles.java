package genc182002;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        // While, Do While, For

        //While
        int contador = 10;
        while(contador >= 0) {
            System.out.println("contador = " + contador);
            contador--;
        }
        System.out.println("\uD83D\uDE80 Despegue!!");

        // Do-While
        // Juego de adivinanza, del 1 a 10
        Scanner sc = new Scanner(System.in);
        int intentos = 1;
        int maxIntentos = 4;
        double random = (Math.floor(Math.random() * 10)) + 1;
        int computer = (int) random;
        boolean win = false;

        System.out.println("computer = " + computer);
        
        do {
            System.out.println("Ingresa un numero");
            int player = sc.nextInt();

            if(player == computer) {
                win = true;
                break;
            } else {
                if(player < computer){
                    System.out.println("Vuelve a intentarlo con un numero mas grande");
                } else {
                    System.out.println("Vuelve a intentarlo con un numero mas pequeño");
                }
                System.out.println("Intentos = " + intentos);
                intentos++;
            }
        } while ((intentos <= maxIntentos));

        String resultado = (win == true) ? "Ganaste!! \uD83D\uDE80 " : "Perdiste! \uD83D\uDE2D";
        System.out.println(resultado);
        System.out.println("El numero de la computadora es => " + computer);


        // For
        for(int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }
        System.out.println("Despegue! \uD83D\uDE80");

        //Tabla de multiplicar
        System.out.println("Ingresa un numero para ver su multiplicacion 1 - 10");
        int numero = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (i * numero));
        }
        sc.close();
    }
}

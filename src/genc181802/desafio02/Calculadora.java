package genc181802.desafio02;

import java.util.Scanner;

public class Calculadora {
    // Crear una calculadora que reciba input del usuario
    // Guardar los input en variables
    // Realizar operaciones con las variables

    public static int sumar(int a, int b){
        return a + b;
    }
    public static int restar(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static double dividir(int a, int b){
        return (double) a / b;
    }

    public static int ingresarNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para la operacion ");
        int numero = sc.nextInt();
        return numero;
    }
    public static int opcion(Scanner sc){
        //Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        //int opcion = sc.nextInt();
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        while(true) {
            int opcion = opcion(sc);

            switch (opcion) {
                case 1:
                    System.out.println("Sumar");
                    a = ingresarNumero();
                    b = ingresarNumero();
                    System.out.println("El resultado es => " + sumar(a, b));
                    break;
                case 2:
                    System.out.println("Restar");
                    a = ingresarNumero();
                    b = ingresarNumero();
                    System.out.println("El resultado es => " + restar(a, b));
                    break;
                case 3:
                    System.out.println("Multiplicar");
                    a = ingresarNumero();
                    b = ingresarNumero();
                    System.out.println("El resultado es => " + multiplicar(a, b));
                    break;
                case 4:
                    System.out.println("Dividir");
                    a = ingresarNumero();
                    b = ingresarNumero();
                    if (b == 0) {
                        System.out.println("No se puede dividir por 0");
                        System.out.println("Ingresa un numero distito de 0");
                        b = ingresarNumero();
                    }
                    System.out.println("El resultado es => " + dividir(a, b));
                    break;
                case 5:
                    System.out.println("Adios, gracias por usar esta calculadora!");
                    return;
                default:
                    System.out.println("No ingresaste una opcion validad");
                    System.out.println("Adios");
                    break;
            }
        }
    }
}

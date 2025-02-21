package genc182102.desafio01;

import java.util.Scanner;

public class FuncionesNombres {

    public static void printNameLength(String nombre) {
        int largo = nombre.length();
        System.out.println("largo = " + largo);
    }

    public static void printFullName(String nombre, String apellido) {
        System.out.println("El hola soy " + nombre + " " + apellido);
    }

    public static void printReverseName(String nombre) {
        String reverso = "";
        for(int i = nombre.length() - 1; i >= 0; i--) {
            reverso = reverso + nombre.charAt(i);
        }
        System.out.println("nombre = " + nombre);
        System.out.println("reverso = " + reverso);
    }

    public static void printNameCharacters(String nombre) {
        for(int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
    }

    public static void main(String[] args) {

        int limite;
        int cont = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de veces a repetir");
        limite = scanner.nextInt();
        scanner.nextLine();

        do {
            // Pedir al usuario que ingrese su nombre
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            // Pedir al usuario que ingrese su apellido
            System.out.print("Ingrese su apellido: ");
            String apellido = scanner.nextLine();

            // Llamadas a las funciones
            printNameLength(nombre);
            printNameCharacters(nombre);
            printFullName(nombre, apellido);
            printReverseName(nombre);

            cont++;
        } while (cont <= limite);

        scanner.close();
    }
}

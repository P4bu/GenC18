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
            String nombre = "";
            boolean nombreValido = false;
            while (!nombreValido) {
                System.out.print("Ingrese su nombre: ");
                nombre = scanner.nextLine();

                // Verificamos si el nombre solo tiene letras
                nombreValido = true;
                for (int i = 0; i < nombre.length(); i++) {
                    if (!Character.isLetter(nombre.charAt(i))) {
                        nombreValido = false;
                        System.out.println("Error: El nombre solo puede contener letras.");
                        break;
                    }
                }
            }

            // Pedir al usuario que ingrese su apellido
            String apellido = "";
            boolean apellidoValido = false;
            while (!apellidoValido) {
                System.out.print("Ingrese su apellido: ");
                apellido = scanner.nextLine();

                // Verificamos si el apellido solo tiene letras
                apellidoValido = true;
                for (int i = 0; i < apellido.length(); i++) {
                    if (!Character.isLetter(apellido.charAt(i))) {
                        apellidoValido = false;
                        System.out.println("Error: El apellido solo puede contener letras.");
                        break;
                    }
                }
            }

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

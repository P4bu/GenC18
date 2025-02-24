package genc182102;

import java.time.LocalDate;
import java.util.Scanner;

public class Funciones {

    static String nombre;

    public static void saludo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
    }

    public int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    //Sobre carga de metodos
    public double suma(double a, double b) {
        return a + b;
    }
    public int suma(int a, int b, int c){
        return a + b + c;
    }

    public static void llamadoMetodosFechas() {
        //Clase para almacenar fecha, inicializamos con fecha actual
        LocalDate fecheHoy = LocalDate.now();
        System.out.println("fecheHoy = " + fecheHoy);
    }

    public static void main(String[] args) {
        // saludo y resta son funciones de la clase static
        saludo();
        resta(2,1);
        System.out.println(Funciones.resta(4, 3));

        // suma es una funcion de instancia sin static
        Funciones miFuncion = new Funciones();
        //miFuncion.suma(2, 4);
        System.out.println("miFuncion.suma(2, 7) = " + miFuncion.suma(2, 7));

        llamadoMetodosFechas();



    }
}

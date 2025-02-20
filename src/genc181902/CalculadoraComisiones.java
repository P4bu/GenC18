package genc181902;

import java.util.Scanner;

public class CalculadoraComisiones {
    public static void main(String[] args) {
        double ventas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese sus ventas por favor");


        if(sc.hasNextDouble()){
            ventas = sc.nextDouble();
            if(ventas > 0) {
                if(ventas > 100000) {
                    System.out.println("Aplica comision de 30%");
                    System.out.println("ventas = " + ventas);
                    System.out.println("Comision = " + ventas * 0.30);
                    System.out.println("ventas - comision = " + Math.floor(ventas - (ventas * 0.30)));
                } else if (ventas > 50000 && ventas <= 90999) {
                    System.out.println("Aplica comision de 20%");
                    System.out.println("ventas = " + ventas);
                    System.out.println("Comision = " + ventas * 0.20);
                    System.out.println("ventas - comision = " + Math.floor(ventas - (ventas * 0.20)));
                } else if (ventas > 10001 && ventas <= 40999) {
                    System.out.println("Aplica comision de 10%");
                    System.out.println("ventas = " + ventas);
                    System.out.println("Comision = " + ventas * 0.10);
                    System.out.println("ventas - comision = " + Math.floor(ventas - (ventas * 0.10)));
                } else {
                    System.out.println("No aplica comision");
                    System.out.println("ventas = " + ventas);
                }
            } else {
                System.out.print("Las ventas no pueden ser negativas");
            }
        } else {
            System.out.print("Entrada no válida.");
        }
    }
}

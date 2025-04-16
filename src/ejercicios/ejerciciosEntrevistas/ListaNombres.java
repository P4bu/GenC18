package ejercicios.ejerciciosEntrevistas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaNombres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaNombres = new ArrayList<>();

        System.out.println("Ingrese nombres de personas, escriba salir para terminar");

        while(true) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            if(nombre.equalsIgnoreCase("salir")) {
                break;
            }

            listaNombres.add(nombre);
        }

        // METODO PARA ORDENAR
        Collections.sort(listaNombres);
        System.out.println("Lista ordenada");
        for(String nombre : listaNombres){
            System.out.println(nombre);
        }

        sc.close();
    }
}

package genc182502;

import java.util.ArrayList;

public class ListasDinamicas {
    public static void main(String[] args) {
        // Arraylist es una implementacion de la interfaz list, permiten elementos duplicados

        ArrayList<String> listaPeliculas = new ArrayList<>();

        // Imprimir lista de peliculas
        System.out.println(listaPeliculas);

        // Agregar elementos a la lista
        listaPeliculas.add("Shrek");
        listaPeliculas.add("Interstelar");
        listaPeliculas.add("El Alpinista");

        System.out.println(listaPeliculas);

        // Remover un elemento por el nomnre del objeto o el indice
        listaPeliculas.remove("Interstelar");
        //listaPeliculas.remove(0);
        System.out.println("listaPeliculas nueva = " + listaPeliculas);

        // Para obtener un objeto por su indice
        System.out.println(listaPeliculas.get(1));
        // Para mostrar el largo de lista
        System.out.println(listaPeliculas.size());




    }
}

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
        listaPeliculas.add("Pollitos en Fuga");
        listaPeliculas.add("Gladiador");
        listaPeliculas.add("Volver al futuro");

        System.out.println(listaPeliculas);

        // Remover un elemento por el nomnre del objeto o el indice
        // listaPeliculas.remove(listaPeliculas.size()-1); // para el ultimo de la lista
        listaPeliculas.remove("Interstelar");
        //listaPeliculas.remove(0);
        System.out.println("listaPeliculas nueva = " + listaPeliculas);

        // Para obtener un objeto por su indice
        System.out.println(listaPeliculas.get(1));
        // Para mostrar el largo de lista
        System.out.println(listaPeliculas.size());
        // Para saber si en la lista un elemento => entrega un TRUE o FALSE
        System.out.println(listaPeliculas.contains("El Alpinista"));
        // Verificar si la lista esta vacia => True si esta vacia
        System.out.println(listaPeliculas.isEmpty());

        // Recorrer una lista por forEach
        for(String pelicula : listaPeliculas) {
            System.out.println("pelicula = " + pelicula);
        }

        // Bucle for tradicional
        /*
        for (int i = 0; i < listaPeliculas.size() ; i++) {
            System.out.println(listaPeliculas.get(i));
        } */







    }
}

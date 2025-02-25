package genc182502;

import java.util.HashSet;
import java.util.Set;

public class Conjutos {
    public static void main(String[] args) {
        // Los sets o conjutos, no permiten duplicados

        Set<String> seriesFavoritas = new HashSet<>();

        // Agregar a un set
        seriesFavoritas.add("Vikingos");
        seriesFavoritas.add("The Big Bang Theory");
        seriesFavoritas.add("Malcolm");
        seriesFavoritas.add("The Offices");
        System.out.println("Las series favoritas son:" + seriesFavoritas);

        // Agregar un dpulicado -> lo ignorara
        seriesFavoritas.add("Malcolm");
        System.out.println("seriesFavoritas = " + seriesFavoritas);

        // Eliminar un elemento
        seriesFavoritas.remove("Malcolm");

        // Verificar si existe un elemento en la lista
        System.out.println(seriesFavoritas.contains("The Office"));
        
        // Iterar por bucle
        for(String serie : seriesFavoritas) {
            System.out.println("serie = " + serie);
        }

    }
}

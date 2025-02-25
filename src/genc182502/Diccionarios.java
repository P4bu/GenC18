package genc182502;

import java.util.HashMap;
import java.util.Map;

public class Diccionarios {
    public static void main(String[] args) {
        // Los diccionarios almacenan los datos pares llave:valor (Key:Value)

        Map<String, String> entrenadorYPokemon = new HashMap<>();

        // Agregar elementos al diccionario. se usa el metodo .put
        entrenadorYPokemon.put("Francisca","Chikorita");
        entrenadorYPokemon.put("Carolina","Charmander");
        entrenadorYPokemon.put("Jorge","Umbreon");
        entrenadorYPokemon.put("Danileo","Alakazam");
        entrenadorYPokemon.put("Esteban","Gengar");

        // Imprimir el diccionario
        System.out.println(entrenadorYPokemon);
        
        // Remover un elemento
        entrenadorYPokemon.remove("Jorge");
        System.out.println("entrenadorYPokemon = " + entrenadorYPokemon);

        // Obtener un valor
        System.out.println(entrenadorYPokemon.get("Danileo"));

        //
        entrenadorYPokemon.replace("Danileo", "Mewtwo");
        System.out.println(entrenadorYPokemon);

        // Recorrer diccionarios
        // EntrySet
        for(Map.Entry<String, String> entrada : entrenadorYPokemon.entrySet()){
            // Metodo getKey() permite obtener la llave
            System.out.println("El entrenador en esta ronda es " + entrada.getKey());
            System.out.println("Su pokemon es " + entrada.getValue());
        }

        // KeySet
        for(String clave : entrenadorYPokemon.keySet()) {
            System.out.println("El entrenado en esta ronda es " + clave + " y su pokemon es " + entrenadorYPokemon.get(clave));
        }

    }
}

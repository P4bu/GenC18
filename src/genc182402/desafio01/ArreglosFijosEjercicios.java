package genc182402.desafio01;

/*1. **Dados un arreglo de números y un arreglo de Strings, te corresponde llevar a cabo lo siguiente:
a. En el arreglo de números:
    - Obtener el máximo y el mínimo
    - Contar elementos pares e impares dentro del arreglo
    - Ordenar el arreglo en orden ascendente
    - Buscar duplicados dentro del arreglo
b. En el arreglo de String:
    - Contar las vocales de cada texto
    - Ordenar alfabéticamente
    - Encontrar el texto más largo
    - Concatenar todos los textos sin usar +
2. **Ejecución y Pruebas:**
    - Ejecuta el programa y verifica lo solicitado mediante impresiones en consola Arreglo de Arreglo de String */

import java.util.Arrays;

public class ArreglosFijosEjercicios {

    public static void main(String[] args) {
        int[] numeros = {10, 5, 20, 15, 25, 10, 30, 15, 5, 40};

        int mayor = numeros[0];
        int menor = numeros[0];
        for(int i = 1; i < numeros.length; i++) {
            if(numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if(numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("mayor = " + mayor);
        System.out.println("menor = " + menor);

        int par = 0;
        int noPar = 0;
        for(int elemento : numeros) {
            String esPar = (elemento % 2 == 0) ? "Es Par" : "No es par";
            System.out.println( " El numero " + elemento + " esPar = " + esPar);
            if(elemento % 2 == 0) {
                par++;
            } else {
                noPar++;
            }
        }
        System.out.println("noPar = " + noPar);
        System.out.println("par = " + par);

        int[] arregloAsc = numeros.clone();
        Arrays.sort(arregloAsc);
        System.out.println("El arreglo ordenado es =>" + Arrays.toString(arregloAsc));

        //TODO: Hacer el buscar los numero unicos del arreglo.

        String[] mascotas = {"Perro", "Cabra", "Caballo", "Pez", "Gato", "Loro", "Araña", "Capibara", "Hamster", "Vaca", "Cocodrilo"};

        for(String palabra : mascotas) {
            int contVocales = 0;

            for (int i = 0; i < palabra.length(); i++) {
                char vocal = palabra.charAt(i);

                if("aeiou".indexOf(vocal) != -1) {
                    contVocales++;
                }
            }
            System.out.println("la palabra " + palabra + " tiene = " + contVocales);
        }

        String[] mascotasClone = mascotas.clone();
        Arrays.sort(mascotasClone);
        System.out.println("mascotas = " + Arrays.toString(mascotas));
        System.out.println("Las mascotas ordenadas son: " + Arrays.toString(mascotasClone));


        String palabraLarga = "";
        for(String palabra : mascotas) {
            if(palabra.length() > palabraLarga.length()) {
                palabraLarga = palabra;
            }
        }
        System.out.println("palabraMasLarga = " + palabraLarga);

        for(String palabra : mascotas){
            System.out.println(" mascota: ".concat(palabra));
        }

    }
}

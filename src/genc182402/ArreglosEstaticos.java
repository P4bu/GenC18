package genc182402;

import java.util.Arrays;

public class ArreglosEstaticos {
    //Los arrays en java fijos por naturaleza, esto quiere decir que no pueden aunmentar su longitud.

    public static void main(String[] args) {

        // Declaramos un arreglo de numeros
        int[] numerosDelUnoAlDiez = {1,2,3,4,5,6,7,8,9,10};
        // Imprime su espacio en memoria
        System.out.println("Mis numeros del uno al diez son : " + numerosDelUnoAlDiez);

        // Se debe usar la clase Arrays.toString()
        System.out.println("Para ver el contenido se debe usar " + Arrays.toString(numerosDelUnoAlDiez));

        // Para acceder a un indice en panticular de un arreglo se usa su numoer
        System.out.println("El elemento en el indice 5 es " + numerosDelUnoAlDiez[5]);

        // Arreglo vacio
        int [] arregloVacio = new int[5];
        System.out.println("arregloVacio = " + arregloVacio);
        System.out.println("Arrays.toString(arregloVacio) = " + Arrays.toString(arregloVacio));

        arregloVacio[0] = 1;

        // recorrer arreglos -> bucles
        for (int i = 0; i < arregloVacio.length; i++) {
            arregloVacio[i] = i;
            System.out.println("Arreglo en indice -> " + arregloVacio[i]);
            System.out.println(Arrays.toString(arregloVacio));
        }

        // Foreach -> simplifica la tarea para trabajar con estructurasa de datos
        for(int elemento : arregloVacio) {
            System.out.println(elemento);
        }
        
        // Calcular la suma de los numeros del arreglo
        int suma = 0;
        for(int numero : arregloVacio) {
            suma = suma + numero;
        }
        System.out.println("la suma de los numeros del arreglo es = " + suma);


    }
}

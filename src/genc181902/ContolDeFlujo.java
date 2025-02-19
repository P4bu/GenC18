package genc181902;

import java.util.Scanner;

public class ContolDeFlujo {
    public static void main(String[] args) {
        // If, Else, Else If

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = sc.nextLine();
        System.out.println("Ingrese su edad");
        Integer age = sc.nextInt();
        System.out.println("Tienes tu carnet?");
        sc.nextLine();
        String answer = sc.nextLine();

        // Verificar si la edad es mayor a 18
        if ((answer.equalsIgnoreCase("si"))) {
            System.out.println("Perfecto!");

            if ((age >= 18)) {
                System.out.println("Perfecto, " +name+ " puedes pasar!.");
            }
            else {
                System.out.println("Oh oh!, " +name+ " No puedes pasar!.");
            }
        }
        else {
            System.out.println("Sin carnet no puedes pasar!");
        }
    }
}

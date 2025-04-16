package ejercicios.ejerciciosEntrevistas;

public class ParImpar {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            String resultado = i % 2 == 0 ? "Es par" : "Impar";
            System.out.println((i) + " = " + resultado);
        }
    }
}

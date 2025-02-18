package genc181802;

public class Operaciones {
    public static void main(String[] args) {

        // Operadores arismeticos
        // +, -, *, /, %
        int a = 10;
        int b = 5;
        final int c = 20; // para definir una constante
        
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
        
        resultado = resultado - a;
        System.out.println("resultado = " + resultado);
        
        resultado = resultado * b;
        System.out.println("resultado = " + resultado);
        
        resultado = c/b;
        System.out.println("resultado = " + resultado);
    }
}

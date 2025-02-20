package genc181902;

public class Operadores {
    public static void main(String[] args) {
        // Operadores lógicos
        boolean a = true;
        boolean b = false;

        // AND lógico (&&)
        boolean resultadoAnd = a && b;
        System.out.println("a && b = " + resultadoAnd); // false, porque uno es false

        // OR lógico (||)
        boolean resultadoOr = a || b;
        System.out.println("a || b = " + resultadoOr); // true, porque uno es true

        // NOT lógico (!)
        boolean resultadoNot = !a;
        System.out.println("!a = " + resultadoNot); // false, porque a es true


        // Operadores de comparación
        int x = 5;
        int y = 10;

        // Mayor que (>)
        boolean mayorQue = x > y;
        System.out.println("x > y = " + mayorQue); // false, porque 5 no es mayor que 10

        // Menor que (<)
        boolean menorQue = x < y;
        System.out.println("x < y = " + menorQue); // true, porque 5 es menor que 10

        // Igual a (==)
        boolean igualA = x == y;
        System.out.println("x == y = " + igualA); // false, porque 5 no es igual a 10

        // Diferente de (!=)
        boolean diferenteDe = x != y;
        System.out.println("x != y = " + diferenteDe); // true, porque 5 es diferente de 10

        // Mayor o igual que (>=)
        boolean mayorOIgualQue = x >= y;
        System.out.println("x >= y = " + mayorOIgualQue); // false, porque 5 no es mayor ni igual a 10

        // Menor o igual que (<=)
        boolean menorOIgualQue = x <= y;
        System.out.println("x <= y = " + menorOIgualQue); // true, porque 5 es menor o igual a 10

        // Operadores de incremento y decremento
        int z = 5;

        // Incremento
        System.out.println("Valor de z antes de incremento: " + z); // 5
        System.out.println("Incremento postfijo: " + z++); // Primero se usa, luego se incrementa. Imprime 5
        System.out.println("Valor de z después de incremento postfijo: " + z); // 6

        // Incremento prefijo
        System.out.println("Incremento prefijo: " + ++z); // Primero se incrementa, luego se usa. Imprime 7
        System.out.println("Valor de z después de incremento prefijo: " + z); // 7

        // Decremento
        System.out.println("Valor de z antes de decremento: " + z); // 7
        System.out.println("Decremento postfijo: " + z--); // Primero se usa, luego se decrementa. Imprime 7
        System.out.println("Valor de z después de decremento postfijo: " + z); // 6

        // Decremento prefijo
        System.out.println("Decremento prefijo: " + --z); // Primero se decrementa, luego se usa. Imprime 5
        System.out.println("Valor de z después de decremento prefijo: " + z); // 5
    }
}

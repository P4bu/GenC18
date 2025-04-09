package ejercicios;

public class NumeroPrimos {
    public static boolean esPrimo(int num){
        // si el numero es menor a 1 no es primo
        if(num <= 1){
            return false;
        }
        // si tiene divisibles hasta su raiz cuadrada (sqrt) no es primo
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        // no cumple ninguna de las anteriores es PRIMO.
        return true;
    }
    public static void main(String[] args) {
        for (int num = 2; num <= 50; num ++){
            if(esPrimo(num)) {
                System.out.println("Es primo = " + num);
            }
        }
    }
}
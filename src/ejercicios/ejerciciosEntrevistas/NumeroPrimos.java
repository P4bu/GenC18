package ejercicios.ejerciciosEntrevistas;

// TODO: Cuando el numero es divisible por si mismo y por uno.

public class NumeroPrimos {
    public static boolean esPrimo(int num){
        if(num <= 1){
            return false;
        }
        // verifica la cantidad de divisores por su raiz cuadrada (sqrt)
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
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

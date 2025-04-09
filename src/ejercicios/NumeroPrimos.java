package ejercicios;

public class NumeroPrimos {
    public static boolean esPrimo(int num){
        if(num <= 1){
            return false;
        }
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
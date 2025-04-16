package ejercicios.ejerciciosEntrevistas;

public class ValidarEdad {
    public static void validarEdad(int edad){
        if(edad >= 0 && edad < 14) {
            System.out.println("Es un niño");

        } else if(edad >=14 && edad < 21) {
            System.out.println("Es un adolecente");
        } else if(edad > 21 && edad < 60 ) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es un adulto mayor");
        }
    }

    public static void main(String[] args) {
        int edad = 1;
        validarEdad(edad);
    }
}

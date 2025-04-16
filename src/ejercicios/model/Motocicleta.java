package ejercicios.model;

public class Motocicleta extends Vehiculo{

    String color;

    public Motocicleta(String nombre, int cantidadRuedas){
        super(nombre, cantidadRuedas);
    }

    @Override
    public void hacerSonido(){
        System.out.println("BRBRBRBRBRB");
    }
}

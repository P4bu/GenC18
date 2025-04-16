package ejercicios.model;

public class Vehiculo {

    private String nombre;
    private int cantidadRuedas;

    public Vehiculo(String nombre, int cantidadRuedas) {
        this.nombre = nombre;
        this.cantidadRuedas = cantidadRuedas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public void hacerSonido(){

    }

}

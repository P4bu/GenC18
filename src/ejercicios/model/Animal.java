package ejercicios.model;

public class Animal {

    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animal(){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void hacerSonido(){
        System.out.println("sonido");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Clase Animal{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }
}

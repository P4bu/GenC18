package genc180303;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    //A traves de esta clase podemos interactuar con nuestro sistema de archivos

    public static void main(String[] args) {
        crearCarpeta("nuevaCarpeta");
        crearArchivo("nuevoArchivo.txt");
        escribirArchivo("src/genc180303/archivo.txt", "Hola estamos escribiendo el archivo");
        leerArchivo("src/genc180303/archivo.txt");
    }

    public static void crearCarpeta(String nombreCarpeta) {
        //Ruta donde se creara la carpeta
        String ruta = "src/genc180303/";
        File carpeta = new File(ruta + nombreCarpeta);

        if(!carpeta.exists()) {
            carpeta.mkdirs();
            System.out.println("La carpeta ya fue creada en la ruta " + carpeta.getPath());
        } else {
            System.out.println("La carpeta ya existe");
        }
    }

    public static void crearArchivo(String nombreArchivo)  {
        String ruta = "src/genc180303/";
        File archivo = new File(ruta + nombreArchivo);

        //Bloque Try-Catch, permite probar un bloque de codigo y capturar la excepcion al error
        try {
            if(!archivo.exists()){
                archivo.createNewFile();
                System.out.println("El archivo a sido creado en " + archivo.getPath());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
    }

    public static void escribirArchivo(String ruta, String contenido) {
        try (FileWriter writer = new FileWriter(ruta)) {
            writer.write(contenido);
            System.out.println("Contenido agregadp");
        } catch (IOException e) {
            System.out.println("ERROR: en la escritura del archivo" + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta si o si");
        }
    }

    public static void leerArchivo(String ruta) {
        try (FileReader reader = new FileReader(ruta)) {
            int posicionCaracter;
            while((posicionCaracter = reader.read()) != -1) {
                System.out.println((char) posicionCaracter);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

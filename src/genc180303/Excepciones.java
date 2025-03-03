package genc180303;

import java.io.FileNotFoundException;

public class Excepciones {

    static Throwable miExcepcion = new Exception();
    static Throwable miExcepcionPersonalizada = new FileNotFoundException("Este es una excepcion personalizada");

    public static void main(String[] args) {


        miExcepcion.printStackTrace();
        miExcepcionPersonalizada.printStackTrace();
    }
}

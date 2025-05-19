package com.BYjosep;

import java.io.*;

public class Ejercicio7 {
    private static final String FILE = Config.FILE_PATH + "ejercicio7";

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(FILE);



        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {



        } catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        } catch (IOException ioe) {
            System.out.println("Error de lectura del archivo");
            System.exit(-1);
        }
    }


}




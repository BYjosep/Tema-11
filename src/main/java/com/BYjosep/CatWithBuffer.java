package com.BYjosep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CatWithBuffer {
    public static void main(String[] args) {
        if(args.length != 1) {
            throw new RuntimeException("Debe indicar la ruta del archivo");
        }

        String rutaArchivo = args[0];

        File file = new File(rutaArchivo);

        try (FileReader fr = new FileReader(file)){
            int caracter;
            char[] txt = new char[1024];
            int cantidad;
            while (( cantidad = fr.read(txt))>=0 ) {
                for(int i = 0; i<cantidad; i++) {
                    System.out.print(txt[i]);
                }
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        } catch (IOException ioe) {
            System.out.println("Error de lectura del archivo");
            System.exit(-1);
        }

    }
}

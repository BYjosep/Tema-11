package com.BYjosep;

import java.io.*;

public class WriteText {
    private static final String FILE = Config.FILE_PATH+"Data.txt";

    public static void main(String[] args) {
        if(args.length != 1) {
            throw new RuntimeException("Debe indicar la ruta del archivo");
        }

        String texto = args[0];
        File file = new File(FILE);
        boolean append = file.exists();

        try (FileWriter fileWriter = new FileWriter(file, append)) {
            fileWriter.write(texto);

        } catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        } catch (IOException ioe) {
            System.out.println("Error de lectura del archivo");
            System.exit(-1);
        }


    }
}

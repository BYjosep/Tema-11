package com.BYjosep.ejercicio2;

import com.BYjosep.Config;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    private static String PATH = Config.FILE_PATH;

    public static void main(String[] args) {
        File file = new File(PATH);

        if (!file.exists()) {
            System.out.println("No existe el archivo/directorio");
            System.exit(-1);
        }
        if (file.isFile()) {
            System.out.println("Solo indique carpetas");
        }

        File[] archivos = file.listFiles();

        for (File archivo : archivos) {
            System.out.println(archivo.getName());
        }
    }
}

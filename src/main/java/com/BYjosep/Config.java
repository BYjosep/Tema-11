package com.BYjosep;

import java.io.File;

public class Config {
    public static final String FILE_PATH= "/home/arch/Public/ficheros/";

    public static boolean comprobarArchivo(File file){
        if (!file.exists()) {
            System.out.println("No existe el archivo/directorio");
            System.exit(-1);
        }
        return file.isFile();
    }

    public static boolean comprobarDirectorio(File file){
        if (!file.exists()) {
            System.out.println("No existe el archivo/directorio");
            System.exit(-1);
        }
        return file.isDirectory();
    }

}

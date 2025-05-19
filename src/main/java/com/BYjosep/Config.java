package com.BYjosep;

import com.BYjosep.Exeptions.FileFoundExeption;

import java.io.File;
import java.io.FileNotFoundException;

public class Config {

    /*
    Está hecho para ser guardado en la carpeta ficheros del derectorio public del usuario que lo ejecute
    Forma de uso:
        1- Esperar una entrada para conformar la ruta absoluta del archivo
        2- Al crear la variable concatenarlo con el archivo de destino que se quiera acceder ya sea escritura o lectura
     */
    public static final String FILE_PATH= "/home/"+System.getProperty("user.name")+"/Public/ficheros/";


    public static void comprobarArg(String[] args, int numeroPermitidoDeArgumentos,boolean fileExist) throws FileNotFoundException, FileFoundExeption {
        if(args.length != numeroPermitidoDeArgumentos ) {
            throw new RuntimeException("Debe indicar la ruta del archivo");
        }
        for(int i = 0; i < args.length; i++) {
            if(fileExist && !new File(FILE_PATH).exists()) {
                throw new FileNotFoundException("El archivo no existe");
            }
            if(!fileExist && new File(FILE_PATH).exists()) {
                throw new FileFoundExeption("El archivo existe, pero no tiene que existir");
            }

        }
    }
}

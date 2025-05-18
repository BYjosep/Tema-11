package com.BYjosep;

import com.BYjosep.ejemplos.Cat;

import java.io.*;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        String FILE = Config.FILE_PATH;
        Scanner sc = new Scanner(System.in);
        if(args.length != 2) {
            throw new RuntimeException("Debe indicar la ruta del archivo");
        }

        System.out.println("Ingrese el archivo que desea salir");
        FILE =FILE+ sc.nextLine();
        String[] texto1 = new String[]{args[0]};
        String[] texto2 = new String[]{args[1]};
        File file = new File(FILE);

        if (file.exists()){
            System.out.println("El archivo ya existe");
            sc.close();
            System.exit(0);

        }

        try (FileWriter fw = new FileWriter(file)) {

            System.out.println("La ruta del archivo es: " + file.getAbsolutePath());
            fw.write(Cat.main(texto1));

            fw.write(System.lineSeparator());

            fw.write(Cat.main(texto2));

        } catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        } catch (IOException ioe) {
            System.out.println("Error de lectura del archivo");
            System.exit(-1);
        }
    }
}

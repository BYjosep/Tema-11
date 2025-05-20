package com.BYjosep.extra;

import com.BYjosep.Config;
import com.BYjosep.Exeptions.FileFoundExeption;

import java.io.*;

public class TextoAMorse {

    private static final String SALIDA = Config.FILE_PATH+"Traduccion_a_morse.txt";
    public static void main(String[] args) {
        try {
            Config.comprobarArg(args,1,true);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        } catch (FileFoundExeption e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        File original = new File(args[0]);

        traduccionAMorse(original);

        System.out.println("Se ha terminado co en proceso");
    }

    private static void traduccionAMorse(File original) {
        File traduccion = new File(SALIDA);

        try(BufferedReader br = new BufferedReader(new FileReader(original));
        BufferedWriter bw = new BufferedWriter(new FileWriter(traduccion))) {

            String line;
            while ((line = br.readLine()) != null) {
                for ( char caracter: line.toLowerCase().toCharArray()){
                    bw.write(Diccionario.MORSE_MAP.getOrDefault(caracter,caracter+" "));
                }
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            System.exit(-1);
        } catch (IOException e) {
            System.exit(-2);
        }
    }

}

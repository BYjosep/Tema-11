package com.BYjosep;

import java.io.*;

public class GuardarNumeroComoBinario {
    private static final String FILE = Config.FILE_PATH + "datos.bin";

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new RuntimeException("El numero a guardar");
        }
        int numero = 0;
        try {
            numero = Integer.parseInt(args[0]);

        }catch (NumberFormatException nfe) {
            System.out.println("Solo numeros por favor");
            System.exit(-1);
        }

        File file = new File(FILE);
        //boolean append = file.exists();
        boolean append = false;
        byte b0 = (byte) (numero & 0x00FF);
        byte b1 = (byte) ((numero  & 0x00FF00)>>8);
        byte b2 = (byte) ((numero  & 0x00FF0000)>>16);
        byte b3 = (byte) ((numero  & 0x00FF000000)>>24);
        try (FileOutputStream fos = new FileOutputStream(file, append)) {
            fos.write(b3);
            fos.write(b2);
            fos.write(b1);
            fos.write(b0);

        } catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        } catch (IOException ioe) {
            System.out.println("Error de lectura del archivo");
            System.exit(-1);
        }


        try(DataInputStream dis = new DataInputStream(new FileInputStream(file))){
            System.out.println(dis.readInt());
        }catch (FileNotFoundException fnfe) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        } catch (IOException ioe) {
            System.out.println("Error de lectura del archivo");
            System.exit(-1);
        }

    }
}

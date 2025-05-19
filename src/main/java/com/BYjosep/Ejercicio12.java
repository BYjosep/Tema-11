package com.BYjosep;

import com.BYjosep.Exeptions.FileFoundExeption;
import com.BYjosep.recursos.DNI;

import java.io.*;

public class Ejercicio12 {
    private static final File LOG = new File(Config.FILE_PATH+"ej12.log");

    public static void main(String[] args) throws IOException {
        try {
            Config.comprobarArg(args, 1, true);
        } catch (FileNotFoundException e) {
            System.exit(-1);
        } catch (FileFoundExeption e) {
            System.exit(-2);

        }
        File file = new File(args[0]);
        File temp = File.createTempFile("ej12", ".temp");
        File resultado = new File(Config.FILE_PATH+"resultado_Ej12_ConLetra");

        if (!LOG.exists()) {
            boolean creado = LOG.createNewFile(); // Crea el archivo vacío
            if (creado) {
                System.out.println("Archivo creado correctamente.");
            } else {
                System.out.println("No se pudo crear el archivo.");
            }
        }

        String tmp= readFile(file,true);

        writeToFile(temp, tmp);

        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(temp))){
            for (String line; (line = br.readLine()) != null; ) {
                sb.append(line).append(DNI.obtenerLetraDNI(Integer.parseInt(line))).append("\n");
            }
        }

        writeToFile(resultado, sb.toString());


        temp.deleteOnExit();

    }


    private static String readFile(File file, boolean debug) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader fr = new BufferedReader(new FileReader(file));
             FileWriter fw = new FileWriter(LOG, true)) {

            for(String line; (line =fr.readLine())!=null; ){
                if (line.length() < 8) {
                    sb.append(String.format("%08d\n", Integer.parseInt(line)));

                }
                if (line.length() > 8) {
                    if (debug) {
                        String lin = "El DNI: " + line + " no se ha añadido, es demasiado largo";
                        fw.write(lin+"\n");
                        System.out.println(lin);
                    }
                }
            }

        } catch(IOException ioe) {
            System.out.println(ioe.getCause());
            System.exit(-1);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
        return sb.toString();
    }

    private static void writeToFile(File file, String content) throws IOException {
        try (FileWriter fw = new FileWriter(file)) {

            fw.write(content);
        }catch(IOException e) {
            System.out.println(e.getCause());
        }
    }
}

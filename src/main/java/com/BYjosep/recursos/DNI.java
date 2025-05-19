package com.BYjosep.recursos;

public class DNI {


    /**
     * Obtiene la letra del NIF que le corresponde al dni indicado
     *
     * @param dni El dni
     * @return La letra que le corresponde al dni indicado
     */
    public static char obtenerLetraDNI(int dni) {
        String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
        int posLetra = dni % 23;
        return tabla.charAt(posLetra);
    }
}

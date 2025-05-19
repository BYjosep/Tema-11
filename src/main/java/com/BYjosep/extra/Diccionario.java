package com.BYjosep.extra;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    public final Map<Character, String> diccionario = new HashMap<Character, String>();

    private void ponerValoresEnDiccionario() {
        final char[] caracteres = {'a','b','c','d','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y'}
         final String[] morse = {"dfsa","sd"};

        for (int i = 0; i < caracteres.length; i++) {
            diccionario.put(caracteres[i], morse[i]);
        }
    }


}

package com.BYjosep.extra;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    public final Map<Character, String> diccionario = new HashMap<Character, String>();

        public static final Map<Character, String> MORSE_MAP;

        static {
            Map<Character, String> morseTemp = new HashMap<>();

            // Letras del abecedario español en minúsculas
            morseTemp.put('a', ".- ");
            morseTemp.put('b', "-... ");
            morseTemp.put('c', "-.-. ");
            morseTemp.put('d', "-.. ");
            morseTemp.put('e', ". ");
            morseTemp.put('f', "..-. ");
            morseTemp.put('g', "--. ");
            morseTemp.put('h', ".... ");
            morseTemp.put('i', ".. ");
            morseTemp.put('j', ".--- ");
            morseTemp.put('k', "-.- ");
            morseTemp.put('l', ".-.. ");
            morseTemp.put('m', "-- ");
            morseTemp.put('n', "-. ");
            morseTemp.put('ñ', "--.-- ");
            morseTemp.put('o', "--- ");
            morseTemp.put('p', ".--. ");
            morseTemp.put('q', "--.- ");
            morseTemp.put('r', ".-. ");
            morseTemp.put('s', "... ");
            morseTemp.put('t', "- ");
            morseTemp.put('u', "..- ");
            morseTemp.put('v', "...- ");
            morseTemp.put('w', ".-- ");
            morseTemp.put('x', "-..- ");
            morseTemp.put('y', "-.-- ");
            morseTemp.put('z', "--.. ");

            // Números del 0 al 9
            morseTemp.put('0', "----- ");
            morseTemp.put('1', ".---- ");
            morseTemp.put('2', "..--- ");
            morseTemp.put('3', "...-- ");
            morseTemp.put('4', "....- ");
            morseTemp.put('5', "..... ");
            morseTemp.put('6', "-.... ");
            morseTemp.put('7', "--... ");
            morseTemp.put('8', "---.. ");
            morseTemp.put('9', "----. ");

            // Caracteres especiales
            morseTemp.put(' ', "/ ");
            morseTemp.put(',', "--..-- ");
            morseTemp.put('.', ".-.-.- ");

            MORSE_MAP = Collections.unmodifiableMap(morseTemp);
        }
    }

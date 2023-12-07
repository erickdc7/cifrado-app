package com.proyecto.cifrado;

import java.util.ArrayList;

public class CifradoAnagrama {

    public static ArrayList<String> cifrar(String input) {
        ArrayList<String> anagramas = new ArrayList<>();
        generarAnagramas("", input, anagramas);
        return anagramas;
    }

    private static void generarAnagramas(String prefijo, String resto, ArrayList<String> anagramas) {
        int n = resto.length();
        if (n == 0) {
            // Si no hay más letras en 'resto', se agrega el anagrama a la lista
            anagramas.add(prefijo);
        } else {
            for (int i = 0; i < n; i++) {
                // Llamada recursiva con nuevas 'prefijo' y 'resto'
                generarAnagramas(prefijo + resto.charAt(i), resto.substring(0, i) + resto.substring(i + 1, n), anagramas);
            }
        }
    }

}

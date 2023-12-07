package com.proyecto.cifrado;

public class CifradoClaveContinua {

    public static String cifrarConClaveContinua(String texto, String clave) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            int claveIndex = i % clave.length();
            char claveChar = clave.charAt(claveIndex);

            resultado.append((char) (caracter + claveChar));
        }

        return resultado.toString();
    }

    public static String descifrarConClaveContinua(String textoCifrado, String clave) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < textoCifrado.length(); i++) {
            char caracterCifrado = textoCifrado.charAt(i);
            int claveIndex = i % clave.length();
            char claveChar = clave.charAt(claveIndex);

            resultado.append((char) (caracterCifrado - claveChar));
        }

        return resultado.toString();
    }

}

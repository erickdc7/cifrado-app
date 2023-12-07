package com.proyecto.cifrado;

public class CifradoBeaufort {

    public static String cifrar(String texto, String clave) {
        clave = clave.toUpperCase();
        StringBuilder textoCifrado = new StringBuilder();
        texto = texto.toUpperCase();

        for (int i = 0, j = 0; i < texto.length(); i++) {
            char caracterActual = texto.charAt(i);

            if (Character.isLetter(caracterActual)) {
                char caracterCifrado = (char) ('Z' - (clave.charAt(j) - caracterActual) % 26);
                textoCifrado.append(caracterCifrado);
                j = (j + 1) % clave.length();
            } else {
                textoCifrado.append(caracterActual);
            }
        }

        return textoCifrado.toString();
    }

    public static String descifrar(String textoCifrado, String clave) {
        clave = clave.toUpperCase();
        StringBuilder textoPlano = new StringBuilder();
        textoCifrado = textoCifrado.toUpperCase();

        for (int i = 0, j = 0; i < textoCifrado.length(); i++) {
            char caracterActual = textoCifrado.charAt(i);

            if (Character.isLetter(caracterActual)) {
                char caracterDescifrado = (char) ('Z' - (clave.charAt(j) - caracterActual) % 26);
                textoPlano.append(caracterDescifrado);

                j = (j + 1) % clave.length();
            } else {
                textoPlano.append(caracterActual);
            }
        }

        return textoPlano.toString();
    }

}

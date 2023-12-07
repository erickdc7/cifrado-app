package com.proyecto.cifrado;

public class CifradoVigenere {

    public static String cifrar(String texto, String clave) {
        clave = clave.toUpperCase();
        StringBuilder textoCifrado = new StringBuilder();
        texto = texto.toUpperCase();

        for (int i = 0, j = 0; i < texto.length(); i++) {
            char caracterActual = texto.charAt(i);

            if (Character.isLetter(caracterActual)) {
                char caracterCifrado = (char) ((caracterActual + clave.charAt(j) - 2 * 'A') % 26 + 'A');
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
                char caracterDescifrado = (char) ((caracterActual - clave.charAt(j) + 26) % 26 + 'A');
                textoPlano.append(caracterDescifrado);

                j = (j + 1) % clave.length();
            } else {
                textoPlano.append(caracterActual);
            }
        }

        return textoPlano.toString();
    }
}

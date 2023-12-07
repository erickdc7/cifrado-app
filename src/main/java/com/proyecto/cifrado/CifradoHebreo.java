package com.proyecto.cifrado;

public class CifradoHebreo {

    public static String cifrar(String textoPlano) {
        textoPlano = textoPlano.toUpperCase();
        StringBuilder textoCifrado = new StringBuilder();

        for (char c : textoPlano.toCharArray()) {
            if (Character.isLetter(c)) {
                int indice = c - 'A';
                int nuevoIndice = 25 - indice;  // Inversión del índice
                char nuevaLetra = (char) ('A' + nuevoIndice);
                textoCifrado.append(nuevaLetra);
            } else {
                textoCifrado.append(c);
            }
        }

        return textoCifrado.toString();
    }

    public static String descifrar(String textoCifrado) {
        StringBuilder textoPlano = new StringBuilder();

        for (char c : textoCifrado.toCharArray()) {
            if (Character.isLetter(c)) {
                int indice = c - 'A';
                int nuevoIndice = 25 - indice;  // Inversión del índice
                char nuevaLetra = (char) ('A' + nuevoIndice);
                textoPlano.append(nuevaLetra);
            } else {
                textoPlano.append(c);
            }
        }

        return textoPlano.toString();
    }

}

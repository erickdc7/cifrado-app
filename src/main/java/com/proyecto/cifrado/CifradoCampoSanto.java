package com.proyecto.cifrado;

public class CifradoCampoSanto {

    private static final char[][] CUADRICULA_PIGPEN = {
        {' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' '}
    };

    public static String cifrar(String textoPlano) {
        textoPlano = textoPlano.toUpperCase();
        StringBuilder textoCifrado = new StringBuilder();

        for (char c : textoPlano.toCharArray()) {
            if (Character.isLetter(c)) {
                int indice = c - 'A';
                int fila = indice / 7;
                int columna = indice % 7;
                textoCifrado.append(CUADRICULA_PIGPEN[fila][columna]);
            } else {
                textoCifrado.append(c);
            }
        }

        return textoCifrado.toString();
    }

    public static String descifrar(String textoCifrado) {
        StringBuilder textoPlano = new StringBuilder();

        for (char c : textoCifrado.toCharArray()) {
            boolean encontrado = false;
            for (int fila = 0; fila < 3; fila++) {
                for (int columna = 0; columna < 7; columna++) {
                    if (CUADRICULA_PIGPEN[fila][columna] == c) {
                        textoPlano.append((char) ('A' + fila * 7 + columna));
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) {
                    break;
                }
            }

            if (!encontrado) {
                textoPlano.append(c);
            }
        }

        return textoPlano.toString();
    }

}

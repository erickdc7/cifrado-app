package com.proyecto.cifrado;

import java.util.Arrays;

public class CifradoTrasposicion {

    public static String cifrar(String texto, int[] permutacion) {
        texto = texto.replaceAll("\\s", "");
        int longitud = texto.length();
        int grupos = permutacion.length;

        // Calcular el número de filas necesarias
        int filas = (int) Math.ceil((double) longitud / grupos);

        // Crear una matriz para almacenar el texto
        char[][] matriz = new char[filas][grupos];

        // Llenar la matriz con el texto en claro
        int indice = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < grupos; j++) {
                if (indice < longitud) {
                    matriz[i][j] = texto.charAt(indice);
                    indice++;
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        // Construir el texto encriptado utilizando la permutación
        StringBuilder textoEncriptado = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j : permutacion) {
                textoEncriptado.append(matriz[i][j - 1]);
            }
        }

        return textoEncriptado.toString();
    }

    public static String descifrar(String textoEncriptado, int[] permutacion) {
        int longitud = textoEncriptado.length();
        int grupos = permutacion.length;

        // Calcular el número de filas necesarias
        int filas = (int) Math.ceil((double) longitud / grupos);

        // Crear una matriz para almacenar el texto encriptado
        char[][] matrizEncriptada = new char[filas][grupos];

        // Llenar la matriz encriptada con el texto encriptado
        int indice = 0;
        for (int i = 0; i < filas; i++) {
            for (int j : permutacion) {
                if (indice < longitud) {
                    matrizEncriptada[i][j - 1] = textoEncriptado.charAt(indice);
                    indice++;
                } else {
                    matrizEncriptada[i][j - 1] = ' ';
                }
            }
        }

        // Construir el texto original a partir de la matriz encriptada
        StringBuilder textoOriginal = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < grupos; j++) {
                textoOriginal.append(matrizEncriptada[i][j]);
            }
        }

        return textoOriginal.toString().trim(); // Eliminar espacios en blanco al final
    }
}

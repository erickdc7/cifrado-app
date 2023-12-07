package com.proyecto.cifrado;

public class CifradoPorConversionBase {

    private static final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZÑ";

    public static String cifrar(String mensaje) {
        StringBuilder mensajeCifrado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);

            if (Character.isLetter(caracter)) {
                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
                int indice = (caracter - base + 1) % ALFABETO.length();
                mensajeCifrado.append(indice).append(" ");
            } else {
                mensajeCifrado.append(caracter);
            }
        }

        return mensajeCifrado.toString().trim();
    }

    public static String descifrar(String mensajeCifrado) {
        String[] indices = mensajeCifrado.split("\\s+");
        StringBuilder mensajeDescifrado = new StringBuilder();

        for (String indiceStr : indices) {
            if (!indiceStr.isEmpty()) {
                int indice = Integer.parseInt(indiceStr);
                char caracter = ALFABETO.charAt((indice - 1 + ALFABETO.length()) % ALFABETO.length());
                mensajeDescifrado.append(caracter);
            }
        }

        return mensajeDescifrado.toString();
    }

}

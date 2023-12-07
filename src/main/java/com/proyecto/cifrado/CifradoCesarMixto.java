package com.proyecto.cifrado;

public class CifradoCesarMixto {

    // Alfabeto original
    private static final String ALPHABET_M = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

    // Alfabeto de cifrado
    private static final String ALPHABET_C = "[«»{}x♥-+/≠#@%&()=><012345";

    public static String cifrar(String mensaje) {
        StringBuilder mensajeCifrado = new StringBuilder();

        for (char caracter : mensaje.toCharArray()) {
            if (Character.isLetter(caracter)) {
                // Obtener la posición en el alfabeto M
                int posicion = ALPHABET_M.indexOf(Character.toUpperCase(caracter));

                // Obtener el caracter correspondiente en el alfabeto C
                char caracterCifrado = ALPHABET_C.charAt(posicion);

                // Mantener la misma mayúscula o minúscula del caracter original
                if (Character.isLowerCase(caracter)) {
                    caracterCifrado = Character.toLowerCase(caracterCifrado);
                }

                mensajeCifrado.append(caracterCifrado);
            } else {
                // Si no es una letra, simplemente añadir al resultado sin cifrar
                mensajeCifrado.append(caracter);
            }
        }

        return mensajeCifrado.toString();
    }

    public static String descifrar(String mensajeCifrado) {
        StringBuilder mensajeDescifrado = new StringBuilder();

        for (char caracter : mensajeCifrado.toCharArray()) {
            if (ALPHABET_C.contains(String.valueOf(caracter))) {

                // Obtener la posición en el alfabeto C
                int posicion = ALPHABET_C.indexOf(Character.toUpperCase(caracter));

                // Obtener el caracter correspondiente en el alfabeto C
                char caracterDescifrado = ALPHABET_M.charAt(posicion);

                // Mantener la misma mayúscula o minúscula del caracter original
                if (Character.isLowerCase(caracter)) {
                    caracterDescifrado = Character.toLowerCase(caracterDescifrado);
                }

                mensajeDescifrado.append(caracterDescifrado);
            } else {
                // Si no es una letra, simplemente añadir al resultado sin descifrar
                mensajeDescifrado.append(caracter);
            }
        }

        return mensajeDescifrado.toString();
    }

}

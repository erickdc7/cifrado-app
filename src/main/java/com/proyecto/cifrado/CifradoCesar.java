package com.proyecto.cifrado;

public class CifradoCesar {

    public static String cifrar(String mensaje, int clave) {
        StringBuilder mensajeCifrado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);

            if (Character.isLetter(caracter)) {
                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
                mensajeCifrado.append((char) ((caracter - base + clave) % 26 + base));
            } else {
                mensajeCifrado.append(caracter);
            }
        }

        return mensajeCifrado.toString();
    }

    public static String descifrar(String mensajeCifrado, int clave) {
        return cifrar(mensajeCifrado, -clave);
    }
}

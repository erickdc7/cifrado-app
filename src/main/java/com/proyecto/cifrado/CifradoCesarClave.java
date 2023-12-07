package com.proyecto.cifrado;

public class CifradoCesarClave {

    private static final String ALFABETO = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

    public static String cifrar(String mensaje, int clave) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);

            if (Character.isLetter(caracter)) {
                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                int indice = (ALFABETO.indexOf(caracter) + clave) % ALFABETO.length();
                resultado.append(Character.isLowerCase(caracter) ? Character.toLowerCase(ALFABETO.charAt(indice)) : ALFABETO.charAt(indice));
            } else {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }

    // Método para descifrar un mensaje cifrado con el cifrado César con clave
    public static String descifrar(String clave, int posicionInicial) {
        StringBuilder resultado = new StringBuilder();
        String alfabetoCifrado = generarAlfabetoCifrado(clave);

        for (int i = 0; i < clave.length(); i++) {
            char caracter = clave.charAt(i);
            if (Character.isLetter(caracter)) {
                char nuevoCaracter = descifrarCaracter(caracter, alfabetoCifrado, posicionInicial);
                resultado.append(nuevoCaracter);
            } else {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }

    // Método para generar el alfabeto cifrado a partir de la clave
    private static String generarAlfabetoCifrado(String clave) {
        StringBuilder alfabetoCifrado = new StringBuilder(clave.replaceAll("\\s", "").toUpperCase());

        for (char letra : ALFABETO.toCharArray()) {
            if (alfabetoCifrado.indexOf(String.valueOf(letra)) == -1) {
                alfabetoCifrado.append(letra);
            }
        }

        return alfabetoCifrado.toString();
    }

    // Método para cifrar un único carácter
    private static char cifrarCaracter(char caracter, String alfabetoCifrado, int posicionInicial) {
        int indice = ALFABETO.indexOf(Character.toUpperCase(caracter));
        return Character.isUpperCase(caracter) ? alfabetoCifrado.charAt(indice) : Character.toLowerCase(alfabetoCifrado.charAt(indice));
    }

    // Método para descifrar un único carácter
    private static char descifrarCaracter(char caracter, String alfabetoCifrado, int posicionInicial) {
        int indice = alfabetoCifrado.indexOf(Character.toUpperCase(caracter));
        return Character.isUpperCase(caracter) ? ALFABETO.charAt(indice) : Character.toLowerCase(ALFABETO.charAt(indice));
    }

}

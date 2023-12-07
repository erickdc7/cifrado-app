package com.proyecto.cifrado;

public class CifradoVernam {

    private static final String[] BINARIO_LETRAS = {
        "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
        "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
    };

    public static String cifrar(String mensaje, String clave) {
        StringBuilder mensajeCifrado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);

            if (Character.isLetter(caracter)) {
                int indice = Character.toUpperCase(caracter) - 'A';
                mensajeCifrado.append(realizarXOR(BINARIO_LETRAS[indice], clave));
            } else {
                mensajeCifrado.append(caracter);
            }
        }

        return mensajeCifrado.toString();
    }

    public static String descifrar(String mensajeCifrado, String clave) {
        return cifrar(mensajeCifrado, clave);
    }

    private static String realizarXOR(String a, String b) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            resultado.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }
        return resultado.toString();
    }

}

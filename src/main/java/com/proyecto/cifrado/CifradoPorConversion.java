package com.proyecto.cifrado;

public class CifradoPorConversion {

    private static final char[] base64Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    public static String cifrar(String texto) {
        byte[] bytes = texto.getBytes();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < bytes.length; i += 3) {
            int grupo = (bytes[i] & 0xFF) << 16;
            if (i + 1 < bytes.length) {
                grupo |= (bytes[i + 1] & 0xFF) << 8;
            }
            if (i + 2 < bytes.length) {
                grupo |= bytes[i + 2] & 0xFF;
            }

            result.append(base64Chars[(grupo >> 18) & 0x3F]);
            result.append(base64Chars[(grupo >> 12) & 0x3F]);
            result.append(i + 1 < bytes.length ? base64Chars[(grupo >> 6) & 0x3F] : '=');
            result.append(i + 2 < bytes.length ? base64Chars[grupo & 0x3F] : '=');
        }

        return result.toString();
    }

    public static String descifrar(String textoCifrado) {
        byte[] bytes = new byte[textoCifrado.length()];
        for (int i = 0; i < textoCifrado.length(); i++) {
            char c = textoCifrado.charAt(i);
            for (int j = 0; j < base64Chars.length; j++) {
                if (c == base64Chars[j]) {
                    bytes[i] = (byte) j;
                    break;
                }
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < bytes.length; i += 4) {
            int grupo = (bytes[i] & 0x3F) << 18 | (bytes[i + 1] & 0x3F) << 12 | (bytes[i + 2] & 0x3F) << 6 | bytes[i + 3] & 0x3F;

            result.append((char) ((grupo >> 16) & 0xFF));
            if (bytes[i + 2] != 64) {
                result.append((char) ((grupo >> 8) & 0xFF));
            }
            if (bytes[i + 3] != 64) {
                result.append((char) (grupo & 0xFF));
            }
        }

        return result.toString();
    }

}

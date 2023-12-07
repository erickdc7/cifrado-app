package com.proyecto.cifrado;

public class CifradoXor {

    public static String cifrar(String texto, String key) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char messageChar = texto.charAt(i);
            char keyChar = key.charAt(i % key.length());

            char encryptedChar = (char) (messageChar ^ keyChar);

            encryptedText.append(String.format("%5s", Integer.toBinaryString(encryptedChar - 'A')).replace(' ', '0'));
        }

        return encryptedText.toString();
    }

    public static String descifrar(String texto, String key) {
        StringBuilder decryptedMessage = new StringBuilder();

        for (int i = 0; i < texto.length(); i += 5) {
            String binarySubstring = texto.substring(i, i + 5);

            int encryptedChar = Integer.parseInt(binarySubstring, 2);

            char keyChar = key.charAt((i / 5) % key.length());

            char decryptedChar = (char) ((encryptedChar + 'A') ^ keyChar);

            decryptedMessage.append(decryptedChar);
        }

        return decryptedMessage.toString();
    }

}

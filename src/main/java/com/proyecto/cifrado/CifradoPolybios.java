package com.proyecto.cifrado;

public class CifradoPolybios {

    private static final String[][] POLYBIOS_TABLE = {
        {"A", "B", "C", "D", "E"},
        {"F", "G", "H", "I", "K"},
        {"L", "M", "N", "O", "P"},
        {"Q", "R", "S", "T", "U"},
        {"V", "W", "X", "Y", "Z"}
    };

    // Función para cifrar un mensaje utilizando el cifrado de Polybios
    public static String cifrar(String mensaje) {
        mensaje = mensaje.toUpperCase(); // Convertir a mayúsculas para manejar solo letras mayúsculas
        StringBuilder cifrado = new StringBuilder();

        for (char letra : mensaje.toCharArray()) {
            if (letra == ' ') {
                cifrado.append(' '); // Mantener los espacios sin cifrar
            } else {
                // Buscar la letra en la tabla de Polybios y obtener sus números
                for (int i = 0; i < POLYBIOS_TABLE.length; i++) {
                    for (int j = 0; j < POLYBIOS_TABLE[i].length; j++) {
                        if (POLYBIOS_TABLE[i][j].equals(String.valueOf(letra))) {
                            cifrado.append(POLYBIOS_TABLE[0][i]).append(POLYBIOS_TABLE[0][j]); // Concatenar las letras cifradas
                        }
                    }
                }
            }
        }

        return cifrado.toString();
    }

    // Función para descifrar un mensaje cifrado con Polybios
    public static String descifrar(String mensajeCifrado) {
        StringBuilder descifrado = new StringBuilder();

        for (int i = 0; i < mensajeCifrado.length(); i += 2) {
            if (mensajeCifrado.charAt(i) == ' ') {
                descifrado.append(' '); // Mantener los espacios sin descifrar
                i--; // Retroceder un índice ya que no estamos procesando un par de letras
            } else {
                // Obtener las letras del mensaje cifrado utilizando los números como índices
                char fila = mensajeCifrado.charAt(i);
                char columna = mensajeCifrado.charAt(i + 1);
                descifrado.append(POLYBIOS_TABLE[fila - 'A'][columna - 'A']);
            }
        }

        return descifrado.toString();
    }
}

package com.proyecto.cifrado;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    String textoCifrado;
    String textoDescifrado;

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textOriginal = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tipoCifrado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtDesplazamiento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textDescifrado = new javax.swing.JTextArea();
        lblClave = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        textCifrado = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Cifrado");

        textOriginal.setColumns(20);
        textOriginal.setRows(5);
        jScrollPane1.setViewportView(textOriginal);

        jButton1.setText("Cifrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo Cifrado");

        tipoCifrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "CIFRADO DE POLYBIOS", "CIFRADO DE VIGENERE", "CIFRADO DE CESAR SIMPLE", "CIFRADO DE CESAR CON CLAVE", "CIFRADO DE CESAR CON ALFABETO MIXTO", "CIFRADO POR TRASPOSICION POR GRUPOS", "CIFRADO ANAGRAMA", "CIFRADO XOR", "CIFRADO HEBREO", "CIFRADO BEAUFORT", "CIFRADO POR CONVERSION BASE", "CIFRADO DE VERNAM" }));
        tipoCifrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoCifradoActionPerformed(evt);
            }
        });

        jLabel3.setText("Desplazamiento");

        txtDesplazamiento.setText("0");
        txtDesplazamiento.setEnabled(false);

        textDescifrado.setColumns(20);
        textDescifrado.setRows(5);
        textDescifrado.setEnabled(false);
        jScrollPane2.setViewportView(textDescifrado);

        lblClave.setText("Clave");

        txtClave.setEnabled(false);

        textCifrado.setColumns(20);
        textCifrado.setRows(5);
        textCifrado.setEnabled(false);
        jScrollPane3.setViewportView(textCifrado);

        jButton2.setText("Descifrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(220, 220, 220))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDesplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblClave)
                                .addGap(18, 18, 18)
                                .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(25, 25, 25)
                                .addComponent(tipoCifrado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(tipoCifrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDesplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClave)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String texto = this.textOriginal.getText();
        String tipo = String.valueOf(this.tipoCifrado.getSelectedItem());
        String _desplazamiento = this.txtDesplazamiento.getText();
        String clave = this.txtClave.getText();
        int desplazamiento = 0;

        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el texto a cifrar");
            return;
        }

        if (tipo.equalsIgnoreCase("<Seleccione>")) {
            JOptionPane.showMessageDialog(null, "Seleccione el tipo de cifrado");
            return;
        }

        if (this.txtDesplazamiento.isEnabled() && _desplazamiento.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Faltan Datos");
            return;
        }

        if (!_desplazamiento.isEmpty()) {
            desplazamiento = Integer.parseInt(_desplazamiento);
        }

        if (desplazamiento > 26) {
            JOptionPane.showMessageDialog(null, "El desplazamiento no puede superar los 26 caracteres");
            return;
        }

        if (this.txtClave.isEnabled() && clave.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Faltan Datos");
            return;
        }

        switch (tipo) {
            case "CIFRADO DE POLYBIOS":
                this.textoCifrado = CifradoPolybios.cifrar(texto);
                break;
            case "CIFRADO DE VIGENERE":
                this.textoCifrado = CifradoVigenere.cifrar(texto, clave);
                break;
            case "CIFRADO DE CESAR SIMPLE":
                this.textoCifrado = CifradoCesar.cifrar(texto, desplazamiento);
                break;
            case "CIFRADO DE CESAR CON CLAVE":
                this.textoCifrado = CifradoCesarClave.cifrar(texto, 3);
                break;
            case "CIFRADO DE CESAR CON ALFABETO MIXTO":
                this.textoCifrado = CifradoCesarMixto.cifrar(texto);
                break;
            case "CIFRADO CON CLAVE CONTINUA":
                this.textoCifrado = CifradoClaveContinua.cifrarConClaveContinua(texto, clave);
                break;
            case "CIFRADO POR TRASPOSICION POR GRUPOS":
                int[] permutacion = clave.chars()
                        .map(Character::getNumericValue)
                        .toArray();
                this.textoCifrado = CifradoTrasposicion.cifrar(texto, permutacion);
                break;
            case "CIFRADO ANAGRAMA":
                String anagrama = CifradoAnagrama.cifrar(texto).stream()
                        .collect(Collectors.joining("\n"));
                this.textoCifrado = anagrama;
                break;
            case "CIFRADO XOR":
                this.textoCifrado = CifradoXor.cifrar(texto, "11111");
                break;
            case "CIFRADO HEBREO":
                this.textoCifrado = CifradoHebreo.cifrar(texto);
                break;
            case "CIFRADO BEAUFORT":
                this.textoCifrado = CifradoBeaufort.cifrar(texto, clave);
                break;
            case "CIFRADO POR CONVERSION BASE":
                this.textoCifrado = CifradoPorConversionBase.cifrar(texto);
                break;
            case "CIFRADO DE VERNAM":
                this.textoCifrado = CifradoVernam.cifrar(texto, clave);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No ha seleccione un cifrado correcto");
                return;
        }

        this.textCifrado.setText(this.textoCifrado);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tipoCifradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCifradoActionPerformed
        String tipo = String.valueOf(this.tipoCifrado.getSelectedItem());

        switch (tipo) {
            case "CIFRADO POR TRASPOSICION POR GRUPOS":
                this.lblClave.setText("Permutación");
                this.txtClave.setEnabled(true);
                break;
            case "CIFRADO DE CESAR SIMPLE":
                this.txtDesplazamiento.setEnabled(true);
                break;
            case "CIFRADO DE VIGENERE", "CIFRADO BEAUFORT":
                this.lblClave.setText("Clave");
                this.txtClave.setEnabled(true);
                break;
            case "CIFRADO DE VERNAM":
                this.lblClave.setText("Clave");
                this.txtClave.setEnabled(true);
                break;
        }

    }//GEN-LAST:event_tipoCifradoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String tipo = String.valueOf(this.tipoCifrado.getSelectedItem());
        String _desplazamiento = this.txtDesplazamiento.getText();
        String clave = this.txtClave.getText();
        int desplazamiento = 0;

        if (!_desplazamiento.isEmpty()) {
            desplazamiento = Integer.parseInt(_desplazamiento);
        }

        switch (tipo) {
            case "CIFRADO DE POLYBIOS":
                this.textoDescifrado = CifradoPolybios.descifrar(this.textoCifrado);
                break;
            case "CIFRADO DE VIGENERE":
                this.textoDescifrado = CifradoVigenere.descifrar(this.textoCifrado, clave);
                break;
            case "CIFRADO DE CESAR SIMPLE":
                this.textoDescifrado = CifradoCesar.descifrar(this.textoCifrado, desplazamiento);
                break;
            case "CIFRADO DE CESAR CON CLAVE":
                this.textoDescifrado = CifradoCesarClave.descifrar(this.textoCifrado, 3);
                break;
            case "CIFRADO DE CESAR CON ALFABETO MIXTO":
                this.textoDescifrado = CifradoCesarMixto.descifrar(this.textoCifrado);
                break;
            case "CIFRADO CON CLAVE CONTINUA":
                this.textoDescifrado = CifradoClaveContinua.descifrarConClaveContinua(this.textoCifrado, clave);
                break;
            case "CIFRADO POR TRASPOSICION POR GRUPOS":
                int[] permutacion = clave.chars()
                        .map(Character::getNumericValue)
                        .toArray();
                this.textoDescifrado = CifradoTrasposicion.descifrar(this.textoCifrado, permutacion);
                break;
            case "CIFRADO ANAGRAMA":
                this.textoDescifrado = this.textoCifrado;
                break;
            case "CIFRADO HEBREO":
                this.textoDescifrado = CifradoHebreo.descifrar(this.textoCifrado);
                break;
            case "CIFRADO BEAUFORT":
                this.textoDescifrado = CifradoBeaufort.descifrar(this.textoCifrado, clave);
                break;
            case "CIFRADO POR CONVERSION BASE":
                this.textoDescifrado = CifradoPorConversionBase.descifrar(this.textoCifrado);
                break;
            case "CIFRADO DE VERNAM":
                this.textoDescifrado = CifradoVernam.descifrar(this.textoCifrado, clave);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No ha seleccione un cifrado correcto");
                return;
        }

        this.textDescifrado.setText(this.textoDescifrado);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblClave;
    private javax.swing.JTextArea textCifrado;
    private javax.swing.JTextArea textDescifrado;
    private javax.swing.JTextArea textOriginal;
    private javax.swing.JComboBox<String> tipoCifrado;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDesplazamiento;
    // End of variables declaration//GEN-END:variables
}

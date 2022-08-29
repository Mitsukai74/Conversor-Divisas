
package Vistas;

import src.Distancias;


public class VistaDistancias extends javax.swing.JFrame {
    Distancias nuevaDistancias = new Distancias();
    double distancia;
    public VistaDistancias() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelunidades = new javax.swing.JLabel();
        jTextFieldUnidades = new javax.swing.JTextField();
        jLabelTitulo2 = new javax.swing.JLabel();
        jComboBoxUnidades = new javax.swing.JComboBox<>();
        jLabelResultado = new javax.swing.JLabel();
        jButtonConvertir = new javax.swing.JButton();
        jButtonseguir = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Conversor de distancias");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 230, 30));

        jLabelunidades.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelunidades.setText("Digite la cantidad a convertir");
        getContentPane().add(jLabelunidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jTextFieldUnidades.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextFieldUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 110, 40));

        jLabelTitulo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTitulo2.setText("Escoja la unidad ");
        getContentPane().add(jLabelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jComboBoxUnidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De centímetros a metros", "De milímetros a metros", "De micras a metros", "De metros a decámetros", "De metros a hectómetros", "De metros a kilómetros", "De metros a UA", "De metros a Ly" }));
        getContentPane().add(jComboBoxUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 200, 40));

        jLabel1.setOpaque(true);
        jLabelResultado.setBackground(new java.awt.Color(255, 255, 102));
        jLabelResultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jLabelResultado.setOpaque(true);
        getContentPane().add(jLabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, 40));

        jButtonConvertir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonConvertir.setText("Convertir");
        jButtonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 120, 40));

        jButtonseguir.setText("Calcular otra medida");
        jButtonseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonseguirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonseguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 130, 40));

        jButtonVolver.setBackground(new java.awt.Color(102, 255, 255));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/distancia.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertirActionPerformed
       String captura = jComboBoxUnidades.getSelectedItem().toString();
       distancia = Double.parseDouble(jTextFieldUnidades.getText());
        //enviando valor a la clase divisas
        nuevaDistancias.setDistanciaInicial(distancia);
       
        if(captura == "De centímetros a metros"){
            nuevaDistancias.setFactor(0.01);
            jLabelResultado.setText(String.valueOf(nuevaDistancias.calcularDistancia(distancia, nuevaDistancias.getFactor()))+" metros");
        }else if(captura == "De milímetros a metros"){
            nuevaDistancias.setFactor(0.001);
            jLabelResultado.setText(String.valueOf(nuevaDistancias.calcularDistancia(distancia, nuevaDistancias.getFactor()))+" metros");
        }else if(captura == "De micras a metros"){
            nuevaDistancias.setFactor(0.0001);
            jLabelResultado.setText(String.valueOf(nuevaDistancias.calcularDistancia(distancia, nuevaDistancias.getFactor()))+" metros");
        }
        else if(captura == "De metros a decámetros"){
            nuevaDistancias.setFactor(0.01);
            jLabelResultado.setText(String.valueOf(nuevaDistancias.calcularDistancia(distancia, nuevaDistancias.getFactor()))+" decámetros");
        }else if(captura == "De metros a hectómetros"){
            nuevaDistancias.setFactor(0.001);
            jLabelResultado.setText(String.valueOf(nuevaDistancias.calcularDistancia(distancia, nuevaDistancias.getFactor()))+" hectómetros");
        }else if(captura == "De metros a kilómetros"){
            nuevaDistancias.setFactor(0.0001);
            jLabelResultado.setText(String.valueOf(nuevaDistancias.calcularDistancia(distancia, nuevaDistancias.getFactor()))+" kilómetros");
        }else if(captura == "De metros a UA"){
            nuevaDistancias.setFactor(0.00000001495);
            jLabelResultado.setText(String.valueOf(nuevaDistancias.calcularDistancia(distancia, nuevaDistancias.getFactor()))+" U.anstrónomica");
        }else if(captura == "De metros a Ly"){
            nuevaDistancias.setFactor(0.000000000000946);
            jLabelResultado.setText(String.valueOf(nuevaDistancias.calcularDistancia(distancia, nuevaDistancias.getFactor()))+" años luz");
        }
    }//GEN-LAST:event_jButtonConvertirActionPerformed

    private void jButtonseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonseguirActionPerformed
        jTextFieldUnidades.setText("");
        jLabelResultado.setText("");
    }//GEN-LAST:event_jButtonseguirActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Entrada principal = new Entrada();        
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDistancias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JButton jButtonseguir;
    private javax.swing.JComboBox<String> jComboBoxUnidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelunidades;
    private javax.swing.JTextField jTextFieldUnidades;
    // End of variables declaration//GEN-END:variables
}

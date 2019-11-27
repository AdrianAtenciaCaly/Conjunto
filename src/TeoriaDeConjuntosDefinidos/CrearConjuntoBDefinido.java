/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaDeConjuntosDefinidos;

import TeoriaDeConjuntos.*;
import clases.AgregarConjuntoB;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static TeoriaDeConjuntos.CrearConjuntoA.modelList;

/**
 *
 * @author Adrian AC
 */
public class CrearConjuntoBDefinido extends javax.swing.JFrame {

    public static DefaultListModel modelList;
    static String DescripcionB;

    public CrearConjuntoBDefinido() {
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        modelList = new DefaultListModel();
        listaConjuntoB.setModel(modelList);
        listaConjuntoB.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaConjuntoB = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        descripcionConjuntoB = new javax.swing.JMenuItem();
        definir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        modificarConjuntoB = new javax.swing.JMenuItem();
        eliminarMiembroConjuntoB = new javax.swing.JMenuItem();
        listarConjuntoB = new javax.swing.JMenuItem();
        tamañoConjunto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAtras = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelTable.setBackground(new java.awt.Color(255, 255, 255));

        listaConjuntoB.setBorder(javax.swing.BorderFactory.createTitledBorder("Elementos del conjunto B"));
        listaConjuntoB.setToolTipText("Lista del conjunto B");
        listaConjuntoB.setEnabled(false);
        jScrollPane1.setViewportView(listaConjuntoB);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jMenu1.setText("Opciones ");

        descripcionConjuntoB.setText("Crear una descripción del conjunto");
        descripcionConjuntoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionConjuntoBActionPerformed(evt);
            }
        });
        jMenu1.add(descripcionConjuntoB);

        definir.setText("Definir conjunto automaticamente");

        jMenuItem1.setText("Generar un Conjunto de Múltiplos en un rango definido");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        definir.add(jMenuItem1);

        jMenuItem2.setText("Generar un Conjunto de Divisores en un rango definido ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        definir.add(jMenuItem2);

        jMenuItem3.setText("Generar un Conjunto de números primos en un rango definido ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        definir.add(jMenuItem3);

        jMenuItem5.setText("Generar un conjunto de valores de una ecuación lineal en un rango definido ");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        definir.add(jMenuItem5);

        jMenuItem4.setText("Generar un conjunto de valores de una ecuación de segundo grado en un rango definido ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        definir.add(jMenuItem4);

        jMenu1.add(definir);

        modificarConjuntoB.setText("Modificar un miembro existente ");
        modificarConjuntoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarConjuntoBActionPerformed(evt);
            }
        });
        jMenu1.add(modificarConjuntoB);

        eliminarMiembroConjuntoB.setText("Eliminar miembro existente");
        eliminarMiembroConjuntoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMiembroConjuntoBActionPerformed(evt);
            }
        });
        jMenu1.add(eliminarMiembroConjuntoB);

        listarConjuntoB.setText("Consultar el listado de miembros del conjunto ");
        listarConjuntoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarConjuntoBActionPerformed(evt);
            }
        });
        jMenu1.add(listarConjuntoB);

        tamañoConjunto.setText("Ver el tamaño de un conjunto ");
        tamañoConjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoConjuntoActionPerformed(evt);
            }
        });
        jMenu1.add(tamañoConjunto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        menuAtras.setText("Atras");
        menuAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAtrasActionPerformed(evt);
            }
        });
        jMenu2.add(menuAtras);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarConjuntoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarConjuntoBActionPerformed
        listaConjuntoB.setVisible(true);
        CrearConjutoBDefinido.Modificar();
    }//GEN-LAST:event_modificarConjuntoBActionPerformed

    private void eliminarMiembroConjuntoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMiembroConjuntoBActionPerformed
        CrearConjutoBDefinido.Eliminar();
    }//GEN-LAST:event_eliminarMiembroConjuntoBActionPerformed

    private void listarConjuntoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarConjuntoBActionPerformed
        listaConjuntoB.setVisible(true);
        CrearConjutoBDefinido.Mostrar();
    }//GEN-LAST:event_listarConjuntoBActionPerformed

    private void menuAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtrasActionPerformed
        dispose();
    }//GEN-LAST:event_menuAtrasActionPerformed

    private void descripcionConjuntoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionConjuntoBActionPerformed
        DescripcionB = JOptionPane.showInputDialog("Descripcion del conjunto B");
    }//GEN-LAST:event_descripcionConjuntoBActionPerformed

    private void tamañoConjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoConjuntoActionPerformed
        CrearConjutoBDefinido.contB();
    }//GEN-LAST:event_tamañoConjuntoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Rango a generar"));
        CrearConjutoBDefinido.Divisor(numero);
        definir.enable(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Rango a generar"));
        CrearConjutoBDefinido.Multiplo(numero);
        definir.enable(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Rango a generar"));
        CrearConjutoBDefinido.Primo(numero);
        definir.enable(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Rango a generar"));
        CrearConjutoBDefinido.Ecuacion2doGrado(numero);
        definir.enable(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Rango a generar desde 0 hasta "));
        CrearConjutoBDefinido.EcuacionLineal(numero);
        definir.enable(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CrearConjuntoBDefinido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearConjuntoBDefinido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearConjuntoBDefinido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearConjuntoBDefinido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearConjuntoBDefinido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu definir;
    private javax.swing.JMenuItem descripcionConjuntoB;
    private javax.swing.JMenuItem eliminarMiembroConjuntoB;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaConjuntoB;
    private javax.swing.JMenuItem listarConjuntoB;
    private javax.swing.JMenuItem menuAtras;
    private javax.swing.JMenuItem modificarConjuntoB;
    private javax.swing.JPanel panelTable;
    private javax.swing.JMenuItem tamañoConjunto;
    // End of variables declaration//GEN-END:variables
}

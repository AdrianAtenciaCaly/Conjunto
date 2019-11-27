/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaDeConjuntos;

import clases.AgregarConjuntoA;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Adrian AC
 */
public class CrearConjuntoA extends javax.swing.JFrame {

    public static DefaultListModel modelList;
     static String DescripcionA;

    public CrearConjuntoA() {
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        modelList = new DefaultListModel();
        listaConjuntoA.setModel(modelList);
        listaConjuntoA.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaConjuntoA = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        descripcionConjuntoA = new javax.swing.JMenuItem();
        aggMiembroConjutoA = new javax.swing.JMenuItem();
        modificarConjuntoA = new javax.swing.JMenuItem();
        eliminarMiembroConjuntoA = new javax.swing.JMenuItem();
        listarConjuntoB = new javax.swing.JMenuItem();
        tamañoConjunto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAtras = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelTable.setBackground(new java.awt.Color(255, 255, 255));
        panelTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        listaConjuntoA.setBorder(javax.swing.BorderFactory.createTitledBorder("Elementos del conjunto A"));
        listaConjuntoA.setToolTipText("Lista del conjunto A");
        listaConjuntoA.setEnabled(false);
        jScrollPane1.setViewportView(listaConjuntoA);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("Opciones ");

        descripcionConjuntoA.setText("Crear una descripción del conjunto");
        descripcionConjuntoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionConjuntoAActionPerformed(evt);
            }
        });
        jMenu1.add(descripcionConjuntoA);

        aggMiembroConjutoA.setText("Agregar un miembro al conjunto ");
        aggMiembroConjutoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggMiembroConjutoAActionPerformed(evt);
            }
        });
        jMenu1.add(aggMiembroConjutoA);

        modificarConjuntoA.setText("Modificar un miembro existente ");
        modificarConjuntoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarConjuntoAActionPerformed(evt);
            }
        });
        jMenu1.add(modificarConjuntoA);

        eliminarMiembroConjuntoA.setText("Eliminar miembro existente");
        eliminarMiembroConjuntoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMiembroConjuntoAActionPerformed(evt);
            }
        });
        jMenu1.add(eliminarMiembroConjuntoA);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggMiembroConjutoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggMiembroConjutoAActionPerformed
        AgregarConjuntoA.AgregarConjuntoA();
    }//GEN-LAST:event_aggMiembroConjutoAActionPerformed

    private void listarConjuntoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarConjuntoBActionPerformed
        listaConjuntoA.setVisible(true);
        AgregarConjuntoA.Mostrar();
      
    }//GEN-LAST:event_listarConjuntoBActionPerformed

    private void modificarConjuntoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarConjuntoAActionPerformed
        listaConjuntoA.setVisible(true);
        AgregarConjuntoA.Modificar();
    }//GEN-LAST:event_modificarConjuntoAActionPerformed

    private void eliminarMiembroConjuntoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMiembroConjuntoAActionPerformed
        AgregarConjuntoA.Eliminar();
    }//GEN-LAST:event_eliminarMiembroConjuntoAActionPerformed

    private void menuAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtrasActionPerformed
   dispose();
    }//GEN-LAST:event_menuAtrasActionPerformed

    private void descripcionConjuntoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionConjuntoAActionPerformed
     DescripcionA= JOptionPane.showInputDialog("Descripcion del conjunto A");
    }//GEN-LAST:event_descripcionConjuntoAActionPerformed

    private void tamañoConjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoConjuntoActionPerformed
     AgregarConjuntoA.contA();
    }//GEN-LAST:event_tamañoConjuntoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearConjuntoA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aggMiembroConjutoA;
    private javax.swing.JMenuItem descripcionConjuntoA;
    private javax.swing.JMenuItem eliminarMiembroConjuntoA;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaConjuntoA;
    private javax.swing.JMenuItem listarConjuntoB;
    private javax.swing.JMenuItem menuAtras;
    private javax.swing.JMenuItem modificarConjuntoA;
    private javax.swing.JPanel panelTable;
    private javax.swing.JMenuItem tamañoConjunto;
    // End of variables declaration//GEN-END:variables
}

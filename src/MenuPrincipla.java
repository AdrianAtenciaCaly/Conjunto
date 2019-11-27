/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import TeoriaDeConjuntos.AplicarTeoríacreandoConjuntos;
import TeoriaDeConjuntosDefinidos.AplicarTeoríaConjuntosDefinidos;
import static java.time.Clock.system;

/**
 *
 * @author Adrian AC
 */
public class MenuPrincipla extends javax.swing.JFrame {

    /**
     * Creates new form AplicarLaTeoríaConConjuntos
     */
    public MenuPrincipla() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        opc1 = new javax.swing.JButton();
        opc2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicar La Teoría Ccreando Conjuntos");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opc1.setBackground(new java.awt.Color(255, 0, 0));
        opc1.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        opc1.setForeground(new java.awt.Color(255, 255, 255));
        opc1.setText("creando conjuntos");
        opc1.setToolTipText("Aplicar la teoría creando conjuntos");
        opc1.setBorder(null);
        opc1.setBorderPainted(false);
        opc1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });
        jPanel1.add(opc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 270, 40));

        opc2.setBackground(new java.awt.Color(255, 0, 0));
        opc2.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        opc2.setForeground(new java.awt.Color(255, 255, 255));
        opc2.setText("Conjuntos Definidos");
        opc2.setToolTipText("Aplicar la teoría creando conjuntos Definidos");
        opc2.setBorder(null);
        opc2.setBorderPainted(false);
        opc2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });
        jPanel1.add(opc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, 290, 40));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Century", 3, 25)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.setToolTipText("Salir");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDefaultCapable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Conjuntos(11.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, -1, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
         AplicarTeoríaConjuntosDefinidos jFrame = new AplicarTeoríaConjuntosDefinidos();
        jFrame.setVisible(true);
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        AplicarTeoríacreandoConjuntos jFrame = new AplicarTeoríacreandoConjuntos();
        jFrame.setVisible(true);
    }//GEN-LAST:event_opc1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton opc1;
    private javax.swing.JButton opc2;
    // End of variables declaration//GEN-END:variables
}

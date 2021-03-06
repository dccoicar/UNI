/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.view;

import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import uni.sistemas.controller.ComprobanteController;
import uni.sistemas.entity.Item;
import uni.sistemas.service.Comprobante;

/**
 *
 * @author Alumno
 */
public class ComprobanteView extends javax.swing.JFrame {

    /**
     * Creates new form ComprobanteView
     */
    public ComprobanteView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        rbnBoleta = new javax.swing.JRadioButton();
        rbnFactura = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComprobante = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Importe");

        buttonGroup1.add(rbnBoleta);
        rbnBoleta.setText("Boleta");
        rbnBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnBoletaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnFactura);
        rbnFactura.setText("Factura");
        rbnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnFacturaActionPerformed(evt);
            }
        });

        tblComprobante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CONCEPTO", "IMPORTE"
            }
        ));
        jScrollPane1.setViewportView(tblComprobante);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbnBoleta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbnFactura))
                            .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnBoleta)
                    .addComponent(rbnFactura))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnBoletaActionPerformed
        procesar(1);
    }//GEN-LAST:event_rbnBoletaActionPerformed

    private void rbnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnFacturaActionPerformed
        procesar(2);
    }//GEN-LAST:event_rbnFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(ComprobanteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprobanteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprobanteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprobanteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprobanteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbnBoleta;
    private javax.swing.JRadioButton rbnFactura;
    private javax.swing.JTable tblComprobante;
    private javax.swing.JTextField txtImporte;
    // End of variables declaration//GEN-END:variables
    //instanciar variable de la clase Comprobante
    ComprobanteController obj = new ComprobanteController();

    private void procesar(int op) {
        Comprobante com = obj.getDocumento(op);
        verDocumento(com);
    }

    private void verDocumento(Comprobante com) {
        //formato de notacion comercial
        DecimalFormat formato=new DecimalFormat("#,##0.00");
        //variable de tipo tabla
        DefaultTableModel tabla = (DefaultTableModel) tblComprobante.getModel();
        tabla.setRowCount(0);
        for (Item x : com.Documento(Double.parseDouble(txtImporte.getText()))) {
            Object[] fila = {x.getConcepto(), formato.format(x.getImporte())};
            tabla.addRow(fila);
        }

    }
}

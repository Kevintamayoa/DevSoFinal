/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devso2;

import Classes.Save;

/**
 *
 * @author xchel
 */
public class JDialogOpcionesReportes extends javax.swing.JDialog {

    /**
     * Creates new form JDialogOpcionesReportes
     */
    public JDialogOpcionesReportes() {
        initComponents();
        switch(Save.reporte){
            case 1:
                rdDetallado.setVisible(false);
                rdGeneral.setVisible(false);
                rdInversionistas.setVisible(false);
                rdPrestamistas.setVisible(false);
                rdCreditoBancario.setVisible(false);
                break;
            case 2:
                rdDetallado.setVisible(false);
                rdGeneral.setVisible(false);
                rdInversionistas.setVisible(false);
                rdPrestamistas.setVisible(false);
                rdCreditoBancario.setVisible(false);
                break;
            case 3:
                rdDetallado.setVisible(false);
                rdGeneral.setVisible(false);
                rdInversionistas.setVisible(false);
                rdPrestamistas.setVisible(false);
                rdCreditoBancario.setVisible(false);
                break;
            case 4:
                rdDetallado.setVisible(false);
                rdGeneral.setVisible(false);
                rdInversionistas.setVisible(false);
                rdPrestamistas.setVisible(false);
                rdCreditoBancario.setVisible(false);
                break;
            case 5:
                rdDetallado.setVisible(false);
                rdGeneral.setVisible(false);
                rdInversionistas.setVisible(false);
                rdPrestamistas.setVisible(false);
                rdCreditoBancario.setVisible(false);
                break;
            case 6:
                rdDetallado.setVisible(false);
                rdGeneral.setVisible(false);
                rdInversionistas.setVisible(false);
                rdPrestamistas.setVisible(false);
                rdCreditoBancario.setVisible(false);
                break;
            case 7:
                rdDetallado.setVisible(true);
                rdGeneral.setVisible(true);
                rdInversionistas.setVisible(false);
                rdPrestamistas.setVisible(false);
                rdCreditoBancario.setVisible(false);
                break;
            case 8:
                rdDetallado.setVisible(false);
                rdGeneral.setVisible(false);
                rdInversionistas.setVisible(false);
                rdPrestamistas.setVisible(false);
                rdCreditoBancario.setVisible(false);
                break;
            case 9:
                rdDetallado.setVisible(false);
                rdGeneral.setVisible(false);
                rdInversionistas.setVisible(true);
                rdPrestamistas.setVisible(true);
                rdCreditoBancario.setVisible(true);
                break;
            case 10:
                rdDetallado.setVisible(false);
                rdGeneral.setVisible(false);
                rdInversionistas.setVisible(true);
                rdPrestamistas.setVisible(true);
                rdCreditoBancario.setVisible(true);
                break;
            case 11:
                rdDetallado.setVisible(false);
                rdGeneral.setVisible(false);
               rdInversionistas.setVisible(true);
                rdPrestamistas.setVisible(true);
                rdCreditoBancario.setVisible(true);
                break;
            case 12:
                rdDetallado.setVisible(false);
                rdGeneral.setVisible(false);
                rdInversionistas.setVisible(true);
                rdPrestamistas.setVisible(true);
                rdCreditoBancario.setVisible(true);
                break;
            default:
                break;      
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdGroup1 = new javax.swing.ButtonGroup();
        rdGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTituloTipoReporte = new javax.swing.JLabel();
        btnExcel = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        rdDetallado = new javax.swing.JRadioButton();
        rdGeneral = new javax.swing.JRadioButton();
        rdInversionistas = new javax.swing.JRadioButton();
        rdPrestamistas = new javax.swing.JRadioButton();
        rdCreditoBancario = new javax.swing.JRadioButton();
        rdMensual = new javax.swing.JRadioButton();
        rdSemestral = new javax.swing.JRadioButton();
        rdAnual = new javax.swing.JRadioButton();
        rdIntervalo = new javax.swing.JRadioButton();
        dtInicio = new com.toedter.calendar.JDateChooser();
        dtFin = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(47, 51, 66));

        lblTituloTipoReporte.setBackground(new java.awt.Color(187, 187, 187));
        lblTituloTipoReporte.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        lblTituloTipoReporte.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloTipoReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloTipoReporte.setText("Reporte de...");

        btnExcel.setBackground(new java.awt.Color(123, 163, 183));
        btnExcel.setText("EXCEL");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        btnPDF.setBackground(new java.awt.Color(123, 163, 183));
        btnPDF.setText("PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        rdDetallado.setBackground(new java.awt.Color(47, 51, 66));
        rdGroup1.add(rdDetallado);
        rdDetallado.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        rdDetallado.setForeground(new java.awt.Color(255, 255, 255));
        rdDetallado.setText("Detallado");

        rdGeneral.setBackground(new java.awt.Color(47, 51, 66));
        rdGroup1.add(rdGeneral);
        rdGeneral.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        rdGeneral.setForeground(new java.awt.Color(255, 255, 255));
        rdGeneral.setText("General");

        rdInversionistas.setBackground(new java.awt.Color(47, 51, 66));
        rdGroup1.add(rdInversionistas);
        rdInversionistas.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        rdInversionistas.setForeground(new java.awt.Color(255, 255, 255));
        rdInversionistas.setText("Inversionistas");

        rdPrestamistas.setBackground(new java.awt.Color(47, 51, 66));
        rdGroup1.add(rdPrestamistas);
        rdPrestamistas.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        rdPrestamistas.setForeground(new java.awt.Color(255, 255, 255));
        rdPrestamistas.setText("Prestamistas");

        rdCreditoBancario.setBackground(new java.awt.Color(47, 51, 66));
        rdGroup1.add(rdCreditoBancario);
        rdCreditoBancario.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        rdCreditoBancario.setForeground(new java.awt.Color(255, 255, 255));
        rdCreditoBancario.setText("Crédito bancario");

        rdMensual.setBackground(new java.awt.Color(47, 51, 66));
        rdGroup2.add(rdMensual);
        rdMensual.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        rdMensual.setForeground(new java.awt.Color(255, 255, 255));
        rdMensual.setText("Mensual");
        rdMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMensualActionPerformed(evt);
            }
        });

        rdSemestral.setBackground(new java.awt.Color(47, 51, 66));
        rdGroup2.add(rdSemestral);
        rdSemestral.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        rdSemestral.setForeground(new java.awt.Color(255, 255, 255));
        rdSemestral.setText("Semestral");
        rdSemestral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSemestralActionPerformed(evt);
            }
        });

        rdAnual.setBackground(new java.awt.Color(47, 51, 66));
        rdGroup2.add(rdAnual);
        rdAnual.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        rdAnual.setForeground(new java.awt.Color(255, 255, 255));
        rdAnual.setText("Anual");
        rdAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdAnualActionPerformed(evt);
            }
        });

        rdIntervalo.setBackground(new java.awt.Color(47, 51, 66));
        rdGroup2.add(rdIntervalo);
        rdIntervalo.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        rdIntervalo.setForeground(new java.awt.Color(255, 255, 255));
        rdIntervalo.setText("Intervalo");
        rdIntervalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdIntervaloActionPerformed(evt);
            }
        });

        dtInicio.setBackground(new java.awt.Color(69, 73, 74));
        dtInicio.setEnabled(false);
        dtInicio.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N

        dtFin.setBackground(new java.awt.Color(69, 73, 74));
        dtFin.setEnabled(false);
        dtFin.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(187, 187, 187));
        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio");

        jLabel2.setBackground(new java.awt.Color(187, 187, 187));
        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloTipoReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdDetallado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdCreditoBancario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdPrestamistas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdInversionistas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdSemestral, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dtFin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloTipoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdDetallado)
                        .addGap(5, 5, 5)
                        .addComponent(rdGeneral)
                        .addGap(5, 5, 5)
                        .addComponent(rdInversionistas)
                        .addGap(5, 5, 5)
                        .addComponent(rdPrestamistas)
                        .addGap(5, 5, 5)
                        .addComponent(rdCreditoBancario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdMensual)
                        .addGap(5, 5, 5)
                        .addComponent(rdSemestral)
                        .addGap(5, 5, 5)
                        .addComponent(rdAnual)
                        .addGap(5, 5, 5)
                        .addComponent(rdIntervalo)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(dtFin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        rdDetallado.getAccessibleContext().setAccessibleName("180");
        rdGeneral.getAccessibleContext().setAccessibleName("180");
        rdInversionistas.getAccessibleContext().setAccessibleName("180");
        rdPrestamistas.getAccessibleContext().setAccessibleName("180");
        rdCreditoBancario.getAccessibleContext().setAccessibleName("180");
        rdMensual.getAccessibleContext().setAccessibleName("180");
        rdSemestral.getAccessibleContext().setAccessibleName("180");
        rdAnual.getAccessibleContext().setAccessibleName("180");
        rdIntervalo.getAccessibleContext().setAccessibleName("180");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcelActionPerformed

    private void rdIntervaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdIntervaloActionPerformed
        // TODO add your handling code here:
        if(rdIntervalo.isSelected()){
            dtInicio.setEnabled(true);
            dtFin.setEnabled(true);
        }else{
            dtInicio.setEnabled(false);
            dtFin.setEnabled(false);
        }
    }//GEN-LAST:event_rdIntervaloActionPerformed

    private void rdMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMensualActionPerformed
        // TODO add your handling code here:
        dtInicio.setEnabled(false);
        dtFin.setEnabled(false);
    }//GEN-LAST:event_rdMensualActionPerformed

    private void rdSemestralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSemestralActionPerformed
        // TODO add your handling code here:
        dtInicio.setEnabled(false);
        dtFin.setEnabled(false);
    }//GEN-LAST:event_rdSemestralActionPerformed

    private void rdAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdAnualActionPerformed
        // TODO add your handling code here:
        dtInicio.setEnabled(false);
        dtFin.setEnabled(false);
    }//GEN-LAST:event_rdAnualActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogOpcionesReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogOpcionesReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogOpcionesReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogOpcionesReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDialogOpcionesReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnPDF;
    private com.toedter.calendar.JDateChooser dtFin;
    private com.toedter.calendar.JDateChooser dtInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTituloTipoReporte;
    private javax.swing.JRadioButton rdAnual;
    private javax.swing.JRadioButton rdCreditoBancario;
    private javax.swing.JRadioButton rdDetallado;
    private javax.swing.JRadioButton rdGeneral;
    private javax.swing.ButtonGroup rdGroup1;
    private javax.swing.ButtonGroup rdGroup2;
    private javax.swing.JRadioButton rdIntervalo;
    private javax.swing.JRadioButton rdInversionistas;
    private javax.swing.JRadioButton rdMensual;
    private javax.swing.JRadioButton rdPrestamistas;
    private javax.swing.JRadioButton rdSemestral;
    // End of variables declaration//GEN-END:variables
}

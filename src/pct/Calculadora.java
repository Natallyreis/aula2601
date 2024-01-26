/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import javax.swing.JOptionPane;

/**
 *
 * @author DEV_2ano_2024
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        bgpOpcoes = new javax.swing.ButtonGroup();
        pnlCalculadora = new javax.swing.JPanel();
        lblNum1 = new javax.swing.JLabel();
        lblNum2 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        pntOpcoes = new javax.swing.JPanel();
        rbtSub = new javax.swing.JRadioButton();
        rbtSoma = new javax.swing.JRadioButton();
        rbtMult = new javax.swing.JRadioButton();
        rbtDivisao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        lblNum1.setText("Num1:");

        lblNum2.setText("Num2:");

        txtNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum2ActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblResultado.setForeground(java.awt.Color.red);
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("Resultado");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCalculadoraLayout = new javax.swing.GroupLayout(pnlCalculadora);
        pnlCalculadora.setLayout(pnlCalculadoraLayout);
        pnlCalculadoraLayout.setHorizontalGroup(
            pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCalculadoraLayout.createSequentialGroup()
                        .addGroup(pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNum2)
                            .addComponent(lblNum1))
                        .addGap(60, 60, 60)
                        .addGroup(pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNum2)
                            .addComponent(txtNum1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCalculadoraLayout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(btnLimpar))
                    .addGroup(pnlCalculadoraLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnlCalculadoraLayout.setVerticalGroup(
            pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum1)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum2)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(lblResultado)
                .addGap(78, 78, 78)
                .addGroup(pnlCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnLimpar))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pntOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));

        bgpOpcoes.add(rbtSub);
        rbtSub.setText("Sub");
        rbtSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSubActionPerformed(evt);
            }
        });

        bgpOpcoes.add(rbtSoma);
        rbtSoma.setSelected(true);
        rbtSoma.setText("Soma");
        rbtSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSomaActionPerformed(evt);
            }
        });

        bgpOpcoes.add(rbtMult);
        rbtMult.setText("Mult");

        bgpOpcoes.add(rbtDivisao);
        rbtDivisao.setText("Divisão");

        javax.swing.GroupLayout pntOpcoesLayout = new javax.swing.GroupLayout(pntOpcoes);
        pntOpcoes.setLayout(pntOpcoesLayout);
        pntOpcoesLayout.setHorizontalGroup(
            pntOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pntOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pntOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtSoma)
                    .addComponent(rbtSub)
                    .addComponent(rbtMult)
                    .addComponent(rbtDivisao))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        pntOpcoesLayout.setVerticalGroup(
            pntOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pntOpcoesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rbtSoma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtSub)
                .addGap(80, 80, 80)
                .addComponent(rbtMult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtDivisao)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(pntOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(pnlCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pntOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtNum1.setText(null);
        txtNum2.setText(null);
        lblResultado.setText(null);
        txtNum1.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum2ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        //Declaração de Variáveis
        int n1, n2, total;
        //Entradas
        try{
            n1 = Integer.parseInt(txtNum1.getText());
            n2 = Integer.parseInt(txtNum2.getText());
            
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro" + e.getMessage(), "Atenção", JOptionPane.ERROR_MESSAGE);
                
            }
        n1 = Integer.parseInt(txtNum1.getText());
        n2 = Integer.parseInt(txtNum2.getText());
        if(rbtSoma.isSelected()){
        //Processamento
        total = n1 + n2;
        } else if(rbtSub.isSelected()){
            total = n1 - n2;
        } else if(rbtMult.isSelected()) {
            total = n1 * n2;
        }else {
            total = n1 / n2;
        }
        //Saída
        lblResultado.setText(String.valueOf(total));
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rbtSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtSomaActionPerformed

    private void rbtSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtSubActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgpOpcoes;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JPanel pnlCalculadora;
    private javax.swing.JPanel pntOpcoes;
    private javax.swing.JRadioButton rbtDivisao;
    private javax.swing.JRadioButton rbtMult;
    private javax.swing.JRadioButton rbtSoma;
    private javax.swing.JRadioButton rbtSub;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    // End of variables declaration//GEN-END:variables
}

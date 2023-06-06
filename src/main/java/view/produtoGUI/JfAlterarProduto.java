/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.produtoGUI;

import control.ControleFuncionario;
import javax.swing.JOptionPane;
import model.Produto;
import view.JfControleProduto;

/**
 *
 * @author Lenovo
 */
public class JfAlterarProduto extends javax.swing.JFrame {

    /**
     * Creates new form JfAlterarProduto
     */
    public JfAlterarProduto() {
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

        jLabel1 = new javax.swing.JLabel();
        JbRetornar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JtfIdProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JtfNomeProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JtfTipoProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JtfPrecoProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JtfQtdEstoqueProduto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JtfDataFabricProduto = new javax.swing.JTextField();
        JbAlterarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Alterar Produto");

        JbRetornar.setForeground(new java.awt.Color(255, 0, 0));
        JbRetornar.setText("Retornar");
        JbRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbRetornarActionPerformed(evt);
            }
        });

        jLabel2.setText("Identificador");

        jLabel3.setText("Nome");

        JtfNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfNomeProdutoActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo");

        jLabel5.setText("Preco (xxxx.xx)");

        jLabel6.setText("Qtd Estoque");

        jLabel7.setText("Data Fabricação");

        JtfDataFabricProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfDataFabricProdutoActionPerformed(evt);
            }
        });

        JbAlterarProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbAlterarProduto.setText("Alterar");
        JbAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAlterarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JbRetornar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbAlterarProduto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(JtfPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JtfQtdEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(JtfDataFabricProduto)))
                        .addComponent(JtfIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JtfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JtfTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbRetornar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtfIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtfTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JtfQtdEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JtfPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(JtfDataFabricProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbAlterarProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtfNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfNomeProdutoActionPerformed

    private void JtfDataFabricProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfDataFabricProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfDataFabricProdutoActionPerformed

    private void JbAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAlterarProdutoActionPerformed
        String idProdutoString = JtfIdProduto.getText();
        String qtdProdutoString = JtfQtdEstoqueProduto.getText();
        String precoString = JtfPrecoProduto.getText();
        String nome = JtfNomeProduto.getText();
        String tipo = JtfTipoProduto.getText();
        String dataFabricacao = JtfDataFabricProduto.getText();
        Produto manProduto = null;    
        ControleFuncionario manFuncionario = null;
        
        boolean camposPreenchidos = !(idProdutoString.isEmpty() || qtdProdutoString.isEmpty() || precoString.isEmpty() || nome.isEmpty() || tipo.isEmpty() || dataFabricacao.isEmpty());
        if (camposPreenchidos) {
            int idProduto = Integer.parseInt(idProdutoString);
            int qtdEstoque = Integer.parseInt(qtdProdutoString);
            float preco = Float.parseFloat(precoString);
            manProduto = new Produto(idProduto, nome, tipo, preco, qtdEstoque, dataFabricacao);
            
            manFuncionario = new ControleFuncionario();
            if(manFuncionario.getProdutoById(idProduto) != null){
                manFuncionario.updateProduto(manProduto); 
            }else{
                JOptionPane.showMessageDialog(null, "Identificador não encontrado, verifique os dados e tente novamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para Atualizar.");
        }
    }//GEN-LAST:event_JbAlterarProdutoActionPerformed

    private void JbRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbRetornarActionPerformed
        JfControleProduto JfControleProduto = new JfControleProduto();
        JfControleProduto.setVisible(true);
        dispose();
    }//GEN-LAST:event_JbRetornarActionPerformed

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
            java.util.logging.Logger.getLogger(JfAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfAlterarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbAlterarProduto;
    private javax.swing.JButton JbRetornar;
    private javax.swing.JTextField JtfDataFabricProduto;
    private javax.swing.JTextField JtfIdProduto;
    private javax.swing.JTextField JtfNomeProduto;
    private javax.swing.JTextField JtfPrecoProduto;
    private javax.swing.JTextField JtfQtdEstoqueProduto;
    private javax.swing.JTextField JtfTipoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

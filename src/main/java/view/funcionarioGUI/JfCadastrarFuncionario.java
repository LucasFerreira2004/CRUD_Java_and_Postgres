/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.funcionarioGUI;

import control.ControleFuncionario;
import control.ControleGerente;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Gerente;
import model.Produto;
import view.JfControleFuncionario;
import view.JfControleProduto;
import view.JfPainelSelecaoControles;

/**
 *
 * @author Lenovo
 */
public class JfCadastrarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form JfCadastrarProdutos
     */
    public JfCadastrarFuncionario() {
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
        jLabel2 = new javax.swing.JLabel();
        JtfMatriculaFuncionario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JtfNomeFuncionario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfEnderecoFuncionario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JtfTelefoneFuncionario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JtfSalarioFuncionario = new javax.swing.JTextField();
        JbCadastrarFunionario = new javax.swing.JButton();
        JbRetornar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        JpfSenhaFuncionario = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Funcionario");

        jLabel2.setText("Matrícula");

        JtfMatriculaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfMatriculaFuncionarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jLabel4.setText("Endereço (Cidade/Estado):");

        jLabel5.setText("Telefone:");

        jLabel6.setText("Salario(xxxx.xx):");

        JbCadastrarFunionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JbCadastrarFunionario.setText("Cadastrar");
        JbCadastrarFunionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCadastrarFunionarioActionPerformed(evt);
            }
        });

        JbRetornar.setForeground(new java.awt.Color(255, 0, 0));
        JbRetornar.setText("Retornar");
        JbRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbRetornarActionPerformed(evt);
            }
        });

        jLabel8.setText("Senha:");

        JpfSenhaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JpfSenhaFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JbRetornar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(JtfMatriculaFuncionario)
                            .addComponent(JtfNomeFuncionario)
                            .addComponent(jtfEnderecoFuncionario)
                            .addComponent(JtfTelefoneFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(JtfSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbCadastrarFunionario)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(JpfSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JbRetornar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtfMatriculaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtfNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpfSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtfTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtfSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JbCadastrarFunionario)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void JbCadastrarFunionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCadastrarFunionarioActionPerformed
        String matriculaFuncionarioString = JtfMatriculaFuncionario.getText();
        String salarioFuncionarioString = JtfSalarioFuncionario.getText();
        String telefoneFuncionario = JtfTelefoneFuncionario.getText();
        String nomeFuncionario = JtfNomeFuncionario.getText();
        String enderecoFuncionario = jtfEnderecoFuncionario.getText();
        String senhaFuncionario = JpfSenhaFuncionario.getText();
        ControleGerente manGerente = null;    
        Funcionario manFuncionario = null;
      
        boolean camposPreenchidos = !(matriculaFuncionarioString.isEmpty() || salarioFuncionarioString.isEmpty() || telefoneFuncionario.isEmpty() || nomeFuncionario.isEmpty() || enderecoFuncionario.isEmpty());
        if (camposPreenchidos) {
            int matriculaFuncionario = Integer.parseInt(matriculaFuncionarioString);
            Float salarioFuncionario = Float.parseFloat(salarioFuncionarioString);
            
            manFuncionario = new Funcionario(matriculaFuncionario, nomeFuncionario, enderecoFuncionario,telefoneFuncionario, salarioFuncionario, senhaFuncionario);
           
            manGerente = new ControleGerente();
            manGerente.addFuncionario(manFuncionario);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para cadastrar");
        }
    }//GEN-LAST:event_JbCadastrarFunionarioActionPerformed

    private void JbRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbRetornarActionPerformed
        JfControleFuncionario jfControleFuncionario = new JfControleFuncionario();
        jfControleFuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_JbRetornarActionPerformed

    private void JtfMatriculaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfMatriculaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfMatriculaFuncionarioActionPerformed

    private void JpfSenhaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JpfSenhaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JpfSenhaFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(JfCadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfCadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfCadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfCadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfCadastrarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbCadastrarFunionario;
    private javax.swing.JButton JbRetornar;
    private javax.swing.JPasswordField JpfSenhaFuncionario;
    private javax.swing.JTextField JtfMatriculaFuncionario;
    private javax.swing.JTextField JtfNomeFuncionario;
    private javax.swing.JTextField JtfSalarioFuncionario;
    private javax.swing.JTextField JtfTelefoneFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jtfEnderecoFuncionario;
    // End of variables declaration//GEN-END:variables
}

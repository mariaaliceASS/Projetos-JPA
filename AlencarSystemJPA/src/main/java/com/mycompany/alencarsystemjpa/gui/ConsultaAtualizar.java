/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.alencarsystemjpa.gui;


import com.mycompany.alencarsystemjpa.model.Consulta;
import com.mycompany.alencarsystemjpa.model.ConsultaJPA;
import javax.swing.JOptionPane;

public class ConsultaAtualizar extends javax.swing.JFrame {

    Consulta c = new Consulta();
    
    public ConsultaLista cLista;
    
    public ConsultaAtualizar(int id, ConsultaLista tela) {
        initComponents();
        
        c = ConsultaJPA.obter(id);
        
        CampoNome.setText(c.getNome());
        CampoCPF.setText(c.getCpf());
        CampoTelefone.setText(c.getNumeroTelefone());
        CampoEndereco.setText(c.getEndereco());
        CampoData.setText(c.converterParaFormatoJava(c.getDataConsulta()));
        CampoHorario.setText(c.getHoraConsulta());
        CampoProcedimento.setSelectedItem(c.getTipoProcedimento());
        
        this.cLista = tela;

    }

    private ConsultaAtualizar() {

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoPagamento = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        CampoTelefone = new javax.swing.JTextField();
        BotaoCadastrar = new javax.swing.JButton();
        CampoEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CampoData = new javax.swing.JTextField();
        CampoHorario = new javax.swing.JTextField();
        CampoProcedimento = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        PagamentoP = new javax.swing.JRadioButton();
        CampoCPF = new javax.swing.JTextField();
        PagamentoQ = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoCadastrar.setText("ATUALIZAR");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Data da consulta (dd/mm/aaaa)");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Horário da consulta(hh:mm)");

        CampoProcedimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um procedimento:", "Limpeza de Pele", "Design de Sobrancelhas", "Brown Lamination", "Aplicação de Henna", "Micropigmentação", "Extensão de Cílios", "Peeling de Diamante", " " }));
        CampoProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoProcedimentoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Procedimento a ser realizado:");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setText("Status do Pagamento:");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("EDITANDO CONSULTA");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Edite aqui os detalhes da consulta");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Nome do Cliente");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("CPF ");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Número de Telefone:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Endereço:");

        BotaoPagamento.add(PagamentoP);
        PagamentoP.setText("Pendente");

        BotaoPagamento.add(PagamentoQ);
        PagamentoQ.setText("Quitado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(CampoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(CampoCPF)
                            .addComponent(CampoTelefone)
                            .addComponent(CampoEndereco))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(CampoData)
                            .addComponent(CampoHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PagamentoP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PagamentoQ))
                            .addComponent(CampoProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PagamentoP)
                    .addComponent(PagamentoQ))
                .addGap(69, 69, 69)
                .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed

        c.setNome(CampoNome.getText());
        c.setCpf(CampoCPF.getText());
        c.setNumeroTelefone(CampoTelefone.getText());
        c.setEndereco(CampoEndereco.getText());
        c.setDataConsulta(Consulta.converterParaFormatoBanco(CampoData.getText()));
        c.setHoraConsulta(CampoHorario.getText());
                
        if (PagamentoQ.isSelected()) {
            c.setPagamento(true);
        } else if (PagamentoP.isSelected()) {
            c.setPagamento(false);
        } else {
            c.setPagamento(false);
        }

        if(CampoProcedimento.getSelectedItem().toString().equalsIgnoreCase("Selecione uma opção:")) {
            c.setTipoProcedimento("");
        }else {
            c.setTipoProcedimento(CampoProcedimento.getSelectedItem().toString());
        }

         ConsultaJPA.atualizar(c);
         JOptionPane.showMessageDialog(null, "Consulta atualizada com sucesso!"); //Mensagem de sucesso no cadastro
         dispose();

    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void CampoProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoProcedimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoProcedimentoActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaAtualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaAtualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.ButtonGroup BotaoPagamento;
    private javax.swing.JTextField CampoCPF;
    private javax.swing.JTextField CampoData;
    private javax.swing.JTextField CampoEndereco;
    private javax.swing.JTextField CampoHorario;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JComboBox<String> CampoProcedimento;
    private javax.swing.JTextField CampoTelefone;
    private javax.swing.JRadioButton PagamentoP;
    private javax.swing.JRadioButton PagamentoQ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.alencarsystemjpa.gui;

import com.mycompany.alencarsystemjpa.model.Consulta;
import com.mycompany.alencarsystemjpa.model.ConsultaJPA;
import com.mycompany.alencarsystemjpa.model.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maria Alice
 */
public class ConsultaLista extends javax.swing.JFrame {

    /**
     * Construtor padrão da classe.
     */
    public ConsultaLista() {

    }
    /**
     * Construtor que recebe um usuário como parâmetro.
     *
     * @param u O usuário logado.
     */
    public ConsultaLista(Usuario u) {
        initComponents();
        //DEFININDO PERMISSÕES PARA OS USUÁRIOS DO SISTEMA
        if (u.getNivel().equalsIgnoreCase("Administrador")) {
            BotaoCadastrar.setEnabled(true);
            BotaoExcluir.setEnabled(true);
            BotaoEditar.setEnabled(true);
            //PERMITINDO AO ADM EXCLUIR E CADASTRAR
        } else {
            BotaoExcluir.setVisible(false);
            //PERMITINDO AO OPERADOR O CADASTRO E A LISTAGEM DOS PODCASTS
        } 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TabelaScroll = new javax.swing.JScrollPane();
        TabelaConsulta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoPesquisar = new javax.swing.JTextField();
        BotaoBuscar = new javax.swing.JButton();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoEditar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("LISTA DE CONSULTAS");

        DefaultTableModel tabela = montarTabela(null);
        TabelaConsulta.setModel(tabela);
        TabelaConsulta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TabelaConsultaPropertyChange(evt);
            }
        });
        TabelaScroll.setViewportView(TabelaConsulta);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Consulte, cadastre, edite e exclua consultas aqui!");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Pesquise Consultas por CPF:");

        BotaoBuscar.setText("Buscar");
        BotaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarActionPerformed(evt);
            }
        });

        BotaoCadastrar.setText("Cadastrar Consulta");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        BotaoEditar.setText("Editar Consulta");
        BotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarActionPerformed(evt);
            }
        });

        BotaoExcluir.setText("Excluir Consulta");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(BotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabelaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoPesquisar)))
                        .addGap(18, 18, 18)
                        .addComponent(BotaoBuscar)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(CampoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TabelaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        ConsultaCadastro cc = new ConsultaCadastro();
        cc.setVisible(true);
        
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarActionPerformed
       TabelaConsulta.setModel(montarTabela(CampoPesquisar.getText()));
       TabelaScroll.setViewportView(TabelaConsulta);
    }//GEN-LAST:event_BotaoBuscarActionPerformed

    public void refresh() {
        //Criação do método para fazer o refresh na tabela
        TabelaConsulta.setModel(montarTabela(null));//seleciona o montar tablea
        TabelaScroll.setViewportView(TabelaConsulta);//renova a tabela
    }
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        // Monta a tabela com os dados atualizados (passando null para listar todos os podcasts)
        DefaultTableModel tabela = montarTabela(null);
        // Define o modelo da tabela atualizado
        TabelaConsulta.setModel(tabela);
        // Define a visualização da tabela atualizada no painel de rolagem
        TabelaScroll.setViewportView(TabelaConsulta);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void TabelaConsultaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TabelaConsultaPropertyChange
       // Adiciona um ouvinte ao modelo da tabela para detectar mudanças
        TabelaConsulta.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                // Verifica se o evento é uma atualização na tabela
                if (e.getType() == TableModelEvent.UPDATE) {
                    // Obtém a linha e coluna da célula alterada
                    int row = e.getFirstRow();
                    int column = e.getColumn();
                    EditavelTableModel model = (EditavelTableModel) e.getSource();

                    // Obtém os valores atualizados da célula
                    String idString = (String) model.getValueAt(row, 0);
                    int id = Integer.parseInt(idString);
                    String nome = (String) model.getValueAt(row, 1);
                    String cpf = (String) model.getValueAt(row, 2);
                    String numeroTelefone = (String) model.getValueAt(row, 3);
                    String endereco = (String) model.getValueAt(row, 4);
                    String dataConsulta = (String) model.getValueAt(row, 5);
                    String horaConsulta = (String) model.getValueAt(row, 6);
                    String tipoProcedimento = (String) model.getValueAt(row, 8);
                    boolean pago = false;
                    
                    if("Quitado".equalsIgnoreCase((String) model.getValueAt(row, 7))) {
                        pago = true; 
                    } else if ("Pendente".equalsIgnoreCase((String) model.getValueAt(row, 7))) {
                        pago = false;
                    }
                    // Cria um novo objeto Podcast com os valores atualizados
                    Consulta c = new Consulta( id, nome, cpf, numeroTelefone, endereco, dataConsulta,  horaConsulta, pago, tipoProcedimento);

                }
            }
        });
    }//GEN-LAST:event_TabelaConsultaPropertyChange

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        ConsultaJPA.excluir(Integer.parseInt(getId()));
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");

        refresh();
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed
        int linhaSelecionada = Integer.parseInt(getId());
        ConsultaAtualizar tlAtualizar = new ConsultaAtualizar(linhaSelecionada, this);
        tlAtualizar.setVisible(true);
    }//GEN-LAST:event_BotaoEditarActionPerformed

    private String getId() {
        // Obtém a posição da linha selecionada na tabela
        int posicao = TabelaConsulta.getSelectedRow(); // Selecionando linha e posição
        // Verifica se uma linha foi selecionada
        if (posicao == -1) { // Validando posição
            // Se nenhuma linha foi selecionada, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Selecione um item da tabela.");
        }
        // Retorna o ID do podcast selecionado (valor na posição 0 da linha selecionada)
        return (String) TabelaConsulta.getValueAt(posicao, 0); // Retornado valor que está na posição escolhida
    }

    /**
     * Cria uma tabela com os dados dos podcasts.
     *
     * @param PesquisarCampo O campo de pesquisa para filtrar os podcasts (pode
     * ser null para listar todos os podcasts).
     * @return O modelo da tabela com os dados dos podcasts.
     */
    private EditavelTableModel montarTabela(String CampoPesquisar) {
        // Definição das colunas da tabela
        String[] colunas = {"ID", "Nome", "CPF", "N° De Telefone", "Endereço", "Data", "Horário", "Procedimento", "Pagamento"};

        // Criação do modelo da tabela
        EditavelTableModel tabela = new EditavelTableModel(); // Seleção da tabela
        tabela.setColumnIdentifiers(colunas); // Set das colunas da tabela

        // Lista de podcasts a serem exibidos na tabela
        List<Consulta> lista;
        // Verifica se há um campo de pesquisa fornecido
        if (CampoPesquisar == null) {
            // Se não houver campo de pesquisa, lista todos os podcasts
            lista = ConsultaJPA.listar();
        } else {
            // Se houver um campo de pesquisa, busca os podcasts correspondentes
            lista = ConsultaJPA.buscar(CampoPesquisar);
        }

        // Preenche a tabela com os dados dos podcasts
        for (int i = 0; i < lista.size(); i++) {
            Consulta c = lista.get(i);
            String pago = "";
            
            if (c.isPagamento()) {
                pago = "Quitado";
            } else {
                pago = "Pendente";
            }

            // Cria uma linha com os dados do podcast
            String[] linha = {
                Integer.toString(c.getId()),
                c.getNome(),
                c.getCpf(),
                c.getNumeroTelefone(),
                c.getEndereco(),
                Consulta.converterParaFormatoJava(c.getDataConsulta()),
                c.getHoraConsulta(),
                c.getTipoProcedimento(),
                pago                
            };
            // Adiciona a linha à tabela
            tabela.addRow(linha);
        }

        // Retorna o modelo da tabela preenchido com os dados dos podcasts
        return tabela;
    }

    
    
    
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
            java.util.logging.Logger.getLogger(ConsultaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBuscar;
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JTextField CampoPesquisar;
    private javax.swing.JTable TabelaConsulta;
    private javax.swing.JScrollPane TabelaScroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

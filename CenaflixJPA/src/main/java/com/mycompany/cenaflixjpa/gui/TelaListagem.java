package com.mycompany.cenaflixjpa.gui;

import com.mycompany.cenaflixjpa.model.Podcast;
import com.mycompany.cenaflixjpa.model.PodcastJPA;
import com.mycompany.cenaflixjpa.model.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 * Esta classe representa a interface gráfica de listagem de podcasts.
 */
public class TelaListagem extends javax.swing.JFrame {

    /**
     * Construtor padrão da classe.
     */
    public TelaListagem() {

    }

    /**
     * Construtor que recebe um usuário como parâmetro.
     *
     * @param u O usuário logado.
     */
    public TelaListagem(Usuario u) {
        initComponents();
        //DEFININDO PERMISSÕES PARA OS USUÁRIOS DO SISTEMA
        if (u.getNivel().equalsIgnoreCase("Administrador")) {
            BotaoCadastrar.setEnabled(true);
            BotaoExcluir.setEnabled(true);
            //PERMITINDO AO ADM EXCLUIR E CADASTRAR
        } else if (u.getNivel().equalsIgnoreCase("Operador")) {
            BotaoExcluir.setVisible(false);
            //PERMITINDO AO OPERADOR O CADASTRO E A LISTAGEM DOS PODCASTS
        } else {
            BotaoCadastrar.setVisible(false);
            BotaoExcluir.setVisible(false);
            //PERMITINDO AO USUÁRIO COMUM SOMENTE A VISÃO E PROCURA DA LISTA
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelListagem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TabelaScroll = new javax.swing.JScrollPane();
        TabelaPodcast = new javax.swing.JTable();
        BotaoCadastrar = new javax.swing.JButton();
        PesquisarCampo = new javax.swing.JTextField();
        BotaoExcluir = new javax.swing.JButton();
        BotaoBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        PanelListagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PanelListagemFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("CENAFLIX");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Pesquisar Podcast por Produto:");

        DefaultTableModel tabela = montarTabela(null);
        TabelaPodcast.setModel(tabela);
        TabelaPodcast.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TabelaPodcastFocusGained(evt);
            }
        });
        TabelaPodcast.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TabelaPodcastPropertyChange(evt);
            }
        });
        TabelaScroll.setViewportView(TabelaPodcast);

        BotaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoCadastrar.setText("CADASTRAR");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        PesquisarCampo.setToolTipText("Pesquise o produtor que deseja encontrar");

        BotaoExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoExcluir.setForeground(new java.awt.Color(255, 51, 51));
        BotaoExcluir.setText("EXCLUIR");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        BotaoBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotaoBuscar.setText("Buscar");
        BotaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelListagemLayout = new javax.swing.GroupLayout(PanelListagem);
        PanelListagem.setLayout(PanelListagemLayout);
        PanelListagemLayout.setHorizontalGroup(
            PanelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListagemLayout.createSequentialGroup()
                .addGroup(PanelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelListagemLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1))
                    .addGroup(PanelListagemLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(PanelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelListagemLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PesquisarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoBuscar))
                            .addComponent(TabelaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelListagemLayout.createSequentialGroup()
                                .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PanelListagemLayout.setVerticalGroup(
            PanelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListagemLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(PanelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(PesquisarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TabelaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        PesquisarCampo.getAccessibleContext().setAccessibleName("Campo de pesquisa podcast");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        // Ação realizada ao clicar no botão "CADASTRAR"

        TelaCadastro tlCadastro = new TelaCadastro();
        tlCadastro.setVisible(true);

    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarActionPerformed
        // Ação realizada ao clicar no botão "BUSCAR"

        TabelaPodcast.setModel(montarTabela(PesquisarCampo.getText()));
        TabelaScroll.setViewportView(TabelaPodcast);
    }//GEN-LAST:event_BotaoBuscarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        // Ação realizada ao clicar no botão "EXCLUIR"
        PodcastJPA.excluir(Integer.parseInt(getId()));
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");

        refresh();
    }//GEN-LAST:event_BotaoExcluirActionPerformed
    public void refresh() {
        //Criação do método para fazer o refresh na tabela
        TabelaPodcast.setModel(montarTabela(null));//seleciona o montar tablea
        TabelaScroll.setViewportView(TabelaPodcast);//renova a tabela
    }
    private void TabelaPodcastPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TabelaPodcastPropertyChange
        // Adiciona um ouvinte ao modelo da tabela para detectar mudanças
        TabelaPodcast.getModel().addTableModelListener(new TableModelListener() {
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
                    String produtor = (String) model.getValueAt(row, 1);
                    String nomeEpisodio = (String) model.getValueAt(row, 2);
                    String numeroEpisodioSt = (String) model.getValueAt(row, 3);
                    int numeroEpisodio = Integer.parseInt(numeroEpisodioSt);
                    String duracao = (String) model.getValueAt(row, 4);
                    String urlRepositorio = (String) model.getValueAt(row, 5);

                    // Cria um novo objeto Podcast com os valores atualizados
                    Podcast p = new Podcast(id, produtor, nomeEpisodio, numeroEpisodio, duracao, urlRepositorio);

                }
            }
        });
    }//GEN-LAST:event_TabelaPodcastPropertyChange

    private void TabelaPodcastFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TabelaPodcastFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaPodcastFocusGained

    private void PanelListagemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PanelListagemFocusGained

    }//GEN-LAST:event_PanelListagemFocusGained
    /**
     * Este método é chamado quando a janela ganha foco. Atualiza a tabela de
     * podcast ao ganhar foco na janela.
     *
     * @param evt O evento de ganho de foco da janela.
     */
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        // Monta a tabela com os dados atualizados (passando null para listar todos os podcasts)
        DefaultTableModel tabela = montarTabela(null);
        // Define o modelo da tabela atualizado
        TabelaPodcast.setModel(tabela);
        // Define a visualização da tabela atualizada no painel de rolagem
        TabelaScroll.setViewportView(TabelaPodcast);

    }//GEN-LAST:event_formWindowGainedFocus
    /**
     * Obtém o ID do podcast selecionado na tabela.
     *
     * @return O ID do podcast selecionado.
     */
    private String getId() {
        // Obtém a posição da linha selecionada na tabela
        int posicao = TabelaPodcast.getSelectedRow(); // Selecionando linha e posição
        // Verifica se uma linha foi selecionada
        if (posicao == -1) { // Validando posição
            // Se nenhuma linha foi selecionada, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Selecione um item da tabela.");
        }
        // Retorna o ID do podcast selecionado (valor na posição 0 da linha selecionada)
        return (String) TabelaPodcast.getValueAt(posicao, 0); // Retornado valor que está na posição escolhida
    }

    /**
     * Cria uma tabela com os dados dos podcasts.
     *
     * @param PesquisarCampo O campo de pesquisa para filtrar os podcasts (pode
     * ser null para listar todos os podcasts).
     * @return O modelo da tabela com os dados dos podcasts.
     */
    private EditavelTableModel montarTabela(String PesquisarCampo) {
        // Definição das colunas da tabela
        String[] colunas = {"ID", "Produtor", "Nome do Podcast", "N° do Episódio", "Duração", "URL"};

        // Criação do modelo da tabela
        EditavelTableModel tabela = new EditavelTableModel(); // Seleção da tabela
        tabela.setColumnIdentifiers(colunas); // Set das colunas da tabela

        // Lista de podcasts a serem exibidos na tabela
        List<Podcast> lista;
        // Verifica se há um campo de pesquisa fornecido
        if (PesquisarCampo == null) {
            // Se não houver campo de pesquisa, lista todos os podcasts
            lista = PodcastJPA.listar();
        } else {
            // Se houver um campo de pesquisa, busca os podcasts correspondentes
            lista = PodcastJPA.buscar(PesquisarCampo);
        }

        // Preenche a tabela com os dados dos podcasts
        for (int i = 0; i < lista.size(); i++) {
            Podcast p = lista.get(i);

            // Cria uma linha com os dados do podcast
            String[] linha = {
                Integer.toString(p.getId()),
                p.getProdutor(),
                p.getNomeEpisodio(),
                Integer.toString(p.getNumeroEpisodio()),
                p.getDuracao(),
                p.getUrlRepositorio()
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
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBuscar;
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JPanel PanelListagem;
    private javax.swing.JTextField PesquisarCampo;
    private javax.swing.JTable TabelaPodcast;
    private javax.swing.JScrollPane TabelaScroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

package com.mycompany.cenaflixjpa.gui;

import javax.swing.table.DefaultTableModel;

public class EditavelTableModel extends DefaultTableModel {
//Abstract classe para a criação da tabela e permissão de edição nela
    @Override
    public boolean isCellEditable(int row, int column) {
        //Vai permitir a edição de todas as células da tabela
        return true;
    }
}

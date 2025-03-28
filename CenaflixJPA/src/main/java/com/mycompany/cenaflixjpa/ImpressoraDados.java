
package com.mycompany.cenaflixjpa;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class ImpressoraDados {
    //IMPRESSORA DE DADOS
    public static void imprimir(String arquivo) {
        //Criação de objeto desktop
        Desktop desktop = Desktop.getDesktop();
        //TRY e CATCH para criação de arquivo e impressão de dados
        try {
            File arquivoAImprimir = new File(arquivo);
            desktop.print(arquivoAImprimir);
        } catch (IOException ex) {
            //Detectar erro caso aja alguma exceção
            ex.printStackTrace();
        }

    }
    
}

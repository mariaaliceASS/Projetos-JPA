
package com.mycompany.alencarsystemjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name = "consulta")
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome; // O nome cliente
    private String cpf; // O cpf do cliente
    private String numeroTelefone; // numero de telefone
    private String endereco; // endereco
    private String dataConsulta; // data consulta
    private String horaConsulta;
    private boolean pagamento;
    private String tipoProcedimento;

    public Consulta() {
    }

    
    public Consulta(int id, String nome, String cpf, String numeroTelefone, String endereco, String dataConsulta, String horaConsulta, boolean pagamento, String tipoProcedimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.numeroTelefone = numeroTelefone;
        this.endereco = endereco;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.pagamento = pagamento;
        this.tipoProcedimento = tipoProcedimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

    
    public String getTipoProcedimento() {
        return tipoProcedimento;
    }

    public void setTipoProcedimento(String tipoProcedimento) {
        this.tipoProcedimento = tipoProcedimento;
    }
    
    //Exemplo 01-01-2024 para 2024-01-01
    public static String converterParaFormatoBanco(String dataAntiga) {
        String dataFormatoBanco;
        String[] partesData = dataAntiga.split("/");
        dataFormatoBanco = partesData[2] + "-" + partesData[1] + "-" + partesData[0];
        return dataFormatoBanco;
    }
    // Exemplo: 2023-10-22 para 22/10/2023 
    public static String converterParaFormatoJava(String dataAntiga) {
        String[] partesData = dataAntiga.split("-");
        String dataFormatoJava = partesData[2] + "/" + partesData[1] + "/" + partesData[0];
        return dataFormatoJava;
    }
}
 
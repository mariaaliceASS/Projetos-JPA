/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alencarsystemjpa.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Maria Alice
 */
public class ConsultaJPA {
    
    /**
     * Método para cadastrar os dados de um podcast.
     *
     * @param c O objeto Podcast a ser cadastrado.
     */
    public static void cadastrar(Consulta c) {
        // Estabelece conexão com o banco de dados
        EntityManager manager = alencarSystemJPAUtil.conectar();
        try {
            // Inicia uma transação
            manager.getTransaction().begin();
            // Persiste o objeto Podcast no banco de dados
            manager.persist(c);
            // Confirma a transação
            manager.getTransaction().commit();
        } catch (Exception e) {
            // Em caso de erro, realiza o rollback da transação
            manager.getTransaction().rollback();
        } finally {
            // Fecha a conexão com o banco de dados
            alencarSystemJPAUtil.desconectar();
        }
    }
    
    public static List<Consulta> buscar(String filtro) {
        List<Consulta> lista = new ArrayList<Consulta>();

        // Estabelece conexão com o banco de dados
        EntityManager manager = alencarSystemJPAUtil.conectar();
        try {
            // Cria uma query para buscar podcasts
            Query busca = manager.createQuery("SELECT c FROM consulta c WHERE (:cpf is null OR c.cpf LIKE :cpf)");
            // Define o parâmetro da query com base no filtro
            busca.setParameter("cpf", filtro.isEmpty() ? null : "%" + filtro + "%");
            // Executa a query e obtém os resultados
            lista = busca.getResultList();
        } catch (Exception e) {
            // Em caso de erro, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar os dados");
            System.out.println(e);
        } finally {
            // Fecha a conexão com o banco de dados
            alencarSystemJPAUtil.desconectar();
        }
        return lista;
    }
    
    public static List<Consulta> listar() {
        List<Consulta> lista = new ArrayList<Consulta>();

        // Estabelece conexão com o banco de dados
        EntityManager manager = alencarSystemJPAUtil.conectar();
        try {
            // Cria uma query para listar todos os podcasts
            Query listar = manager.createQuery("SELECT c FROM consulta c");
            // Executa a query e obtém os resultados
            lista = listar.getResultList();
        } catch (Exception e) {
            // Em caso de erro, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao listar os dados");
            System.out.println(e);
        }
        return lista;
    }

    public static void excluir(int id) {
        // Estabelece conexão com o banco de dados
        EntityManager manager = alencarSystemJPAUtil.conectar();
        try {
            // Inicia uma transação
            manager.getTransaction().begin();
            // Busca o podcast com base no ID
            Consulta c = manager.find(Consulta.class, id);
            // Verifica se o podcast foi encontrado e o remove do banco de dados
            if (c != null) {
                manager.remove(c);
            }
            // Confirma a transação
            manager.getTransaction().commit();
        } catch (Exception e) {
            // Em caso de erro, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir os dados!");
            System.out.println(e);
        } finally {
            // Fecha a conexão com o banco de dados
            alencarSystemJPAUtil.desconectar();
        }
    }
    
    public static Consulta obter(int id){
      EntityManager manager = alencarSystemJPAUtil.conectar();
      try{
          return manager.find(Consulta.class, id);
      }finally{
          alencarSystemJPAUtil.desconectar();
      }
    }
    
    public static void atualizar(Consulta c) {
        EntityManager manager = alencarSystemJPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.merge(c);
            manager.getTransaction().commit();    
            
        }catch(Exception e) {
            manager.getTransaction().rollback();
            throw e;
        }
        finally {
            alencarSystemJPAUtil.desconectar();
        }
    }
    
}

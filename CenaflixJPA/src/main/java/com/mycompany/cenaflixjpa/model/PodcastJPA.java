package com.mycompany.cenaflixjpa.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PodcastJPA {

    /**
     * Método para cadastrar os dados de um podcast.
     *
     * @param p O objeto Podcast a ser cadastrado.
     */
    public static void cadastrar(Podcast p) {
        // Estabelece conexão com o banco de dados
        EntityManager manager = PodcastJPAUtil.conectar();
        try {
            // Inicia uma transação
            manager.getTransaction().begin();
            // Persiste o objeto Podcast no banco de dados
            manager.persist(p);
            // Confirma a transação
            manager.getTransaction().commit();
        } catch (Exception e) {
            // Em caso de erro, realiza o rollback da transação
            manager.getTransaction().rollback();
        } finally {
            // Fecha a conexão com o banco de dados
            PodcastJPAUtil.desconectar();
        }
    }

    /**
     * Método para buscar podcasts com base em um filtro.
     *
     * @param filtro O filtro a ser aplicado na busca (pode ser null para listar
     * todos os podcasts).
     * @return Uma lista de podcasts que correspondem ao filtro.
     */
    public static List<Podcast> buscar(String filtro) {
        List<Podcast> lista = new ArrayList<Podcast>();

        // Estabelece conexão com o banco de dados
        EntityManager manager = PodcastJPAUtil.conectar();
        try {
            // Cria uma query para buscar podcasts
            Query busca = manager.createQuery("SELECT p FROM Podcast p WHERE (:produtor is null OR p.produtor LIKE :produtor)");
            // Define o parâmetro da query com base no filtro
            busca.setParameter("produtor", filtro.isEmpty() ? null : "%" + filtro + "%");
            // Executa a query e obtém os resultados
            lista = busca.getResultList();
        } catch (Exception e) {
            // Em caso de erro, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar os dados");
            System.out.println(e);
        } finally {
            // Fecha a conexão com o banco de dados
            PodcastJPAUtil.desconectar();
        }
        return lista;
    }

    /**
     * Método para listar todos os podcasts.
     *
     * @return Uma lista de todos os podcasts cadastrados.
     */
    public static List<Podcast> listar() {
        List<Podcast> lista = new ArrayList<Podcast>();

        // Estabelece conexão com o banco de dados
        EntityManager manager = PodcastJPAUtil.conectar();
        try {
            // Cria uma query para listar todos os podcasts
            Query listar = manager.createQuery("SELECT p FROM Podcast p");
            // Executa a query e obtém os resultados
            lista = listar.getResultList();
        } catch (Exception e) {
            // Em caso de erro, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao listar os dados");
            System.out.println(e);
        }
        return lista;
    }

    /**
     * Método para excluir um podcast do banco de dados.
     *
     * @param id O ID do podcast a ser excluído.
     */
    public static void excluir(int id) {
        // Estabelece conexão com o banco de dados
        EntityManager manager = PodcastJPAUtil.conectar();
        try {
            // Inicia uma transação
            manager.getTransaction().begin();
            // Busca o podcast com base no ID
            Podcast p = manager.find(Podcast.class, id);
            // Verifica se o podcast foi encontrado e o remove do banco de dados
            if (p != null) {
                manager.remove(p);
            }
            // Confirma a transação
            manager.getTransaction().commit();
        } catch (Exception e) {
            // Em caso de erro, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir os dados!");
            System.out.println(e);
        } finally {
            // Fecha a conexão com o banco de dados
            PodcastJPAUtil.desconectar();
        }
    }

}

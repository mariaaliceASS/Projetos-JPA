package com.mycompany.cenaflixjpa.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Classe utilitária para gerenciar a criação e fechamento de conexões JPA.
 */
public class PodcastJPAUtil {

    private static String PERSISTENCE_UNIT = "Podcast-PU";
    private static EntityManager manager;
    private static EntityManagerFactory fabricaEntidade;
    /**
     * Estabelece uma conexão com a unidade de persistência.
     *
     * @return O EntityManager associado à conexão estabelecida.
     */
    public static EntityManager conectar() {
        if (fabricaEntidade == null || !fabricaEntidade.isOpen()) {
            fabricaEntidade = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }

        if (manager == null || !manager.isOpen()) {
            manager = fabricaEntidade.createEntityManager();
        }

        return manager;
    }

    /**
     * Fecha a conexão com a unidade de persistência.
     */
    public static void desconectar() {
        if (manager.isOpen() && manager != null) {
            manager.close();
            fabricaEntidade.close();
        }
    }
}

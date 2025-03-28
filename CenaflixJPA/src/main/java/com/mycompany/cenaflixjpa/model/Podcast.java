package com.mycompany.cenaflixjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Representa um podcast.
 */
@Entity(name = "podcast")
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String produtor; // O produtor do podcast
    private String nomeEpisodio; // O nome do episódio do podcast
    private int numeroEpisodio; // O número do episódio do podcast
    private String duracao; // A duração do episódio do podcast
    private String urlRepositorio; // A URL do repositório do episódio do podcast

    /**
     * Construtor padrão.
     */
    public Podcast() {
    }

    /**
     * Construtor com parâmetros.
     *
     * @param id O ID do podcast.
     * @param produtor O produtor do podcast.
     * @param nomeEpisodio O nome do episódio do podcast.
     * @param numeroEpisodio O número do episódio do podcast.
     * @param duracao A duração do episódio do podcast.
     * @param urlRepositorio A URL do repositório do episódio do podcast.
     */
    public Podcast(int id, String produtor, String nomeEpisodio, int numeroEpisodio, String duracao, String urlRepositorio) {
        this.id = id;
        this.produtor = produtor;
        this.nomeEpisodio = nomeEpisodio;
        this.numeroEpisodio = numeroEpisodio;
        this.duracao = duracao;
        this.urlRepositorio = urlRepositorio;
    }

    // Métodos getter e setter para cada atributo (id, produtor, nomeEpisodio, numeroEpisodio, duracao, urlRepositorio) 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNomeEpisodio() {
        return nomeEpisodio;
    }

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getUrlRepositorio() {
        return urlRepositorio;
    }

    public void setUrlRepositorio(String urlRepositorio) {
        this.urlRepositorio = urlRepositorio;
    }

}

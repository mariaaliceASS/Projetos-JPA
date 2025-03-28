/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alencarsystemjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String login; // O login do usuário
    private String senha; // A senha do usuário
    private String nivel; // O nível de acesso do usuário (por exemplo, "Administrador", "Operador", etc.)

    /**
     * Obtém o ID do usuário.
     *
     * @return O ID do usuário.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do usuário.
     *
     * @param id O novo ID do usuário.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o login do usuário.
     *
     * @return O login do usuário.
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define o login do usuário.
     *
     * @param login O novo login do usuário.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Obtém a senha do usuário.
     *
     * @return A senha do usuário.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do usuário.
     *
     * @param senha A nova senha do usuário.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Obtém o nível de acesso do usuário.
     *
     * @return O nível de acesso do usuário.
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Define o nível de acesso do usuário.
     *
     * @param nivel O novo nível de acesso do usuário.
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
}

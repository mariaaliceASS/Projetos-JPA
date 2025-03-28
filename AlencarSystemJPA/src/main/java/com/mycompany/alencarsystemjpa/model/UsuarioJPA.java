/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alencarsystemjpa.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class UsuarioJPA {

    /**
     * Valida um usuário com base no nome de usuário (login) e senha fornecidos.
     *
     * @param user O objeto Usuario a ser validado.
     * @return O usuário validado se encontrado, caso contrário retorna null.
     */
    public static Usuario validarUsuario(Usuario user) {
        // Estabelece conexão com o banco de dados
        EntityManager manager = alencarSystemJPAUtil.conectar();
        try {
            // Cria uma query para buscar o usuário com base no login e senha fornecidos
            List<Usuario> usuariosEncontrados = manager
                    .createQuery("SELECT u FROM usuario u WHERE u.login = :login AND u.senha = :senha", Usuario.class)
                    .setParameter("login", user.getLogin())
                    .setParameter("senha", user.getSenha())
                    .getResultList();

            // Verifica se foram encontrados usuários correspondentes
            if (!usuariosEncontrados.isEmpty()) {
                System.out.println("Usuário encontrado!");
                // Retorna o primeiro usuário encontrado
                return usuariosEncontrados.get(0);
            } else {
                System.out.println("Nenhum usuário encontrado");
            }

        } catch (Exception e) {
            // Em caso de erro, exibe uma mensagem de erro
            System.out.println("Ocorreu um erro ao buscar o usuário");
            System.out.println(e);
        } finally {
            // Fecha a conexão com o banco de dados
            alencarSystemJPAUtil.desconectar();
        }
        // Retorna null se nenhum usuário foi encontrado
        return null;
    }
}
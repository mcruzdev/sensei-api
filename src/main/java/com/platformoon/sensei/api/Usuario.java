package com.platformoon.sensei.api;

import java.util.UUID;

public class Usuario {

    String id;
    String nome;
    String email;
    String senha;

    Usuario(String nome, String email, String senha) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}

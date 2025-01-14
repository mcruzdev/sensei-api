package com.platformoon.sensei.api.dto;

public class CriarUsuarioRequest {

    private String email;
    private String senha;
    private String nome;

    @Override
    public String toString() {
        return "email: " + email + ", senha: " + senha + ", nome: " + nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }
}

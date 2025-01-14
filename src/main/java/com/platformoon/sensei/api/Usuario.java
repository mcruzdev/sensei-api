package com.platformoon.sensei.api;

public class Usuario {

    String nome;
    String email;
    String senha;



    Usuario(String nome, String email, String senha) { // construir um objeto de forma valida
        
        this.nome = nome;
        this.email = email;

        if (senha == null || senha.length() < 6) {
            throw new IllegalArgumentException("Usuario invalido");
        }

        this.senha = senha;
    }

}

// encapsulamento

package com.platformoon.sensei.api;

import java.net.URI;
import java.util.Map;

import com.platformoon.sensei.api.dto.CriarUsuarioRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // REST Controller
@RequestMapping("/usuarios") // /usuarios mapear o path /usuarios
public class CadastroController {

    @PostMapping  // Vou mapear todos as requisicoes com o verbo HTTP POST
    public ResponseEntity<?> criarUsuario(@RequestBody CriarUsuarioRequest req) {

        var usuario = new Usuario(req.getNome(), req.getEmail(), req.getSenha());

        Usuario possivelUsuario = BancoDeDadosEmMemoria.USUARIOS.get(req.getEmail());

        if (possivelUsuario == null) {
            BancoDeDadosEmMemoria.USUARIOS.put(req.getEmail(), usuario);
        } else {
            return ResponseEntity.status(409).body(
                    Map.of("message", "Já existe um usuário com esse e-mail")
            );
        }
        return ResponseEntity
                .status(201)
                .header("Location", "/usuarios/" + usuario.getId())
                .body(usuario);
    }
}

// Camel Case
// Tipos primitivos e tipo referência em Java
// Getters e Setters no Java (Encapsulamento)
// Classe Map<> em Java
// Record JAVA 17 - O que é?
// Padrão POJO Java
// Data Transfer Object - DTO - O que é DTO?

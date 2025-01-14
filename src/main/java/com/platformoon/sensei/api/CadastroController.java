package com.platformoon.sensei.api;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // REST Controller
@RequestMapping("/usuarios") // /usuarios mapear o path /usuarios
public class CadastroController {

    @PostMapping  // Vou mapear todos as requisicoes com o verbo HTTP POST
    public ResponseEntity<?> criarUsuario(@RequestBody Map<String, String> request) {




        var usuario = new Usuario("Matheus", "email@email.com", "senha");


        System.out.println(usuario.email);


        return ResponseEntity.ok().build();
    }

}

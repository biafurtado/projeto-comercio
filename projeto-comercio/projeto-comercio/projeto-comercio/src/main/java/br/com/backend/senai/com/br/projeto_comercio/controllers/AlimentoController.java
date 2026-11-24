package br.com.backend.senai.com.br.projeto_comercio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.senai.com.br.projeto_comercio.models.Usuario;
import br.com.backend.senai.com.br.projeto_comercio.services.UsuarioService;


@RestController 
@RequestMapping("/alimento")
public class AlimentoController {

    @Autowired 
    private UsuarioService usuarioService;


    @PostMapping ("/cadastrar")
    public Usuario salvar(@RequestBody Usuario usuario ) {
        return usuarioService.salvar(usuario);
    }
}
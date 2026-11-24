package br.com.backend.senai.com.br.projeto_comercio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping ("/contar")
    public Long contar() {
        return usuarioService.contar();
    }

    @PostMapping ("/cadastrar")
    public Usuario salvar(@RequestBody Usuario usuario ) {
        return usuarioService.salvar(usuario);
    }

    @GetMapping ("/listar")
    public List<Usuario> listar() {
        return usuarioService.listar();
    }

    @GetMapping ("/buscar-por-id/{id}")
    public Usuario buscarPorId (@PathVariable Integer id) {
        return usuarioService.buscarPorId(id);
    }

    @DeleteMapping("/remover/{id}")
    public String remover(@PathVariable Integer id) {
        return "Usuario removido com sucesso";
    }

    @PutMapping ("/atualizar/{id}")
    public Usuario atualizar (@PathVariable Integer id, @RequestBody Usuario usuario) {
        return usuarioService.atualizar(id, usuario);
    }
}
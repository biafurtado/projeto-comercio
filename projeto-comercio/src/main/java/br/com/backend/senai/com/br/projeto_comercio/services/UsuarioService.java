package br.com.backend.senai.com.br.projeto_comercio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.backend.senai.com.br.projeto_comercio.models.Usuario;
import br.com.backend.senai.com.br.projeto_comercio.repositories.UsuarioRepository;


@Service
 public class UsuarioService{
    @Autowired 
    private UsuarioRepository usuarioRepository;
    
    public Long contar() {
        return usuarioRepository.count(); 
    }

    public Usuario salvar (Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId (Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public void remover (Integer id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario atualizar (Integer id, Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
package br.com.backend.senai.com.br.projeto_comercio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.backend.senai.com.br.projeto_comercio.models.Usuario;
import br.com.backend.senai.com.br.projeto_comercio.repositories.UsuarioRepository;


@Service
public class UsuarioService {
 
    @Autowired 
    private UsuarioRepository usuarioRepository;


    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
}

}
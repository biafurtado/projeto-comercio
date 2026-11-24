package br.com.backend.senai.com.br.projeto_comercio.repositories;
    
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.senai.com.br.projeto_comercio.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
package com.softjava.persistence;

import com.softjava.modelo.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Implementaçao dos métodos de persistência relacionado a
 * {@link com.softjava.modelo.Pessoa}
 *
 * @author Samuel Borges de Oliveira
 */
@Repository
public interface PessoaDAO extends JpaRepository<Pessoa, Long> {
	
	Pessoa findByNome(String nome);
	
}

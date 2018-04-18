package com.softjava.persistence;

import com.softjava.modelo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Implementaçao dos métodos de persistência relacionado a {@link com.softjava.modelo.Veiculo}
 *
 * @author Samuel Borges de Oliveira
 */
@Repository
public interface VeiculoDAO extends JpaRepository<Veiculo, Long> {
}

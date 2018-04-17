package com.softjava.controllador;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.softjava.modelo.Pessoa;
import com.softjava.util.jpa.Transactional;

	
public class PessoaControllador {

	@Inject
	private EntityManager em;

	@Transactional
	public void createPlayer(Pessoa pessoa) {
		em.persist(pessoa);
	}
}
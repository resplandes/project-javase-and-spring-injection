package com.softjava.controller;

import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.softjava.modelo.Pessoa;
import com.softjava.service.PessoaService;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com Data: 17/04/2018 - 23:04
 */
@Controller
public class PessoaController {

	@Autowired
	PessoaService service;

	public void testaPessoa() {

		try {
			///Cria Pessoa
			Pessoa pessoa1 = new Pessoa();
			pessoa1.setNome("Samuel");

			Pessoa pessoa2 = new Pessoa();
			pessoa2.setNome("Will");
			
			/* Salva Pessoa*/
			service.salvar(pessoa1);
			service.salvar(pessoa2);

			// Lista Pessoas
			List<Pessoa> pessoas = service.getListaPessoas();
			pessoas.stream().map(p -> p.getId() + " - " + p.getNome()).forEach(System.out::println);

			// Apaga
			service.deletar(pessoa1);
			

//			Pessoa samuel = service.findByNome("Samuel");
//			System.out.println(samuel.getNome());

			// Lista Pessoas
			pessoas = service.getListaPessoas();
			pessoas.stream().map(p -> p.getId() + " - " + p.getNome()).forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

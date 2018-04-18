package com.softjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.softjava.modelo.Veiculo;
import com.softjava.service.VeiculoService;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com Data: 17/04/2018 - 23:04
 */
@Controller
public class VeiculoController {

	@Autowired
	VeiculoService service;

	public void testaVeiculo() {

		try {
			// Cria Veiculo
			Veiculo veiculo1 = new Veiculo(31L, "Corolla", "JXM-9090");

			Veiculo veiculo2 = new Veiculo(32L, "S10", "WZT-0898");

			Veiculo veiculo3 = new Veiculo("Triton", "OAV-1854");

			// Salva Veiculo
			service.salvar(veiculo1);
			service.salvar(veiculo2);
			service.salvar(veiculo3);

			Veiculo veiculo = service.getVeiculo(30L);
			veiculo.setNome(veiculo.getNome() + " - ALTERADO");
			service.salvar(veiculo);
			// Lista Veiculos
			List<Veiculo> veiculos = service.getListaVeiculos();
			veiculos.stream().map(p -> p.getId() + " - " + p.getNome()).forEach(System.out::println);

			// Apaga
			service.deletar(veiculo1);

			// Lista Veiculos
			veiculos = service.getListaVeiculos();
			veiculos.stream().map(p -> p.getId() + " - " + p.getNome()).forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*Remove todos os veiculos do banco
	 * Limpa  a base de dados
	 * */
	public void deletarTodosVeiculos() {
		// Lista Veiculos
		List<Veiculo> veiculos = service.getListaVeiculos();
		veiculos.stream().map(p -> p.getId() + " - " + p.getNome()).forEach(System.out::println);

		// Deleta todos
		veiculos.stream().forEach(p -> {
			service.deletar(p);
		});
	}
}

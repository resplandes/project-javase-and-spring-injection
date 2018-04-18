package com.softjava.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo {

	private Long id;
	private String nome;
	private String placa;

	public Veiculo(Long id, String nome, String placa) {
		this.id = id;
		this.nome = nome;
		this.placa = placa;
	}

	public Veiculo(String nome, String placa) {
		this.nome = nome;
		this.placa = placa;
	}

	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}

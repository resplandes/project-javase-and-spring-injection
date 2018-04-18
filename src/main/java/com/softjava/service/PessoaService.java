package com.softjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.softjava.modelo.Pessoa;
import com.softjava.persistence.PessoaDAO;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 17/04/2018 - 22:40
 */
@Service
public class PessoaService {

    @Autowired
    private PessoaDAO dao;

    /**
     * Retorna Lista de {@link Pessoa}
     * @return
     */
    public List<Pessoa> getListaPessoas(){
        return dao.findAll();
    }
    
    public List<Pessoa> getListaPessoasFiltrada(){
        return dao.findAll();
    }
    
    public Pessoa findByNome(String nome){
    	return dao.findByNome(nome);
    }

    /**
     * Salva a {@link Pessoa} no Banco
     * @param pessoa
     * @return
     */
    public Pessoa salvar(Pessoa pessoa){
        return dao.save(pessoa);
    }

    /**
     * Deleta {@link Pessoa}
     * @param pessoa
     */
    public void deletar(Pessoa pessoa){
        dao.delete(pessoa);
    }
    
    
    /**
     * Busca por pessoa e Cpf
     * @param id
     * @param nome
     * @return
     */
    public Pessoa getPessoa(Long id, String nome){
        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);
        pessoa.setNome(nome);
        return dao.findOne(Example.of(pessoa));
    }

}

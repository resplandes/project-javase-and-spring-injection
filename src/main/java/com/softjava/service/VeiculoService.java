package com.softjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.softjava.modelo.Veiculo;
import com.softjava.persistence.VeiculoDAO;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 17/04/2018 - 22:40
 */
@Service
public class VeiculoService {

    @Autowired
    private VeiculoDAO dao;

    /**
     * Retorna Lista de {@link Veiculo}
     * @return
     */
    public List<Veiculo> getListaVeiculos(){
        return dao.findAll();
    }
    
    /**
     * Retorna objeto de {@link Veiculo}
     * @return
     */
    public Veiculo getVeiculo(Long id){
        return dao.findOne(id);
    }
    

    /**
     * Salva a {@link Veiculo} no Banco
     * @param veiculo
     * @return
     */
    public Veiculo salvar(Veiculo veiculo){
        return dao.save(veiculo);
    }

    /**
     * Deleta {@link Veiculo}
     * @param pessoa
     */
    public void deletar(Veiculo pessoa){
        dao.delete(pessoa);
    }

}

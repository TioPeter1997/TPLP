/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.inf.tp.service;

/**
 *
 * @author LucasCésar
 */
import br.cefetmg.inf.tp.util.db.exception.NegocioException;
import br.cefetmg.inf.tp.util.db.exception.PersistenciaException;
import java.util.List;
import br.cefetmg.inf.tp.domain.Fornecedor;

public interface IManterFornecedor {
    public Long cadastrar(Fornecedor fornecedor) throws PersistenciaException, NegocioException;
    public boolean alterar(Fornecedor fornecedor) throws PersistenciaException, NegocioException;
    public boolean excluir(Fornecedor fornecedor) throws PersistenciaException, NegocioException;
    public List<Fornecedor> listarTodos() throws PersistenciaException;
    public Fornecedor pesquisarPorId(Long id) throws PersistenciaException;
}


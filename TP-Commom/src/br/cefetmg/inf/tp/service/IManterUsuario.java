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
import br.cefetmg.inf.tp.domain.Usuario;

public interface IManterUsuario {
    public Long cadastrar(Usuario usuario) throws PersistenciaException, NegocioException;
    public boolean alterar(Usuario usuario) throws PersistenciaException, NegocioException;
    public boolean excluir(Usuario usuario) throws PersistenciaException, NegocioException;
    public List<Usuario> pesquisarTodos() throws PersistenciaException;
    public Usuario pesquisarPorId(Long id) throws PersistenciaException;
    public Usuario getUserLogin(String email, String senha) throws PersistenciaException, NegocioException;
    public List<Usuario> listarTodos() throws PersistenciaException;
}

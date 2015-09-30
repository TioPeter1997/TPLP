package tp.model.dao;

import br.cefetmg.inf.tp.domain.Usuario;
import br.cefetmg.inf.tp.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IUsuarioDAO {

    Long inserir(Usuario usuario) throws PersistenciaException;
    
    boolean atualizar(Usuario usuario) throws PersistenciaException;

    boolean delete(Usuario usuario) throws PersistenciaException;

    ArrayList<Usuario> listarTodos() throws PersistenciaException;

    Usuario consultarPorId(Long id) throws PersistenciaException;
    
    Usuario consultarPorEmailSenha(String nome, String senha) throws PersistenciaException;
}

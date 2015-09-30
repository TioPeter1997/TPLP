package tp.model.dao;


import br.cefetmg.inf.tp.util.db.exception.PersistenciaException;
import java.util.ArrayList;
import br.cefetmg.inf.tp.domain.Fornecedor;

public interface IFornecedorDAO {

    Long inserir(Fornecedor fornecedor) throws PersistenciaException;

    boolean atualizar(Fornecedor fornecedor) throws PersistenciaException;

    boolean delete(Fornecedor fornecedor) throws PersistenciaException;

    ArrayList<Fornecedor> listarTodos() throws PersistenciaException;

    Fornecedor consultarPorId(Long id) throws PersistenciaException;
}

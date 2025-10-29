package repository;

import java.util.List;
import java.util.Optional;

/**
 * Interface genérica de repositório para CRUD no domínio.
 * @param <T> Tipo de domínio.
 * @param <ID> Tipo do identificador.
 */
public interface ICrudRepository<T, ID> {

    T salvar(T entity);

    String buscarPorId(ID id);

    List<T> listarTodas();
}
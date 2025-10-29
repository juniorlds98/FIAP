package repository;
import ent.Medicamento;
public interface IMedicamentoRepository extends ICrudRepository<Medicamento,String>{
    void subtrairQuantidade(String nome);
}

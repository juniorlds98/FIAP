package repository;
import ent.Paciente;
public interface IPacienteService extends ICrudRepository<Paciente, String> {
    void criarPrescricao(Paciente paciente,String prescricao);
}

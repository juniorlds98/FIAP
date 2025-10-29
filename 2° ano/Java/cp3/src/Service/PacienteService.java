package Service;
import ent.Medicamento;
import repository.IPacienteService;
import ent.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteService {
    private static ArrayList<Paciente> todosPacientes = new ArrayList<Paciente>();
    public static Paciente salvar(Paciente entity){
        Paciente paciente = new Paciente(entity.nome, entity.prontuario, entity.email, entity.prescricao);
        todosPacientes.add(paciente);
        return  paciente;
    }

    public List<Paciente> listarTodas(){
        return todosPacientes;
    }
    public void criarPrescricao(Paciente paciente,String prescricao){
        System.out.println(new StringBuilder().append("Confirmando a prescricao: ").append(prescricao).toString());
        paciente.setPrescricao(prescricao);
    }

}

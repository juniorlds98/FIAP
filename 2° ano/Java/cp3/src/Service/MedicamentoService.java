package Service;
import repository.IMedicamentoRepository;
import ent.Medicamento;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MedicamentoService implements IMedicamentoRepository {
    private ArrayList<Medicamento> todosMedicamentos = new ArrayList<Medicamento>();
    public Medicamento salvar(Medicamento entity){
        Medicamento medicamento = new Medicamento(entity.nome,entity.quantidade,entity.disponibilidade);
        todosMedicamentos.add(medicamento);
        return medicamento;
    }
    public  List<Medicamento> listarTodas(){
        return todosMedicamentos;
    }
    public  String buscarPorId(String nome){
        int indice = -1;
        for (int i = 0; i < todosMedicamentos.size(); i++) {
            if (todosMedicamentos.get(i).getNome().equals(nome)) {
                return todosMedicamentos.toString();
            }
        }
        return "não encontrado";
    }
    public void subtrairQuantidade(String nome){
        int indice = -1;
        for (int i = 0; i < todosMedicamentos.size(); i++) {
            if (todosMedicamentos.get(i).getNome().equals(nome)) {
                int quantidade = todosMedicamentos.get(i).getQuantidade();
                todosMedicamentos.get(i).setQuantidade(quantidade-1);
            }
        }
    }

}

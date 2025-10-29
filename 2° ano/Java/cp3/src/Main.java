import Service.MedicamentoService;
import Service.PacienteService;
import ent.Medicamento;
import ent.Paciente;
import Worker.EmailSender;
import java.util.List;

//Caio Martinez Saes RM: 560753
//Estefany Caetano RM: 560181
//José Claudio da Silva Junior RM: 559680

public class Main {
    public static void main(String[] args) {
        MedicamentoService medicamentoService = new MedicamentoService();
        PacienteService pacienteService = new PacienteService();

        Paciente paciente1 = new Paciente("Joãozinho da Silva Sauro", "", "cometaACaminho@ig.com", "Amoxilina e repouso");
        Paciente paciente2 = new Paciente("Maria Josefina Sauro", "", "cometaACaminho2@ig.com", "Repouso e amoxilina");
        pacienteService.salvar(paciente1);
        pacienteService.salvar(paciente2);

        System.out.println("Prescrições: ");
        pacienteService.criarPrescricao(paciente1, "Se esconder do Cometa");
        pacienteService.criarPrescricao(paciente2, "Dormir");


        Medicamento medicamento1 = new Medicamento("Amoxilina", 22, true);
        Medicamento medicamento2 = new Medicamento("Dipirona", 3, false );
        medicamentoService.salvar(medicamento1);
        medicamentoService.salvar(medicamento2);

        System.out.println("Envio de email 1: ");
        EmailSender.enviarEmail(paciente1);

        System.out.println("Envio de email 2: ");
        EmailSender.enviarEmail(paciente2);

        System.out.println("Todos pacientes: ");
        List<Paciente> todos = pacienteService.listarTodas();
        for (int i = 0; i < todos.size(); i++){
            System.out.println(todos.get(i).getNome());
        }


    }

}
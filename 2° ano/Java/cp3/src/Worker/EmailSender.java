package Worker;
import ent.Paciente;

public class EmailSender {
    public static void enviarEmail(Paciente paciente){
        System.out.println("Remetente: " + paciente.getEmail());
        System.out.println("Corpo: " + paciente.getPrescricao());
        System.out.println("Médico: Dr. Hans Chucrutes");
    }
}

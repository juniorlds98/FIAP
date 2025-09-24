//Todas as vezes que um recurso estiver fora da mesma pasta que seu arquivo atual, esse recurso deverá ser importado

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import models.Cliente;
import models.Conta;

public class Main {
    public static void main(String[] args) {

        //Trabalhando com pacotes built-in

        //Exibindo todas as zonas de fuso disponíveis
        ZoneId.getAvailableZoneIds().forEach(umaZona -> System.out.println(umaZona));

        //Indicando um deslocamento baseado em GMT

        ZoneOffset meuFuso = ZoneOffset.ofHours(-3);

        //Indicando uma zona a ser utilizada
        ZoneId minhaZona = ZoneId.of("America/Noronha");

        //Capturando um momento no tempo baseado em uma zona
        ZonedDateTime data = ZonedDateTime.now(meuFuso);
        System.out.println(data);

        //Trabalhando com pacotes próprios
        Cliente ClientaA = new Cliente();
        Conta minhaConta = new Conta();
    }
}
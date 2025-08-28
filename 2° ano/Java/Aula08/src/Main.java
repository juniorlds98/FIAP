import models.Cliente;

public class Main {
    public static void main(String[] args) {
        //Criando um objeto com métod0 construtor
        Cliente clienteA = new Cliente ("Joaquim da Silva", "111.111.111-11");
        Cliente clienteB = new Cliente ("Maria Francisca", "222.222.222-22");

        //Trabalhando com repositórios não inicializados
        //Dados não inicializados não ocupam espaço em memória
        Cliente clienteC;

        //Trabalhando com repositórios inicializados
        String nome = "Antônio Jorge";
        String cpf = "333.333.333-33";
        Cliente clienteD = new Cliente(nome, cpf);

        clienteD.setNome(true, "Francisco da Silva");
        System.out.println(clienteD.getNome(true));

    }
}
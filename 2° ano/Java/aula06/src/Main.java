import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       //array primitivos
       //Todos tem índice de base 0
        String[] beatles = {"Paul", "Ringo", "George", "John"};
        //Acessando o primeiro índice de um array

        System.out.println(beatles[0]);

        //Medir tamanho de um array

        System.out.println(beatles.length);

        //Acessando último item de um array

        System.out.println(beatles[beatles.length - 1]);

        //Trabalhando com laços de repetição baseado em arrays
        //for each (para cada elemento do array)
        //Sintaxe: for(tipo nomeDeUmElemento : arrayASerutilizado){instruções a serem executadas
        for(String umBeatle : beatles){
            System.out.println(umBeatle);
        }
        //Arrays primitivos são imutáveis quanto ao seu tamanho
        //Mas ainda é possível modificar elementos de um array

        beatles[0] = "McCartney";
        System.out.println(beatles[0]);

        //Transformando um array primitivo em uma lista
        System.out.println(Arrays.toString(beatles));

        //Trabalhando com arraylist
        //Diamante <> - Indica utilização de genéricos
        //Criando uma lista (array) vazia
        ArrayList<String> pontosCardeais = new ArrayList<>();

        //Adicionando elementos a uma lista

        pontosCardeais.add("Norte");
        pontosCardeais.add("Sul");
        pontosCardeais.add("Leste");
        pontosCardeais.add("Oeste");

        //imprimindo uma lista

        System.out.println(pontosCardeais);

        //Imprimindo um elemento da lista

        System.out.println((pontosCardeais.get(0)));

        //Medindo o tamanho de uma lista
        System.out.println(pontosCardeais.size());


        //Pegando o último elemento da lista

        System.out.println(pontosCardeais.get(pontosCardeais.size() - 1));

        //Modificando itens de uma lista

        pontosCardeais.set(2, "Este");
        System.out.println(pontosCardeais.get(2));

        //Verificando se existe uma ocorrência em uma lista

        System.out.println(pontosCardeais.contains("Sul"));
        System.out.println(pontosCardeais.contains("Leste"));

        //Removendo um elemento por índice

        //pontosCardeais.remove(0);
        System.out.println(pontosCardeais);

        //Remover um elemento pelo conteúdo

        //pontosCardeais.remove("Este");
        System.out.println(pontosCardeais);

        //Limpando uma lista

        //pontosCardeais.clear();
        System.out.println(pontosCardeais);

        //Trabalhando com for each em uma lista
        //Lambda é uma função que você passa no meio de uma tupla
        pontosCardeais.forEach(umPonto -> System.out.println(umPonto));

        //Só é possível criar arrays primitivos de tipos não primitivos
    }
}
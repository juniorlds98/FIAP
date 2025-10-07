//Linha de comentários
/*Comentário
* de
* multiplas linhas*/

/**
 * <h3> Esse é um comentário JavaDoc</h3>
 * <p>- Serve para documentar códigos</p>
 * <p>- Pode ser visualizado formatado</p>
 * <p>- Tem a capacidade de exportar toda a documentação em HTML</p>
 * @Junior Silva
 * @since 10/2025
 * @see main
 */

public class Calculos {
    private int quantidadeItens;

    public Calculos(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public int acrescentarItem(){
        return quantidadeItens++;
    };

    public int removerItem(){
        return quantidadeItens--;
    }

    @Override
    public String toString(){
        return "Calculos{" +
                "quantidadeItens=" + quantidadeItens +
                '}';
    }
}

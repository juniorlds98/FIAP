public class Main {
    public static void main(String[] args) {
        //Criando objetos da classe Carro
        Carro carroA = new Carro();

        //Preenchendo as propriedades do carroA
        carroA.cor = "Azul";
        carroA.fabricante = "VW";
        carroA.modelo = "Fusca";
        carroA.preco = 80.000f;
        carroA.quilometragem = 100000;

        //Utilizar métodos
        carroA.acelerar();
        carroA.frear();
    }
}
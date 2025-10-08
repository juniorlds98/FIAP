import models.Calc;

public class Main {
    public static void main(String[] args) {

        //Criando objeto de Calc
        Calc calcA = new Calc(10, 10);

        System.out.println(calcA.getValorA());
        System.out.println(calcA.getValorB());

        calcA.setValorA(15);
        calcA.setValorB(15);

        System.out.println(calcA.toString());

        calcA.somarDoisValores();
        calcA.subtrairDoisValores();
        calcA.identificarUsuario("José");
    }
}
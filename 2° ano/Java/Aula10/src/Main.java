import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Tipos primitivos
        byte valorByte = 10;
        short valorShort = 100;
        int valorInt = 10000;
        long valorLong = 1000000;
        float valorFloat = 10.5f;
        double valorDouble = 11.555d;
        boolean valorBoolean = true;
        char valorChar = 'A';

        //Trabalhando com Wrappers

        Byte wrapByte = 10;
        Short wrapShort = 100;
        Integer wrapInt = 10000;
        Long wrapLong = 1000000L; //O L se torna obrigatório
        Float wrapFloat = 10.5f; //O F é obrigatório
        Double wrapDouble = 18.555d;
        Boolean wrapBoolean = true;
        Character wrapChar = 'T';

        //Onde devo utilizaar Wrappers?

        //1. Criação de arraylist
        //Array de java.util só pode utilizar objetos
        ArrayList<Integer> umArray = new ArrayList<>();

        //2. Para fazer parses de dados em Strings
        //É importante que a formatação da String deve estar de acordo com o tipo desejado

        Byte byteFromString = Byte.parseByte("10");
        Short shortFromString = Short.parseShort("100");
        Integer integerFromString = Integer.parseInt("10000");
        Long longFromString = Long.parseLong("1000000");
        Float floatFromString = Float.parseFloat("10.89");
        Double doubleFromString = Double.parseDouble("10.555");
        Boolean boolFromString = Boolean.parseBoolean("true");

        //3. Criando objetos a partir dos tipos primitivos
        Byte biteFromByte = Byte.valueOf(valorByte);
        Short shortFromShort = Short.valueOf(valorShort);
        Integer integerFromInt = Integer.valueOf(valorInt);
        Long longFromLong = Long.valueOf(valorLong);
        Float floatfromFloat = Float.valueOf(valorFloat);
        Double doubleFromDouble = Double.valueOf(valorDouble);
        Boolean boolFromBool = Boolean.valueOf(valorBoolean);
        Character characterFromChar = Character.valueOf(valorChar);

        //Type Casting - Mudanças de tipos de dados

        //1. Widening Casting - Automática - menor para o maior
        byte numeroParaCast = 40;
        short novoNumeroShort = numeroParaCast;
        int novoNumeroInt = novoNumeroShort;
        long novoNumeroLong = novoNumeroInt;
        float novoNumeroFloat = novoNumeroLong;
        double novoNumeroDouble = novoNumeroFloat;

        //2. Narrowing Casting - Manual - Maior para o menor

        float floatParaCasting = 18.55f;
        int numModificado = (int) floatParaCasting;
        System.out.println(numModificado);

    }
}
package org.example;

public class Aluguel {
    public static String formula = "valorDiaria * dias + 20";

    public static double calcularAluguel(double valorDiaria, double dias) {
        String expressao;
        expressao = formula.replace("valorDiaria", Double.toString(valorDiaria));
        expressao = expressao.replace("dias", Double.toString(dias));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}

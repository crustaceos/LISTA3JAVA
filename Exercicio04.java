package lista.exercicios;

import lista.classes.Dinheiro;
import lista.util.Prompt;

public class Exercicio04 {
    public static void executar() {
        /*4. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de umvalor lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com o usuário*/

        double qtd = Prompt.lerDecimal("Quantidade de dinheiro com o usuário: ");

        Dinheiro dolarParaReal = new Dinheiro(qtd);

        dolarParaReal.getCotacao(Prompt.lerDecimal("Valor da cotação atual do dolar: (US$)"));

        Prompt.imprimir("Valor em Reais da quantia informada: R$"+dolarParaReal.conversao());
    }
}

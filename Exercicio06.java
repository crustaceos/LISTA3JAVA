package lista.exercicios;

import lista.classes.CustoEVenda;
import lista.util.Prompt;

public class Exercicio06 {
    public static void executar() {
        /*6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelousuário*/

        //resposta
        CustoEVenda venda1 = new CustoEVenda();

        venda1.getCusto(Prompt.lerDecimal("Valor total de custo: "));

        venda1.getPercAcrec(Prompt.lerDecimal("Porcentagem de acrecimo: "));

        String calcVal = String.format("%.2f", venda1.calcValVenda()).replace(",", ".");

        Prompt.imprimir("Valor de venda: R$" + calcVal);
    }
}

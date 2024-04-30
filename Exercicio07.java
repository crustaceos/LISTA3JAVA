package lista.exercicios;

import lista.classes.CustoAoConsumidor;
import lista.util.Prompt;

public class Exercicio07 {
    public static void executar() {
        /*7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois apercentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor sejade 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo. */

        //resposta
        CustoAoConsumidor consumidor1 = new CustoAoConsumidor();

        consumidor1.getCustoFabrica(Prompt.lerDecimal("Qual o custo de fabrica do veículo: "));

        Prompt.separador();
        Prompt.imprimir("O custo total ao consumidor será: R$" + consumidor1.calcCustoTotal());

        Prompt.separador();
        System.out.printf("Custo de fabrica: %.2f", consumidor1.custoFabrica);

        System.out.printf("\nImpostos: %.2f", consumidor1.impostos);

        System.out.printf("\nImpostos a distribuidora: %.2f\n", consumidor1.impostosDistribuidora);
        Prompt.separador();
    }
}

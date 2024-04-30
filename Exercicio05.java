package lista.exercicios;

import lista.classes.PrestacaoMCA;
import lista.util.Prompt;

public class Exercicio05 {
    public static void executar() {
        /*5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.Faça um programa que receba um valor de uma compra e mostre o valor das prestações.*/

        PrestacaoMCA compra1 = new PrestacaoMCA(Prompt.lerDecimal("Valor da Compra: "));

        Prompt.imprimir("Valor da prestação: R$" + compra1.valPrestacao);

    
    }
}

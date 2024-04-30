package lista.exercicios;

import lista.util.Prompt;
import lista.classes.Carro;

public class Exercicio02 {
    public static void executar() {
        /*2. Escrever um programa para 
        determinar o consumo médio de um 
        automóvel sendo fornecida a
        distância total percorrida pelo 
        automóvel e o total de combustível
        gasto.*/

        Carro carro1 = new Carro();

        carro1.getDistPercorrida(Prompt.lerDecimal("Distancia que esse carro percorreu: "));
        carro1.getCombustivelGasto(Prompt.lerDecimal("Combustivel gasto pelo carro: "));
        carro1.consumoMedio(carro1.distPercorrida, carro1.combustivelGasto);
        
        String CM = String.format("%.2f", carro1.consumoMedio).replace(".", ",");
        Prompt.imprimir(CM + " Km/l");
    }   

}

package lista.exercicios;

import lista.classes.Reajuste;
import lista.util.Prompt;

public class Exercicio16 {
    public static void executar() {
        /*16. Escrever um programa para uma empresa que decide dar um reajuste
        a seus 584 funcionários de acordo com os seguintes critérios:
        a) 50% para aqueles que ganham menos do que três salários mínimos;
        b) 20% para aqueles que ganham entre três até dez salários mínimos;
        c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
        d) 10% para os demais funcionários*/

        //resposta
        Reajuste funcionario[] = new Reajuste[584];
        String txt;
        double porc, salMinimo = 1412;
        boolean gerarAleatorio = false;

        String escolha = Prompt.lerLinha("Deseja Implementar aleatóriamente: ");
        
        if(escolha.charAt(0) == 's' || escolha.charAt(0) == 'S'){
            gerarAleatorio = true;
        }

        Prompt.separador();

        for (int i = 0; i < funcionario.length; i++) {
        
            funcionario[i] = new Reajuste();

            Prompt.imprimir("\n== Funcionário " + (i+1)+" ==");
        if(gerarAleatorio == true){
            funcionario[i].getSalario(Prompt.decimalAleatorio(salMinimo, (salMinimo * 50)));

            txt = String.format("%.2f",  funcionario[i].salarioAntigo).replace(",", ".");

            Prompt.imprimir("Salário antigo: R$" + txt);
        }
        else{
            funcionario[i].getSalario(Prompt.lerDecimal("Salário antigo:"));
        }

            double j = funcionario[i].salarioAntigo;

            if(j < (salMinimo * 3)){
                porc = 1.50;
            }
            else if(j >= (salMinimo * 3) && j <= (salMinimo * 10)){
                porc = 1.20;
            }
            else if(j > (salMinimo * 10) && j <= (salMinimo * 20)){
                porc = 1.15;
            }
            else{
                porc = 1.10;
            }
            funcionario[i].defPorcentagem(porc);

            funcionario[i].defSalarioNovo(j * porc);

            txt = String.format("%.2f",  funcionario[i].salarioNovo).replace(",", ".");

            Prompt.imprimir("Novo Salario: R$" +txt);
        }
        Prompt.separador();
    }
}

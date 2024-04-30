package lista.exercicios;

import java.util.ArrayList;
import lista.classes.Reajuste;
import lista.util.Prompt;

public class Exercicio17 {
    public static void executar() {
        /*17. Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salárior e ajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento.*/

        int i = 0,k=0;
        double aumentoFolha = 0, aux = 0;
        ArrayList<Reajuste> lista = new ArrayList<Reajuste>();

        

        Prompt.separador();
        double salarioMinimo = Prompt.lerDecimal("Valor atual do salário mínimo: ");
        Prompt.separador();

        do{
            double qtdSalarios = 0;
            
            Reajuste funcionario = new Reajuste(); 

            Prompt.imprimir("\n== Funcionário " + (i+1)+" ==");

            funcionario.getNome(Prompt.lerLinha("Nome: "));
            funcionario.getSalario(Prompt.lerDecimal("Salário antigo: "));
            funcionario.getQtdSalarios(salarioMinimo/funcionario.salarioAntigo);
            qtdSalarios = Prompt.arredondar(funcionario.qtdSalarios);
            
            aux = salarioMinimo * qtdSalarios;
            
            if(aux >= funcionario.salarioAntigo){
                funcionario.salarioNovo = aux;
                funcionario.reajuste = funcionario.salarioNovo - funcionario.salarioAntigo;
                aumentoFolha += funcionario.reajuste;
            }else{
                funcionario.salarioNovo = funcionario.salarioAntigo;
            }

            lista.add(funcionario);
            String escolha = Prompt.lerLinha("Deseja continuar: ");
        
        if(escolha.charAt(0) == 'n' || escolha.charAt(0) == 'N'){
            break;
        }

        i++;
        }while(true);

        Prompt.separador();
        k = 0;
        for (Reajuste f : lista) {
            Prompt.imprimir("\n== Funcionário " + (k+1)+" ==");
            Prompt.imprimir("Salario Antigo:" + f.salarioAntigo + "\nReajuste: R$"+ (f.reajuste));
            Prompt.imprimir("Nome:" + f.nome + "\nSalario final: R$"+ f.salarioNovo);
            k++;
        }
        Prompt.separador();
        Prompt.imprimir("A empresa vai aumentar sua folha de pagamento em R$" + aumentoFolha);
        Prompt.separador();
        
    }
}

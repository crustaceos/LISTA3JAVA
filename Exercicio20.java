package lista.exercicios;

import lista.classes.HoraAula;
import lista.util.Prompt;

public class Exercicio20 {
    public static void executar() {
        /*20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:

        Professor Nível 1 R$12,00 por hora/aula
        Professor Nível 2 R$17,00 por hora/aula
        Professor Nível 3 R$25,00 por hora/aula
        */

        //resposta:
        int nivel;
        boolean valido;
        
        Prompt.separador();
        do{ 
            valido = false;
            nivel = Prompt.lerInteiro("Nivel do Professor: (1,2 ou 3):");

            if(nivel <= 1 && nivel >= 3){
                Prompt.imprimir("Nível inválido\nDigite novamente\n");
            }else{
                valido = true;
            }
        }while(valido == false);
        HoraAula professor = new HoraAula();

        professor.getNivelEDefinirHA(nivel);

        String txt = String.format("%.2f", professor.valorHA).replace(",", ".");

        Prompt.imprimir("Professor Nível "+professor.nivel+" R$"+txt+" por hora/aula");
        Prompt.separador();
    }
}

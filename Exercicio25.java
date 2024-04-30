package lista.exercicios;

import lista.classes.Aluno;
import lista.util.Prompt;

public class Exercicio25 {
    public static void executar() {
        /*25. Dado o nome de um estudante, 
        com o respectivo número de matrícula
        e as três notas acima mencionadas,
        desenvolva um programa para calcular
        a nota final e a classificação de cada
        estudante. A classificação é dada conforme 
        a lista abaixo:
        
        Nota Final      Classificação
        [8,10]              A
        [7,8]               B
        [6,7]               C
        [5,6]               D
        [0,5]               R
        
        Imprima o nome do estudante, com o seu número, nota final e classificação
        */

        Aluno aluno = new Aluno(3);
        int flag;
        aluno.lerNome();
        aluno.getMatricula(Prompt.lerLinha("Matricula: "));
        for(int i = 0; i < aluno.nProvas; i++){

            do{

            aluno.notas[i] = Prompt.lerDecimal("Nota["+(i + 1)+"]:");
            
            flag = 0;

            if(aluno.notas[i] <= 10 && aluno.notas[i] >= 0){

            }else{
                System.out.println("nota inválida");
                flag++;
            }
            }while(flag == 1);
            aluno.pesos[0] = 2;
            aluno.pesos[1] = 3;
            aluno.pesos[2] = 5;

            aluno.notaFinal = ((aluno.notas[0] * aluno.pesos[0]) + (aluno.notas[1] * aluno.pesos[1]) + (aluno.notas[2] * aluno.pesos[2]))/(aluno.pesos[0] + aluno.pesos[1] + aluno.pesos[2]);
            
        }
        Prompt.separador();
        aluno.defClassificacao(aluno.notaFinal);
        Prompt.imprimir("Nome: "+aluno.nome+"\nMatrícula: "+aluno.matricula+"\nNota final: "+ aluno.notaFinal + "\nClassificação: " + aluno.classificacao);
        
        Prompt.separador();

    }
}

package lista.exercicios;

import lista.classes.Aluno;
import lista.util.Prompt;

public class Exercicio08 {
    public static void executar() {
        /*8. Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9)*/
        //resposta
        double soma = 0;
        int flag;
        Aluno aluno1 = new Aluno(3);
        aluno1.lerNome();
        Prompt.separador();
        Prompt.imprimir("Lendo notas:");
        

        for(int i = 0; i < aluno1.nProvas; i++){
            do{

            aluno1.notas[i] = Prompt.lerDecimal("Nota["+(i + 1)+"]:");
            
            flag = 0;

            if(aluno1.notas[i] <= 10 && aluno1.notas[i] >= 0){

            soma += aluno1.notas[i];
            }else{
                System.out.println("nota inválida");
                flag++;
            }
            }while(flag == 1);
        }
        Prompt.separador();

        Prompt.imprimir("Nome: " + aluno1.nome);
        double mediaAritimetica = (soma)/3;

        Prompt.imprimir("Nota final: " + mediaAritimetica);

        if(mediaAritimetica >= 7){
            Prompt.imprimir("Aluno Aprovado");

        }else if(mediaAritimetica > 5 && mediaAritimetica < 7){
            Prompt.imprimir("Aluno em Recuperação");

        }else if(mediaAritimetica <= 5){
            Prompt.imprimir("Aluno Reprovado");
        }
    }
}

package lista.exercicios;
import lista.classes.Aluno;
import lista.util.Prompt;

public class Exercicio01 {
    public static void executar() {
        /*1. Escrever um programa que leia o nome de um aluno 
        e as notas das três provas que ele obteve no semestre. 
        No final informar o nome do aluno e a sua média 
        (aritmética).*/

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
    }
}
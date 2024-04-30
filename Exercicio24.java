package lista.exercicios;

import lista.classes.Aluno;
import lista.util.Prompt;

public class Exercicio24 {
    public static void executar() {
        /*24. Em um curso de Ciência da Computação 
        a nota do estudante é calculada a partir de 
        três notas atribuídas, respectivamente, a 
        um trabalho de laboratório, a uma avaliação 
        semestral e a um examefinal. As notas variam, 
        de 0 a 10 e a nota final é a média ponderada 
        das três notas mencionadas.A lista abaixo 
        fornece os pesos:
        
        a. Laboratório: peso 2
        b. Avaliação semestral: peso 3
        c. Exame final: peso 5
        
        */

        Aluno aluno = new Aluno(3);
        int flag;

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
        Prompt.imprimir("Nota final: "+aluno.notaFinal);
        Prompt.separador();
    }
}

package lista.exercicios;

import lista.classes.Idades;
import lista.util.Prompt;

public class Exercicio10 {
    public static void executar() {
        /*10. Faça um programa que receba a idade de um número finito de pessoas e mostre mensageminformando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18anos como maior de idade.*/

        //resposta
        int n = Prompt.lerInteiro("Quantas pessoas serão registradas: ");

        Idades pessoa = new Idades(n);
        Prompt.separador();

        for (int i = 0; i < pessoa.numPessoas; i++) {

            pessoa.idades[i] = Prompt.lerInteiro("idade pessoa["+ (i+1) +"]:");

            if(pessoa.idades[i] >= 18){
                Prompt.imprimir("-->Maior de idade\n");
            }
            else{
                Prompt.imprimir("-->Menor de idade\n");
            }
        }
        
        Prompt.separador();
    }
}

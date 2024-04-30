package lista.exercicios;

import lista.classes.RegistroMilitar;
import lista.util.Prompt;

public class Exercicio13 {
    public static void executar() {
        /*13. Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informese está apta ou não para cumprir o serviço militar obrigatório. Informe os totais*/

        //resposta
        int nC = Prompt.lerInteiro("Quantidade de candidatos: "); 

        RegistroMilitar candidato[] = new RegistroMilitar[nC];

        for (int i = 0; i < candidato.length; i++) {
            candidato[i] = new RegistroMilitar();

            Prompt.imprimir("\nCandidato "+(i+1));
            candidato[i].getNomePessoa(Prompt.lerLinha("-Nome: "));
            candidato[i].getSexoPessoa(Prompt.lerLinha("-Sexo:"));
            candidato[i].getIdade(Prompt.lerInteiro("-Idade:"));
            candidato[i].getSaude();
        }
        Prompt.separador();


        for (int i = 0; i < candidato.length; i++) {
            Prompt.imprimir("\nCandidato "+(i+1));
            Prompt.imprimir("-Nome: "+candidato[i].nome+"\n-Sexo: "+ candidato[i].sexo +"\n-Idade: "+candidato[i].idade + "\n-Está com saude: ");

            if(candidato[i].saude == true){
                Prompt.imprimir("Sim");
            }else{
            Prompt.imprimir("Não");
            }

            Prompt.imprimir("-Apto a servir: ");

            if(candidato[i].idade >= 18 && candidato[i].saude == true){
                Prompt.imprimir("Sim");
            }
            else{
            Prompt.imprimir("Não");
            }
        }
        Prompt.separador();
    }
}

package lista.exercicios;

import lista.classes.BancoDeNomes;
import lista.classes.RegistroPessoas;
import lista.util.Prompt;

public class Exercicio11 {
    public static void executar() {
        /*11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. No final informe total de homens e de mulheres.*/

        //resposta
        int nHomens = 0, nMulheres = 0; 
        boolean gerarAleatorio = false;
        
        RegistroPessoas pessoas[] = new RegistroPessoas[56];
        BancoDeNomes nomesA = new BancoDeNomes();

        Prompt.separador();
        
        String escolha = Prompt.lerLinha("Deseja Implementar aleatóriamente: ");
        
        if(escolha.charAt(0) == 's' || escolha.charAt(0) == 'S'){
            gerarAleatorio = true;
        }

        Prompt.separador();
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new RegistroPessoas();
            if(gerarAleatorio == true){
                int n = Prompt.inteiroAleatorio(0, 1);
                int j = Prompt.inteiroAleatorio(0, 90);
                if(n == 0){
                    pessoas[i].getNome(nomesA.nomesMasc[j]);
                    pessoas[i].getSexo("Homem");
                    nHomens++;
                }else{
                    pessoas[i].getNome(nomesA.nomesFem[j]);
                    pessoas[i].getSexo("Mulher");
                    nMulheres++;
                } 
                Prompt.imprimir("Nome: " + pessoas[i].nome + "\nSexo: " + pessoas[i].sexo);
            }
            else{
                pessoas[i].getNome(Prompt.lerLinha("Nome da Pessoa: "));

                pessoas[i].getSexo(Prompt.lerLinha("Sexo da Pessoa: "));
                if(pessoas[i].sexo == "Mulher" || pessoas[i].sexo == "Feminino" || pessoas[i].sexo == "mulher" || pessoas[i].sexo == "feminino"){
                    nMulheres++;
                }else if(pessoas[i].sexo == "Homem"|| pessoas[i].sexo == "homem" || pessoas[i].sexo == "Masculino" || pessoas[i].sexo == "masculino"){
                    nHomens++;
                }    
            }
            Prompt.separador();
        }
        Prompt.imprimir("-->Quantidade de Homems: " + nHomens + "\n-->Quantidade de Mulheres: " + nMulheres);
            Prompt.separador();
    }
}

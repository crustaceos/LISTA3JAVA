package lista.exercicios;

import lista.classes.PesoIdeal;
import lista.util.Prompt;

public class Exercicio23 {
    public static void executar() {
        /*23. Faça um programa que leia o nome, o sexo, 
        a altura e a idade de uma pessoa. 
        Calcule e mostre nome e o seu peso ideal de acordo 
        com as seguintes características da pessoa:
        
        Sexo    Altura      Idade       Peso Ideal

        M>      1.70        <= 20       (72.7*h) - 58
                            21 a 39     (72.7*h) - 53
                            >= 40       (72.7*h) - 45
                
                <= 1.70     <= 40       (72.7*h) - 50
                            > 40        (72.7*h) - 58
        

        F>      1.50         ---        (62.1*h) - 44.7

                <= 1.50     >= 35       (62.1*h) - 45
                            < 35        (62.1*h) - 49
    */
        PesoIdeal pessoa = new PesoIdeal();
        Prompt.separador();
        pessoa.getNome(Prompt.lerLinha("Nome:"));
        double x = 0;
        boolean flag;
        do{
            flag = false;
            pessoa.getSexo(Prompt.lerCaractere("Sexo(M/F)"));
            
            if(pessoa.sexo == 'm' || pessoa.sexo == 'M'){
                flag = true;
            }else if(pessoa.sexo == 'f' || pessoa.sexo == 'F'){
                flag = true;
            }else{
                Prompt.imprimir("Sexo inválido\nDigite novamente\n");
            }
        }while(flag == false);
        
        pessoa.getAltura(Prompt.lerDecimal("Altura:"));
        pessoa.getIdade(Prompt.lerInteiro("Idade:"));
        Prompt.separador();

        //form masc (72.7*h) - x
        //form fem (62.1*h) - x
        
        if(pessoa.sexo == 'm' || pessoa.sexo == 'M'){
            if(pessoa.altura > 1.7){

                if(pessoa.idade <= 20){
                    x = 58;
                }
                else if(pessoa.idade >= 21 && pessoa.idade <= 39){
                    x = 53;
                }
                else if(pessoa.idade >= 40){
                    x = 45;
                }

            }
            else if(pessoa.altura <= 1.7){

                if(pessoa.idade <= 40){
                    x = 50;
                }
                else if(pessoa.idade >40){
                    x = 58;
                }
            }
            pessoa.pesoIdeal = (72.7*pessoa.altura) - x;
        }
        else if(pessoa.sexo == 'f' || pessoa.sexo == 'F'){
            if(pessoa.altura > 1.5){
                x = 44.7;
            }
            else if(pessoa.altura <= 1.5){
                if(pessoa.idade >= 35){
                    x = 45;
                }
                else if(pessoa.idade < 35){
                    x = 49;
                }
            }
            pessoa.pesoIdeal = (62.1 * pessoa.altura) - x;
        }
        String txt = String.format("%.2f", pessoa.pesoIdeal).replace(",", ".");
        Prompt.imprimir("Nome: " + pessoa.nome);
        Prompt.imprimir("Peso ideal: \n" + txt + "Kg");
        Prompt.separador();
    }
}

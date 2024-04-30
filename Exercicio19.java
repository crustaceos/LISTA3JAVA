package lista.exercicios;

import lista.classes.Triangulo;
import lista.util.Prompt;

public class Exercicio19 {
    public static void executar() {
        /*19. Escrever um programa que leia três valores 
        inteiros e verifique se eles podem ser os lados de
        um triângulo. Se forem, informar qual o tipo de 
        triângulo que eles formam: equilátero, isóscele ou
        escaleno.
        
        Propriedade: o comprimento de cada lado de um triângulo 
        é menor do que a soma dos comprimentos dos outros dois lados.

        Triângulo Equilátero: aquele que tem os comprimentos dos três
        lados iguais;
        
        Triângulo Isóscele: aquele que tem os comprimentos de dois lados i
        guais. Portanto, todotriângulo equilátero é também isóscele;

        Triângulo Escaleno: aquele que tem os comprimentos de seus três lados 
        diferentes.*/

        //resposta:
        Triangulo triangulo = new Triangulo(); 
        boolean trianguloValido = false; 
        int[] ladoTeste = new int[3];

        //ler lados e validar triangulo
        Prompt.separador();
        do{
            trianguloValido = false;

            for (int i = 0; i < 3; i++) {
                triangulo.getLado(lerLado(i), i);
                ladoTeste[i] = triangulo.lados[i];
            }

        trianguloValido = validarTriangulo(trianguloValido, ladoTeste);
         
        }while(trianguloValido == false);

        triangulo.tipo = defTriangulo(ladoTeste[0], ladoTeste[1], ladoTeste[2]);

        Prompt.separador();
        Prompt.imprimir("O triangulo é do tipo: "+triangulo.tipo);
        Prompt.separador();
    }
    
    public static boolean validarTriangulo(boolean trianguloValido, int ladoTeste[]){
        if(ladoTeste[0] > ladoTeste[1] + ladoTeste[2]){
            Prompt.imprimir("O tamanho do lado 1 é maior que a soma dos outros lados\n");
            Prompt.separador();
         }
         else if(ladoTeste[1] > ladoTeste[0] +ladoTeste[2]){
            Prompt.imprimir("O tamanho do lado 2 é maior que a soma dos outros lados");
         }
         else if(ladoTeste[2] > ladoTeste[0] + ladoTeste[1]){
            Prompt.imprimir("O tamanho do lado 3 é maior que a soma dos outros lados");
         }
         else{
            trianguloValido = true;
            Prompt.imprimir("Triangulo válido");
         }

         return trianguloValido;
    }

    public static int lerLado(int i){
        int lado;
            do{
                lado = Prompt.lerInteiro("Lado " + (i + 1)+ ":");

                if(lado <= 0){
                    Prompt.imprimir("->Tamanho inválido\nDigite novamente\n");
                }
            }while(lado <= 0);

            return lado;
    }

    public static String defTriangulo(int x, int y, int z){
        String tipo;

        if(x == y && x == z){
            tipo = "Equilátero";
        }
        else if(x == y || x == z){
            tipo = "Isóceles";
        }else{
            tipo = "Escaleno";
        }
        
        return tipo;
    }
}

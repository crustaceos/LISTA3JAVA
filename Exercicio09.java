package lista.exercicios;

import lista.classes.Intervalo10a150;
import lista.util.Prompt;

public class Exercicio09 {
    public static void executar() {
        /*9. Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive)e 150 (inclusive).*/

        int min = 1, max = 200, intervalo = max - min + 1;
        double rand;

        Intervalo10a150 numeros = new Intervalo10a150();
        //resposta
        for (int i = 0; i < 80; i++) {
            rand = (double)(Math.random() * intervalo) + min;

            numeros.getNumber(rand, i);
            
            System.out.printf("\n%.2f",numeros.arrayDeNumeros[i]);
            if(rand >= 10 && rand <= 150){
                System.out.printf("<--");
                numeros.dentroIntervalo++;
            }
        }
        Prompt.linhaEmBranco();
        Prompt.separador();
        Prompt.imprimir("Numeros dentro do intervalo entre 10 e 150: " + numeros.dentroIntervalo);
        Prompt.separador();
    }
}

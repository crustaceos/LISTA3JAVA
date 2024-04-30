package lista.exercicios;

import lista.classes.PrecoDeCusto;
import lista.util.Prompt;

public class Exercicio14 {
    public static void executar() {
        /*14. Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostrecomo resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço de custo e do preço de venda*/
        PrecoDeCusto produto[] = new PrecoDeCusto[40];
        Prompt.separador();
        double somaVenda = 0, somaCusto = 0, mediaVendas, mediaCusto;
        boolean gerarAleatorio = false;
        String texto,texto2;

        String escolha = Prompt.lerLinha("Deseja Implementar aleatóriamente: ");
        
        if(escolha.charAt(0) == 's' || escolha.charAt(0) == 'S'){
            gerarAleatorio = true;
        }
        Prompt.separador();
        for (int i = 0; i < produto.length; i++) {
            produto[i] = new PrecoDeCusto();

            Prompt.imprimir("\n=> Produto "+ (i+1));

        if(gerarAleatorio == true){
            double k = Prompt.decimalAleatorio(0, 10000);
            texto = String.format("%.2f",k).replace(",", ".");
            double j = Prompt.decimalAleatorio(0, 10000);
            texto2 = String.format("%.2f",j).replace(",", ".");
            
            produto[i].getCusto(k);
            Prompt.imprimir("Preço de custo: R$" + texto);

            produto[i].getVenda(j);
            Prompt.imprimir("Preço de venda: R$" + texto2);

        }else{
            produto[i].getCusto(Prompt.lerDecimal("Preço de custo: "));

            produto[i].getVenda(Prompt.lerDecimal("Preço de venda: "));
        }
            
        if(produto[i].precoCusto > produto[i].precoVenda){

            texto = String.format("%.2f",(produto[i].precoCusto - produto[i].precoVenda)).replace(",", ".");

            Prompt.imprimir("Houve prejuiso de: R$" + texto);

        }else if(produto[i].precoCusto == produto[i].precoVenda){
            Prompt.imprimir("Preço de custo e de venda iguais");
        }else{
            texto = String.format("%.2f",(produto[i].precoVenda - produto[i].precoCusto)).replace(",", ".");
            Prompt.imprimir("Houve lucro de: R$" + texto); 
        }
        
            somaCusto += produto[i].precoCusto;
            somaVenda += produto[i].precoVenda;
    }   

    mediaCusto = somaCusto/40;
    mediaVendas = somaVenda/40;

    
    texto = String.format("%.2f",mediaCusto).replace(",", ".");
    texto2 = String.format("%.2f",mediaVendas).replace(",", ".");

    Prompt.separador();
    Prompt.imprimir("Média de Custo: R$"+texto+"\nMédia de Vendas: R$"+texto2);
    Prompt.separador();
    }
}

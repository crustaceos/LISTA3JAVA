package lista.exercicios;
import lista.classes.Vendedor;
import lista.util.Prompt;

public class Exercicio03 {
    public static void executar() {
        /*
        3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobresuas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês
        */
        
        String nome = Prompt.lerLinha("Nome do Vendendor: ");
        Vendedor vendedor1 = new Vendedor(nome);

        vendedor1.getSalario(Prompt.lerDecimal("Salário fixo do Vendendor: "));
        
        vendedor1.getVendas(Prompt.lerDecimal("Total em R$ de vendas do vendedor:"));

        Prompt.separador();
        Prompt.imprimir("Nome: "+vendedor1.nome+"\nSalário fixo:"+ vendedor1.salarioFixo+"\nSalário final:"+ vendedor1.calcSalario());
        
    }
}

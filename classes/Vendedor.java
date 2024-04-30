package lista.classes;

public class Vendedor {
    
    public String nome;
    public double salarioFixo;
    public double totalVendas;
    public double salarioTotal;
    public double comicao = 0.15;

    public Vendedor(String nome){
        this.nome = nome;
    }
    public void getSalario(double salarioFixo){
        this.salarioFixo = salarioFixo;
    }
    public void getVendas(double totalVendas){
        this.totalVendas = totalVendas;
    }

    public double calcSalario(){
        return this.salarioTotal = (this.totalVendas * this.comicao) + this.salarioFixo;
    }
}

package lista.classes;

public class Reajuste {
    public String nome;
    public double salarioAntigo;
    public double salarioNovo;
    public double porcentagemReajuste;
    public double reajuste;
    public double qtdSalarios;

    public void getSalario(double salarioAntigo){
        this.salarioAntigo = salarioAntigo;
    }
    public void getNome(String nome){
        this.nome = nome;
    }
    public void defPorcentagem(double porcentagemReajuste){
        this.porcentagemReajuste = porcentagemReajuste;
    }
    public void defSalarioNovo(double salarioNovo){
        this.salarioNovo = salarioNovo;
    }
    public void getQtdSalarios(double qtdSalarios){
        this.qtdSalarios = qtdSalarios;
    }
}

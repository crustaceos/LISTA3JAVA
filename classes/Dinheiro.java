package lista.classes;

public class Dinheiro {
    public double valDolar;
    public double valReais;
    public double cotacao;

    public Dinheiro(double valDolar){
        this.valDolar = valDolar;
    }

    public void getCotacao(double cotacao){
        this.cotacao = cotacao;
    }

    public double conversao(){
        return this.valReais = this.valDolar * this.cotacao;
    }






}

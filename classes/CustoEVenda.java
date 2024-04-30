package lista.classes;

public class CustoEVenda {
    public double precoCusto;
    public double valorVenda;
    public double percAcrecimo;


    public void getCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }

    public void getPercAcrec(double percAcrecimo){
        this.percAcrecimo = percAcrecimo;
    }

    public double calcValVenda(){
        return this.valorVenda =  this.precoCusto *(1 + (this.percAcrecimo / 100));
    }
}

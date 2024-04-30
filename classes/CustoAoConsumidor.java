package lista.classes;

public class CustoAoConsumidor {
    public double custoTotal;
    public double custoFabrica;
    public double porcDistribuidora = 0.28;
    public double porcImposto = 0.45;
    public double impostos;
    public double impostosDistribuidora;
    
    public void getCustoFabrica(double custoFabrica){
        this.custoFabrica = custoFabrica;
    
    }

    public double calcCustoTotal(){
        this.impostos = this.custoFabrica * this.porcImposto;

        this.impostosDistribuidora = (this.custoFabrica + this.impostos) * this.porcDistribuidora;

        return this.custoTotal = this.custoFabrica + this.impostos + impostosDistribuidora;  
    }
}

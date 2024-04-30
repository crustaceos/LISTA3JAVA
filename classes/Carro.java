package lista.classes;

public class Carro {
    public double consumoMedio;
    public double distPercorrida;
    public double combustivelGasto;

    public void getDistPercorrida(double distPercorrida){
        this.distPercorrida = distPercorrida;
    }
    public void getCombustivelGasto(double combustivelGasto){
        this.combustivelGasto = combustivelGasto;
    }
    public void consumoMedio(double distPercorrida, double combustivelGasto){
        this.consumoMedio = distPercorrida/combustivelGasto;
    }
    
}

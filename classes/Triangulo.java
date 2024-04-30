package lista.classes;

public class Triangulo {
    public int[] lados = new int[3];
    public String tipo;
    public void getLado(int lado, int i){
        this.lados[i] = lado;
    }
}

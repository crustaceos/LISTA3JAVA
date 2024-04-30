package lista.classes;

public class HoraAula {
    public int nivel;
    public double valorHA;

    public void getNivelEDefinirHA(int nivel){
        
        if(nivel == 1){
            this.valorHA = 12;
        }else if(nivel == 2){
            this.valorHA = 17;
        }else{
            this.valorHA = 25;
        }
        this.nivel = nivel;
    }

}

package lista.classes;

public class Abono {
    public String nome;
    public double salarioFixo;
    public char sexo;
    public double abono;
    public int idade;
    public double salarioLiquido;

    public void getSalarioFixo(double salarioFixo){
        this.salarioFixo = salarioFixo;
    }
    public void getNome(String nome){
        this.nome = nome;
    }
    public void getIdade(int idade){
        this.idade = idade;
    }
    public void getSexo(char sexo){
        this.sexo = sexo;

        if(this.sexo == 'M' || this.sexo == 'm' ){
            if(this.idade >= 30){
                this.abono = 100;
            }else{
                this.abono = 50;
            }
        }else{
            if(this.idade >= 30){
                this.abono = 200;
            }
            else{
                this.abono = 80;
            }
        }
    }
    public double calcSalarioLiquido(double abono){
        return this.salarioLiquido = this.salarioFixo + abono;
    }
}


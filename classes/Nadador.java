package lista.classes;

public class Nadador {
    public int categoria;
    public int idade;


    public void getIdade(int idade){
        this.idade = idade;

        int i;

        if(idade >= 5 && idade <= 7){
            i = 0;
        }else if(idade >= 8 && idade <= 10){
            i = 1;
        }else if(idade >=11 && idade <= 13){
            i = 2;
        }else if(idade >= 14 && idade <= 17){
            i = 3;
        }else if(idade >= 18 && idade <= 25){
            i = 4;
        }else{
            i = 5;
        }
        this.categoria = i;
    }
}

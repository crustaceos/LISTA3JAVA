package lista.classes;

import lista.util.Prompt;

public class RegistroMilitar {
    public String nome;
    public String sexo;
    public int idade;
    public boolean saude;

    public void getNomePessoa(String nome){
        this.nome = nome;
    }
    
    public void getSexoPessoa(String sexo){
        this.sexo = sexo;
    }
    
    public void getIdade(int idade){
        this.idade = idade;
    }

    public void getSaude(){
        int flag = 0;
        
        do{
            char saude = Prompt.lerCaractere("Candato está com saúde(s/n): ");
            flag = 1;
            if(saude == 's' || saude == 'S'){
                this.saude = true;
            }else if(saude == 'n' || saude == 'N'){
                this.saude = false;
            }else{
                flag = 0;
                System.out.println("Resposta invalida digite novamente...");
            }
        }while(flag == 0);
        
    }
}

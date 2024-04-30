package lista.classes;
import lista.util.Prompt;

public class Aluno {
    
    public String nome;
    public int nProvas;
    public double[] notas;
    public int[] pesos;
    public double notaFinal;
    public char classificacao;
    public String matricula;

    public Aluno(int nProvas){
        this.nProvas = nProvas;
        notas = new double[nProvas];
        pesos = new int[nProvas];
    }
    
    public void lerNome(){
        this.nome = Prompt.lerLinha("Nome do aluno:");
    }

    public void defClassificacao(double nota){
        char classif = ' ';

        if(nota <= 10 && nota >= 8){
            classif = 'A';    
        }
        else if(nota < 8 && nota >= 7){
            classif = 'B';    
        }
        else if(nota < 7 && nota >= 6){
            classif = 'C';    
        }
        else if(nota < 6 && nota >= 5){
            classif = 'D';    
        }
        else if(nota < 5){
            classif = 'R';    
        }
        this.classificacao = classif;
    }
    public void getMatricula(String matricula){
        this.matricula = matricula;
    }

}

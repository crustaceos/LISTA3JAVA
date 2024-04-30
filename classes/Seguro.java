package lista.classes;

public class Seguro {
    public char grupoRisco;
    public String nome;
    public int idade;
    public int categoria;

    public void getNome(String nome){
        this.nome = nome;
    }
    public void getIdade(int idade){
        this.idade = idade;
    }
    public void getGrupoRisco(char grupoRisco){
        this.grupoRisco = grupoRisco;
    }
    public void defCategoria(int categoria){
        this.categoria = categoria;
    }
}

package listCollections.classes;

public class Pessoa {
    private String nome;
    private int idade;
    private int skill;

    public String getNome() {
        return nome;
    }
    public int getSkill() {
        return skill;
    }
    public void setSkill(int skill) {
        this.skill = skill;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    } 
    
    public String toString() {
        String pessoas = "\nNome: " + getNome();
        pessoas = pessoas + "\nIdade: " + getIdade();

        return pessoas; 
    }
}   
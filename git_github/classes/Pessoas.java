package git_github.classes;

public class Pessoas {
    private String nome;
    private String sobreNome;
    private double tel;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public double getTel() {
        return tel;
    }
    public void setTel(double tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Sobrenome: %s | Tel: %s", getNome(), getSobreNome(), getTel());
    }
}

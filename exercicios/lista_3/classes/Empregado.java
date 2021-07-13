package classes;


public class Empregado {
    private String nome;
    private String matricula;
    private double salario;

    public Empregado(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
    return nome;
    }

    public void setNome(String nome) {
    this.nome = nome;
    }

    public String getMatricula() {
    return matricula;
    }

    public void setMatricula(String matricula) {
    this.matricula = matricula;
    }

    public double getSalario() {
    return salario;
    }

    public void setSalario(double salario) {
    this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
    salario += salario * (percentual / 100);
    }
}
package desafios.funcionarioVendedor.classes;

public class Funcionario {
    private String nome;
    private String matricula;
    private double salario;

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
    
    public double calcularSalario() {
        return salario * 0.89;
    }
}
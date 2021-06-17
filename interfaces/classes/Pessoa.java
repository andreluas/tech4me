package classes;

public class Pessoa implements Cumprimentador {
  private String nome;
  private String cpf;

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  
  @Override
  public String cumprimentar() {
    return "Olá, estranho.";
  }
}
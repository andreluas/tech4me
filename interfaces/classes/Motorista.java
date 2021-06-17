package classes;

public class Motorista extends Pessoa {
  private String matricula;
  private Carro veiculoAtual;

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public Carro getVeiculoAtual() {
    return veiculoAtual;
  }

  public void setVeiculoAtual(Carro veiculoAtual) {
    this.veiculoAtual = veiculoAtual;
  }

  public void acelerar(int limite) {
    veiculoAtual.acelerar(limite);
  }
}

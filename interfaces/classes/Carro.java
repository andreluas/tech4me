package classes;

public class Carro {
  private String placa;
  private int chassi;
  private int velocidadeAtual;

  public Carro() {
    velocidadeAtual = 0;
  }

  public Carro(String placa) {
    setPlaca(placa);
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public int getChassi() {
    return chassi;
  }

  public void setChassi(int chassi) {
    this.chassi = chassi;
  }

  public int getVelocidadeAtual() {
    return velocidadeAtual;
  }

  public void acelerar(int limite) {
    while (velocidadeAtual < limite) {
      velocidadeAtual = velocidadeAtual + 1;
    }
  }
}
package classes;

public class Transformer implements Cumprimentador {
  private String tipo;

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public String cumprimentar() {
    return "Oi, humano estúpido e inferior.";
  }
}

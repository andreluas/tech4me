package classes;

public class Cao implements Cumprimentador {
  private String raca;

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  @Override
  public String cumprimentar() {
    return "Au au! (Balança o rabo e corre pra lá e pra cá)";
  }
}

package desafios.empresaContabilidade.classes;

public class ServicoOperacional extends Servico{
    private final double VALOR_HORA = 50;
    private int qtdHorasTrabalhadas;

    @Override
    public double valorTotal() {
      return VALOR_HORA * qtdHorasTrabalhadas;
    }
    public int getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }
    public void setQtdHorasTrabalhadas(int qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }
}

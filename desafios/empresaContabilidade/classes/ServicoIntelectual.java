package desafios.empresaContabilidade.classes;

public class ServicoIntelectual extends Servico {
    private final double VALOR = 50.25;

    @Override
    public double valorTotal() {
        return VALOR;
    }
}

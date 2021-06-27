package desafios.empresaContabilidade.classes;

public class PessoaJuridica extends Contribuinte{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularIRRF() {
        return 0;
    }

    @Override
    public String toString() {
        String saida = super.toString();
        return getCnpj() + " | " + saida;
  }
}

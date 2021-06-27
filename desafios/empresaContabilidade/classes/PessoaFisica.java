package desafios.empresaContabilidade.classes;

public class PessoaFisica extends Contribuinte{
    private String cpf;

    @Override
    public double calcularIRRF() {
        return 100;
    }

    @Override
    public String toString() {
        String saida = super.toString();
        return saida + " | " + getCpf();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

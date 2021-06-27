package desafios.empresaContabilidade.classes;

public abstract class Servico {
    private String descricao;
    private String numDoCliente;

    public abstract double valorTotal();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumDoCliente() {
        return numDoCliente;
    }

    public void setNumDoCliente(String numDoCliente) {
        this.numDoCliente = numDoCliente;
    }
}

package avf.classes;

public class Produto {
    private int codigo;
    private String nome;
    private double valor;
    private int qtdEstoque;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }    

    @Override
    public String toString() {
        return String.format("\nCódigo: %d\nNome: %s\nValor: R$ %.2f\nEstoque: %d\n--------------------", getCodigo(), getNome(), getValor(), getQtdEstoque());
    }
}
package avf.classes;

import java.time.LocalDate;

public class Venda  {
    private LocalDate data;
    private Produto produto;
    private int qtdVendida;

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate localDate) {
        this.data = localDate;
    }
    public int getQtdVenda() {
        return qtdVendida;
    }
    public void setQtdVenda(int qtdVenda) {
        this.qtdVendida = qtdVenda;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void valorVenda() {
        double valorTotal = qtdVendida * produto.getValor();
        System.out.printf("Valor total: R$ %.2f", valorTotal);
    }

    @Override
    public String toString() {
        String relVendas = "";

        relVendas = relVendas + "Data: " + getData();
        relVendas = relVendas + "\nProduto: " + produto.getNome();
        relVendas = relVendas + "\nQuantidade: " + getQtdVenda() + " unidade(s)";
        relVendas = relVendas + "\nValor unitário: R$ " + produto.getValor();
        System.out.println("-------------------------------\n");

        return relVendas;
    }
}

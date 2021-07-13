package avf.classes;

import java.time.LocalDate;

public class Venda  {
    private LocalDate data;
    private Produto produto;
    private int qtdVendida;
    private double valorTotal;

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
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        double valorVenda = qtdVendida * produto.getValor();
        System.out.printf("Valor total: R$ %.2f", valorVenda);
        this.valorTotal = valorVenda;
    }

    @Override
    public String toString() {
        String relVendas = "";

        relVendas = relVendas + "Data: " + getData();
        relVendas = relVendas + "\nProduto: " + produto.getNome();
        relVendas = relVendas + "\nQuantidade: " + getQtdVenda() + " unidade(s)";
        relVendas = relVendas + "\nValor unitário: R$ " + produto.getValor();
        relVendas = relVendas + "\nValor total: R$ " + getValorTotal();
        System.out.println("-------------------------------\n");

        return relVendas;
    }
}

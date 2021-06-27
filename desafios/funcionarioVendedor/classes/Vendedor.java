package desafios.funcionarioVendedor.classes;

public class Vendedor extends Funcionario{
    private double valorVendidoPeriodo;

    public double getValorVendidoPeriodo() {
        return valorVendidoPeriodo;
    }

    public void setValorVendidoPeriodo(double valorVendidoPeriodo) {
        this.valorVendidoPeriodo = valorVendidoPeriodo;
    }

    @Override
    public double calcularSalario() {
        double salarioFinal = super.calcularSalario();
        double comissao = getValorVendidoPeriodo() * 0.05;
        return comissao + salarioFinal;
    }
}

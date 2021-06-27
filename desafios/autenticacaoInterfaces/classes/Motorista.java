package desafios.autenticacaoInterfaces.classes;

public class Motorista extends Pessoa implements Autenticavel {
    private String matricula;
    private Carro veiculoAtual;

    public Motorista(){
    }

    public Motorista(String matricula){
        setMatricula(matricula);
    }

    public Motorista(int i) {
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Carro getVeiculoAtual() {
        return veiculoAtual;
    }
    public void setVeiculoAtual(Carro veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }    

    public void acelerar(int limite) {
        veiculoAtual.acelerar(limite);
    }

    @Override
    public String obterCredenciais() {
        return getMatricula();
    }
}

package desafios.autenticacaoInterfaces.classes;

public class Carro implements Autenticavel {
    private String placa;
    private int chassi;
    private int velocidadeAtual;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getChassi() {
        return chassi;
    }
    public void setChassi(int chassi) {
        this.chassi = chassi;
    }
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }  

    public Carro(){
        velocidadeAtual = 0;
    }

    public Carro(String string) {
    }
    public void acelerar(int limite) {
        while (velocidadeAtual < limite){
            velocidadeAtual = velocidadeAtual + 1;
        }
    }
    @Override
    public String obterCredenciais() {
        return getPlaca();
    }
}

package classes;

import java.util.InputMismatchException;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf == null){
            throw new NullPointerException("O valor do CPF não pode ser nulo!");
        }

        if(cpf != null && cpf.length() == 14 && cpf.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")){
            this.cpf = cpf;
        } else {
            throw new InputMismatchException("CPF deve conter 11 dígitos! Favor utilizar pontos e traço.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 18){
            throw new InputMismatchException("Piloto precisa ser maior de idade.");
        } else {
            this.idade = idade; 
        }
    }  
}
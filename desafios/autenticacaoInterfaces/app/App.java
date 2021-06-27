package desafios.autenticacaoInterfaces.app;

import desafios.autenticacaoInterfaces.classes.*;
import desafios.autenticacaoInterfaces.services.*;

public class App {
    public static void main(String[] args) {
        Autenticavel objetos[] = {
            new Motorista("11111111111"),
            new Carro("ABC1234"),
            new Carro("XYZ1234"),
            new Motorista("33333333333")
        };

        Autenticador autenticador = new Autenticador();

        for (Autenticavel obj : objetos) {
            boolean autenticado = autenticador.autenticar(obj);

            if(autenticado){
                System.out.println("Objeto de credencial " + obj.obterCredenciais() + " AUTORIZADO!");
            } else {
                System.out.println("Objeto de credencial " + obj.obterCredenciais() + " NÃO AUTORIZADO");
            }
        }
    }
}

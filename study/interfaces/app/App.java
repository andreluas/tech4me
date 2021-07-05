package app;

import classes.*;
import services.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("1 - Login");
            System.out.println("2 - Cadastrar");
            System.out.print("Opcao: ");
            opcao = sc.nextInt();

            if(opcao == 1){
                Autenticador autenticador = new Autenticador();
                for(Autenticavel user : users){
                    boolean autenticado = autenticador.autenticar(user);

                    if(autenticado){
                        System.out.println("Login efetuado.");
                    } else {
                        System.out.println("Login não existente.");
                    }
                }
            }

            if(opcao == 2){
               User user = new User();
               sc.nextLine();
               System.out.print("Insira seu nome: ");
               user.setNome(sc.nextLine());
               System.out.print("Insira sua idade: ");
               user.setIdade(sc.nextInt());
               System.out.print("Login: ");
               user.setLogin(sc.nextLine());
               sc.nextLine();
               System.out.print("Senha: ");
               user.setPassword(sc.nextLine());
               user.setId(user.getId() + 1);

               users.add(user);
            }
        } while(opcao != 0);


        sc.close();
    }
}

package listCollections.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import listCollections.classes.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        HashSet<Pessoa> frontEnd = new HashSet<Pessoa>();
        HashSet<Pessoa> backEnd = new HashSet<Pessoa>();
        int opcao = 0;

        do { 
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Listar skills");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");

            System.out.print("\nInsira a opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 1){
                Pessoa pess = new Pessoa();

                System.out.print("Nome: ");
                pess.setNome(sc.nextLine());
                System.out.print("Idade: ");
                pess.setIdade(sc.nextInt());
                sc.nextLine();

                pessoas.add(pess);

                System.out.println("1 - Frontend | 2 - Backend | 3 - Fullstack");
                pess.setSkill(sc.nextInt());
                
                if(pess.getSkill() == 1){
                    frontEnd.add(pess);
                } else if(pess.getSkill() == 2){
                    backEnd.add(pess);
                } else {
                    frontEnd.add(pess);
                    backEnd.add(pess);
                }
            }

            if(opcao == 2){
                if(pessoas.isEmpty()){
                    System.out.println("Não existe cadastros.");
                }

                for(int i=0; i < pessoas.size(); i++){
                    System.out.println("============");
                    System.out.println("Cadastro nº: " + i);
                    System.out.println(pessoas.get(i).getNome());
                    System.out.println(pessoas.get(i).getIdade() + " anos");
                    System.out.println("============\n");
                }
            }

            if(opcao == 3){
                for(int i=0; i < pessoas.size(); i++){
                    pessoas.get(i).getSkill();

                    if(pessoas.get(i).getSkill() == 3){
                        HashSet<Pessoa> fullstack = new HashSet<Pessoa>(frontEnd);
                        fullstack.retainAll(backEnd);

                        System.out.println("FULLSTACK: ");

                        for(Pessoa full : fullstack){
                            System.out.println(full.getNome());
                            System.out.println("==========\n");
                        }
                    } 
                }

                System.out.println("FRONT-END: ");
                for(Pessoa f : frontEnd){
                    System.out.println(f.getNome());
                }

                System.out.println("============\n");

                System.out.println("BACK-END: ");
                for(Pessoa b : backEnd){
                    System.out.println(b.getNome());
                }            
                
                System.out.println("============\n");
            }

            if(opcao == 4){
                System.out.println("Qual numero de cadastro deseja remover: ");
                int remover = sc.nextInt();
                pessoas.remove(remover);

                System.out.println("\nCadastro removido!\n");
            }
        } while (opcao != 0);

        sc.close();
    }
}

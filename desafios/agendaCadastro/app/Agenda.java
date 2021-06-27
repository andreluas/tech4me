package desafios.agendaCadastro.app;

import java.io.IOException;
import java.util.Scanner;
import desafios.agendaCadastro.classes.Pessoas;

public class Agenda {
    public static void main(String[] args) throws InterruptedException, IOException {
        final int MAX_ELEMENTOS = 5;
        int opcao, qtdCadastrados = 0;
        int um = 1;
        Pessoas pessoas[] = new Pessoas[MAX_ELEMENTOS];
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Incluir pessoa");
            System.out.println("2 - Listar todos os cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = in.nextInt();
            in.nextLine(); // Tira o ENTER que ficou na entrada na instrução anterior

            if (opcao == 1) {
                // Se não tem mais espaço no vetor, caio fora
                if (qtdCadastrados == MAX_ELEMENTOS) {
                    System.out.println("\nNão há espaço para novos cadastros.");
                    voltarMenu(in);
                    continue;
                }

                // Cadastros aqui
                Pessoas pessoa = new Pessoas();

                System.out.print("Nome: ");
                pessoa.setNome(in.nextLine());
                System.out.print("Sobrenome: ");
                pessoa.setSobreNome(in.nextLine());
                System.out.print("Telefone: ");
                pessoa.setTel(in.nextDouble());

                pessoas[qtdCadastrados] = pessoa;
                qtdCadastrados = qtdCadastrados + um;

                System.out.println("\n Cadastrado realizado.");
                voltarMenu(in);
            } else if (opcao == 2) {
                // Se não tem ninguém cadastrado no vetor, caio fora
                if (qtdCadastrados == 0) {
                    System.out.println("\nNão há cadastrados para exibir.");
                    voltarMenu(in);
                    continue;
                }

                // Exiba os cadsatros aqui
                for(Pessoas pessoa : pessoas){
                    if(pessoa != null){
                        System.out.printf("\nNome: %s\n", pessoa.getNome());
                        System.out.printf("Sobrenome: %s\n", pessoa.getSobreNome());
                        System.out.printf("Telefone: %s\n", pessoa.getTel());
                        System.out.println("===========================");
                    }
                }
                voltarMenu(in);
            } 

            else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");

        in.close();
    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        System.out.flush();
    }
}
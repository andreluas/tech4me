package git_github.app;

import java.util.Scanner;
import git_github.classes.Pessoas;

public class Programa {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcao, contPessoa;

    do {
      System.out.println("\nEscolha uma opção:");
      System.out.println("1 - Incluir pessoa");
      System.out.println("2 - Listar todos os cadastrados");
      System.out.println("0 - Sair");
      System.out.print("Opção: ");

      opcao = sc.nextInt();
      sc.nextLine(); // Limpa o ENTER que fica na entrada
      
      Pessoas pessoas[] = new Pessoas[2];
      int contador = 0;
      contPessoa = contador;

      switch (opcao) {
        case 0:
          System.out.println("Fim do programa!");
          break;
        case 1:
            Pessoas pessoa = new Pessoas();

            System.out.print("Nome: ");
            pessoa.setNome(sc.nextLine());
            System.out.print("Sobrenome: ");
            pessoa.setSobreNome(sc.nextLine());
            System.out.print("Telefone: ");
            pessoa.setTel(sc.nextDouble());

            pessoas[contPessoa] = pessoa;
            contador = contador + 1;            
          break;
        case 2:
          for(int x=0; x<pessoas.length; x++){
            System.out.println(pessoas[x]);
          }
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 0);

    sc.close();
  }
}
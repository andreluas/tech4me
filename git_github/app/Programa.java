package git_github.app;

import java.util.Scanner;
import git_github.classes.Pessoas;

public class Programa {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcao;

    do {
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Incluir pessoa");
      System.out.println("2 - Listar todos os cadastrados");
      System.out.println("0 - Sair");
      System.out.print("Opção: ");

      opcao = sc.nextInt();
      sc.nextLine(); // Limpa o ENTER que fica na entrada
      
      Pessoas pessoas = new Pessoas();
      Pessoas pessoa[] = new Pessoas[10];

      switch (opcao) {
        case 0:
          System.out.println("Fim do programa!");
          break;
        case 1:
          pessoa[0] = new Pessoas();
          System.out.print("Nome: ");
          pessoas.setNome(sc.nextLine());
          System.out.print("Sobrenome: ");
          pessoas.setSobreNome(sc.nextLine());
          System.out.print("Telefone: ");
          pessoas.setTel(sc.nextDouble());
          break;
        case 2:
          System.out.println(pessoas);
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 0);

    sc.close();
  }
}
package exercicios.lista_2.app;

/**
 * Faça um programa para criar N (fornecido pelo usuário) objetos do tipo
Funcionário (matrícula, nome e salário) e solicitar ao usuário que entre com
dados para os N funcionários criados. Ao final imprima os valores fornecidos
para estes funcionários, juntamente com a média salarial.
 */

import java.util.Scanner;
import exercicios.lista_2.classes.*;

public class Programa01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantidade de Funcionários cadastrados: ");
        int numeroCadastros = sc.nextInt();

        Funcionario01 funcionarios[] = new Funcionario01[numeroCadastros];

        for(int i=0; i<numeroCadastros; i++){
            sc.nextLine();
            Funcionario01 funcionario = new Funcionario01();

            int seq = i + 1;

            System.out.print("Nome do Funcionário " + seq + ": ");
            funcionario.setNome(sc.next());
            System.out.print("Matricula " + seq + ": ");
            funcionario.setMatricula(sc.next());
            System.out.print("Salário " + seq + ": ");
            funcionario.setSalario(sc.nextDouble());

            funcionarios[i] = funcionario; 
        }

        for(Funcionario01 funcionario:funcionarios) {
            System.out.println("========Funcionario========");
            System.out.printf("Nome: %s\n", funcionario.getNome());
            System.out.printf("Matricula: %s\n", funcionario.getMatricula());
            System.out.printf("Salário: %.2f\n", funcionario.getSalario());
            System.out.println("===========================");
        }

        sc.close();
    }
}

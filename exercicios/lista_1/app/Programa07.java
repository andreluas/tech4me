package exercicios.lista_1.app;

/**
 * Faça um programa que leia N nomes de alunos e suas médias finais –
sendo N informado pelo usuário – e que, ao final, forneça o percentual de
alunos aprovados (média >= 6) e também os nomes e médias desses
alunos.
 */

import java.util.Scanner;
import exercicios.lista_1.classes.Aluno;

public class Programa07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de alunos cadastrados: ");
        int numAlunos = sc.nextInt();

        Aluno alunos[] = new Aluno[numAlunos];
        int aprovados = 0;

        for(int i=0; i<numAlunos; i++) {
            sc.nextLine();
            Aluno aluno = new Aluno();

            System.out.print("Nome: ");
            aluno.setNome(sc.nextLine());

            System.out.print("Média: ");
            aluno.setMedia(sc.nextDouble());

            alunos[i] = aluno;

            if(aluno.getMedia() >= 6) {
                aprovados = aprovados + 1;
            }
        }

        sc.close();
        
        double percAprovados = (aprovados*100.0)/numAlunos;
        System.out.println("O percentual de alunos aprovados é: " + percAprovados + "%");

        for(Aluno aluno:alunos) {
            System.out.printf("Nome: %s\n", aluno.getNome());
            System.out.printf("Média %.2f\n", aluno.getMedia());
            System.out.println("===========================");
        }
    }
}

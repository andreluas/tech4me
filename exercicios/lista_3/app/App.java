package app;

import java.util.Scanner;

import classes.*;

public class App {
    public static void main(String[] args) {
        final int QUANTIDADE = 5;
        Pilha empregados = new Pilha(QUANTIDADE);
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < QUANTIDADE; i++) {
            System.out.println();

            System.out.print("Matricula: ");
            Empregado emp = new Empregado(sc.nextLine());

            System.out.print("Nome: ");
            emp.setNome(sc.nextLine());
            System.out.print("Salário: ");
            emp.setSalario(sc.nextDouble());

            empregados.adicionar(emp);
            sc.nextLine();
        }

        sc.close();
        System.out.println("\nDados dos funcionários lidos: ");

        while(empregados.getNumElementos() > 0) {
            Empregado emp = (Empregado) empregados.remover();
            System.out.println(emp);
        }
    }
}

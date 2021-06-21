package exercicios.lista_1.app;

/**
 * Faça um programa que solicite um valor de 1 a 12 correspondendo a
um mês do ano, e imprima o nome do mês por extenso. Trate as entradas
inadequadas.
 */

import java.util.Scanner;

public class Programa10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.print("Digite um número entre 1 e 12: ");
        int numero = sc.nextInt();

        sc.close();

        if(numero < 1 || numero > 12) {
            System.out.println("Você digitou um número inválido.");
            return;
        }

        System.out.println("O mês informado é: " + meses[numero-1]);
    }
}

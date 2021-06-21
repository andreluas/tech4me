package exercicios.lista_1.app;

/**
 * Faça um programa que solicite dois valores e imprima todos
  os pares entre o menor valor e o maior valor. Caso os números
  digitados sejam iguais, enviar mensagem ao usuário e imprimir
  os pares de 1 a 10 como exemplo.
 */

import java.util.Scanner;

public class Programa06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num1 = sc.nextInt();

        System.out.print("Insira outro número: ");
        int num2 = sc.nextInt();

        sc.close();

        int menor, maior;
        if(num1 < num2) {
            menor = num1;
            maior = num2;
        } else if(num1 > num2) {
            menor = num2;
            maior = num1;
        } else {
            System.out.println("Os números digitados são iguais.");
            System.out.println("Serão impressos os números pares entre 1 e 10");
            menor = 1;
            maior = 10;
        }

        if(menor % 2 != 0) {
            menor = menor + 1;
        }

        for(int i=menor; i<=maior; i=i+2) {
            System.out.println(i);
        }
    }
}

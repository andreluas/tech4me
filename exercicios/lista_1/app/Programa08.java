package exercicios.lista_1.app;

/**
 * Crie um programa que apresente o fatorial de um número N informado
pelo usuário.
 */

import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = sc.nextInt();

        sc.close();

        int fatorial = 1;
        while(numero > 1){
            fatorial = fatorial * numero;
            numero = numero - 1;
        }

        System.out.println("O fatorial desse número é " + fatorial);
    }
}

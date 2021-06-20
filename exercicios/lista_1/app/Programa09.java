package app;

/**
 * Faça um programa que receba uma frase qualquer e mostre-a invertida
como no exemplo
 */

import java.util.Scanner;

public class Programa09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        for(int i=frase.length() -1; i>-1; i--) {
            System.out.print(frase.charAt(i));
        }

        sc.close();
    }
}

package app;

import java.util.Scanner;

/*
  Faça um programa para ler um valor inteiro e que imprima o 
  seu antecessor e sucessor
 */

public class Programa01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = sc.nextInt();

    System.out.println("Antecessor do número: " + (numero - 1));
    System.out.println("Sucessor do número: " + (numero + 1));

    sc.close();
  }  
}
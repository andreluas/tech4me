package app;

/**
 * Faça um programa para ler três valores decimais que correspondem aos
lados de um triângulo e, depois, se é um triângulo eqüilátero, isóscele ou
escaleno.
 */

import java.util.Scanner;

public class Programa04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado 1 do Triângulo: ");
        double lado1 = sc.nextDouble();

        System.out.print("Lado 2 do Triângulo: ");
        double lado2 = sc.nextDouble();

        System.out.print("Lado 3 do Triânglo: ");
        double lado3 = sc.nextDouble();

        if(lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo equilátero");
        } else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("Triângulo escaleno");
        } else {
            System.out.println("Triângulo isósceles");
        }
    
        sc.close();
    }
}

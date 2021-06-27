package desafios.funcionarioVendedor.app;

import java.util.Scanner;
import desafios.funcionarioVendedor.classes.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario func;

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Matricula: ");
        String matricula = sc.nextLine();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        System.out.print("Tipo (1 - Admin. | 2 - Vendedor): ");
        int tipo = sc.nextInt();

        if(tipo==2){
            System.out.println("Valor vendido no periodo: ");
            double venda = sc.nextDouble();

            func = new Vendedor();
            ((Vendedor)func).setValorVendidoPeriodo(venda);
        } else {
            func = new Funcionario();
        }

        func.setNome(nome);
        func.setMatricula(matricula);
        func.setSalario(salario);

        System.out.println("O salário final do funcionário é: " + func.calcularSalario());

        sc.close();
    }
}

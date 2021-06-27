package desafios.empresaContabilidade.app;

/*
Uma empresa de contabilidade atende pessoas físicas e jurídicas, prestando serviços 
diversos de assessoria contábil. Esses serviços podem ser de ordem operacional (na qual
algum funcionário é alocado para operar um software qualquer para resolver o problema do
cliente) ou intelectual (na qual há apenas o aconselhamento por parte de um contador sobre
algum problema que o cliente esteja passando.
Os serviços operacionais são cobrados pelo número de horas trabalhadas naquele serviço,
enquanto os intelectuais possuem um valor fixo. Todos os serviços possuem uma descrição e
são atrelados ao documento de identificação do cliente. Além disso, a qualquer momento
pode-se "perguntar" aos serviços quanto foi seu valor total.
Faça um aplicativo orientado a objetos que registre os serviços prestados pelo escritório de
contabilidade.
*/

import java.util.Scanner;
import desafios.empresaContabilidade.classes.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Servico serv;

        System.out.print("Descrição do serviço: ");
        String descricao = sc.nextLine();

        System.out.print("Identificação do cliente: ");
        String idCliente = sc.nextLine();

        System.out.print("Tipo do serviço (1 - Operacional | 2 - Intelectual): ");
        int tipoServico = sc.nextInt();

        if(tipoServico == 1){
            System.out.print("Horas trabalhadas: ");
            int qtdHorasTrabalhadas = sc.nextInt();

            serv = new ServicoOperacional();
            ((ServicoOperacional)serv).setQtdHorasTrabalhadas(qtdHorasTrabalhadas);
        } else {
            serv = new ServicoIntelectual();
        }

        sc.close();

        serv.setDescricao(descricao);
        serv.setNumDoCliente(idCliente);

        System.out.printf("O valor final do serviço é: R$ %.2f\n", serv.valorTotal());
    }
}

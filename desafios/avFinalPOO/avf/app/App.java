package avf.app;

import static java.util.Comparator.comparing;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import avf.classes.Produto;
import avf.classes.Venda;

public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        List<Venda> vendas = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Incluir produto");
            System.out.println("2 - Consultar produto");
            System.out.println("3 - Listagem de produtos");
            System.out.println("4 - Venda por período - detalhado");
            System.out.println("5 - Realizar venda");
            System.out.println("0 - Sair");
            System.out.print("Opção: "); 
            opcao = sc.nextInt();
            voltarMenu(sc);

            if(opcao == 1){ 
                Produto prod = new Produto();

                System.out.print("Código: ");
                prod.setCodigo(sc.nextInt());
                sc.nextLine();
                System.out.print("Nome do produto: ");
                prod.setNome(sc.nextLine());
                System.out.print("Valor do produto: ");
                prod.setValor(sc.nextDouble());
                System.out.print("Quantidade em estoque: ");
                prod.setQtdEstoque(sc.nextInt()); 
                
                produtos.add(prod);

                voltarMenu(sc);
                System.out.println("Produto cadastrado!");
            }

            if(opcao == 2){
                System.out.print("Digite um código para busca: ");
                int searchCode = sc.nextInt();
                List<Produto> findProduto = produtos.stream().filter(produto -> produto.getCodigo() == searchCode).collect(Collectors.toList());

                if(findProduto.isEmpty()){
                    System.out.println("Código inexistente. Por favor insira um código válido.");
                } else {
                    System.out.println(findProduto);
                }

                System.out.print("\n\n0 - Voltar ao menu: ");
                int menu = sc.nextInt();
                if(menu == 0){
                    voltarMenu(sc);
                }
            }

            if(opcao == 3){
              if(produtos.isEmpty()){
                  System.out.println("Nenhum produto cadastrado.");
                }              

                double valorMaximo = produtos.stream()
                    .max(comparing(Produto::getValor))
                    .get()
                    .getValor(); 

                double valorMinimo = produtos.stream()
                    .min(comparing(Produto::getValor))
                    .get()
                    .getValor();

                double somaMedia = produtos.stream().mapToDouble(produto -> produto.getValor()).sum();
                double media = somaMedia / produtos.size();

                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("####################\nLISTAGEM DE PRODUTOS\n####################");
                produtos.forEach(produto -> System.out.println(produto));
                System.out.printf("\nValor máximo: %.2f | Valor mínimo: %.2f | Valor da média: %.2f", valorMaximo, valorMinimo, media);

                System.out.print("\n\n0 - Voltar ao menu: ");
                int menu = sc.nextInt();
                if(menu == 0){
                    voltarMenu(sc);
                }
            }

            if(opcao == 4){
                if(vendas.isEmpty()){
                    System.out.println("Nenhuma venda realizada.");
                } else {
                    System.out.println("###############################\nRELATÓRIO DE VENDAS - DETALHADO\n###############################\n");

                    Map<LocalDate, List<Venda>> relatorioVendas = vendas.stream().collect(Collectors.groupingBy(Venda::getData));
                    relatorioVendas.entrySet().forEach(venda -> System.out.printf("Período de emissão: %s \n%s", venda.getKey().format(df), venda.getValue()));


                    Map<LocalDate, Double> valoresMedios = vendas.stream().collect(Collectors.groupingBy(Venda::getData, Collectors.averagingDouble(Venda::getValorTotal)));
                    valoresMedios.entrySet().forEach(venda -> System.out.printf("\n\nData: %s  \nValor médio no período: %.2f", venda.getKey().format(df), venda.getValue()));
                }

                System.out.print("\n\n0 - Voltar ao menu: ");
                int menu = sc.nextInt();
                if(menu == 0){
                    voltarMenu(sc);
                }
            }

            if(opcao == 5){
                if(produtos.isEmpty()){
                    System.out.println("Nenhum produto cadastrado.");
                } 

                Venda venda = new Venda();
                Produto produto = new Produto();
                
                boolean key = false;
                boolean estoque = true;

                System.out.print("Produto [Cód]: ");
                int codProduto = sc.nextInt();
                
                for(int i=0; !key && i<produtos.size(); i++){    
                    key = codProduto == produtos.get(i).getCodigo();

                    if(produtos.get(i).getQtdEstoque() <= 0){
                        estoque = false;
                    }

                    produto = produtos.get(i);
                } 
                
                if(estoque == false){
                    voltarMenu(sc);
                    System.out.println("Produto está sem estoque!!");
                } 
                    
                else if(key){
                    System.out.printf("Produto: [%s] inserido na venda!!\n", produto.getNome());

                    venda.setProduto(produto);

                    System.out.print("\nQtd: ");
                    venda.setQtdVenda(sc.nextInt());
                    venda.setData(LocalDate.now());
                    venda.setValorTotal(0);
                    System.out.print("\nData da venda: " + LocalDate.now().format(df) + "\n");
                    produto.subtraiEstoque(venda.getQtdVenda());
                    vendas.add(venda);

                    System.out.print("\n\n0 - Voltar ao menu: ");
                    int menu = sc.nextInt();
                    if(menu == 0){
                        voltarMenu(sc);
                    }
                } 
                    
                else{
                    voltarMenu(sc);
                    System.out.println("Produto não cadastrado.");
                }
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void voltarMenu(Scanner sc) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        sc.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        System.out.flush();
    }
}
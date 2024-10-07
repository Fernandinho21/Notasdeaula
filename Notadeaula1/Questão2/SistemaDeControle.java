package Notadeaula1.Questão2;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeControle {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void cadastrarProduto() {
        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Tamanho/Peso do produto: ");
        String tamanhoPeso = scanner.nextLine();
        System.out.print("Cor do produto: ");
        String cor = scanner.nextLine();
        System.out.print("Valor do produto: ");
        double valor = scanner.nextDouble();
        System.out.print("Quantidade no estoque: ");
        int quantidade = scanner.nextInt();

        Produto novoProduto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidade);
        produtos.add(novoProduto);

        System.out.println("Produto cadastrado com sucesso!\n");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.\n");
        } else {
            for (Produto p : produtos) {
                System.out.println(p);
            }
            System.out.println();
        }
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        } while (opcao != 3);
    }

    public static void main(String[] args) {
        SistemaDeControle sistema = new SistemaDeControle();
        sistema.menu();
    }
}

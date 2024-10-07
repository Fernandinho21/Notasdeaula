package Notadeaula3.Questão1;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de funcionário:");
        System.out.println("1. Gerente");
        System.out.println("2. Programador");
        int tipoFuncionario = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Data de nascimento (dd/mm/aaaa): ");
        String nasc = scanner.nextLine();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        String tipo = (tipoFuncionario == 1) ? "Gerente" : "Programador";
        Funcionario funcionario = new Funcionario(nome, nasc, salario, tipo);

        if (tipoFuncionario == 1) {
            System.out.print("Projeto: ");
            String projeto = scanner.next();
            funcionario.setProjeto(projeto);
        } else if (tipoFuncionario == 2) {
            System.out.print("Linguagem: ");
            String linguagem = scanner.next();
            funcionario.setLinguagem(linguagem);
        } else {
            System.out.println("Opção inválida.");
        }

        funcionario.exibirInformacoes();
        scanner.close();
    }
}

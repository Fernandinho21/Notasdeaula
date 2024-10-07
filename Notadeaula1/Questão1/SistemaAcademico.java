package Notadeaula1.Questão1;

import java.util.Scanner;

public class SistemaAcademico {
    public void verificarSituacao() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("Informe a nota 1: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Informe a nota 2: ");
            double nota2 = scanner.nextDouble();
            System.out.print("Informe a nota 3: ");
            double nota3 = scanner.nextDouble();

            Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

            double media = aluno.calcularMedia();

            System.out.println("\nAluno: " + aluno.getNome());
            System.out.println("Média: " + media);

            if (media >= 70) {
                System.out.println("Situação: Aprovado");
            } else if (media < 40) {
                System.out.println("Situação: Reprovado");
            } else {
                System.out.println("Situação: Final");
            }
        }
    }

    public static void main(String[] args) {
        SistemaAcademico sistema = new SistemaAcademico();
        sistema.verificarSituacao();
    }
}

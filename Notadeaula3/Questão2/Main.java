package Notadeaula3.Questão2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um tipo de animal:");
        System.out.println("1. Cachorro");
        System.out.println("2. Gato");
        int tipoAnimal = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Raça: ");
        String raca = scanner.nextLine();

        Animal animal;

        if (tipoAnimal == 1) {
            animal = new Animal(nome, raca) {
                @Override
                public void emitirSom() {
                    System.out.println(getNome() + " está latindo!");
                }
            };
        } else if (tipoAnimal == 2) {
            animal = new Animal(nome, raca) {
                @Override
                public void emitirSom() {
                    System.out.println(getNome() + " está miando!");
                }
            };
        } else {
            System.out.println("Opção inválida.");
            scanner.close();
            return; 
        }

        animal.caminhar();
        animal.emitirSom();
        System.out.println("Você criou um animal: " + animal.getNome() + " da raça " + animal.getRaca());

        scanner.close();
    }
}


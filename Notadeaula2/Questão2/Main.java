package Notadeaula2.Questão2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo do valor da corrida de Uber");
        
        System.out.print("Digite a distância percorrida (em km): ");
        System.out.print("Digite o tempo de espera (em minutos): ");
        int tempoEspera = scanner.nextInt();
        
        System.out.print("Digite a tarifa base (R$): ");
        System.out.print("Digite o fator de demanda: ");
        double fatorDemanda = scanner.nextDouble();

    CorridaUber corrida = new CorridaUber(fatorDemanda, tempoEspera, fatorDemanda, fatorDemanda);
        
        corrida.exibirDetalhesCorrida();

        scanner.close();
        }
    }
      
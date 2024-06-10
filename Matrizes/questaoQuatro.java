package Matrizes;

import java.util.Scanner;

public class questaoQuatro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[][] matrizNotas = new double[10][4];
        double[] medias = new double[10];

        // Lendo as notas dos participantes e armazenando na matriz
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as notas do participante " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                matrizNotas[i][j] = leia.nextDouble();
            }
        }

        // Calculando as médias e armazenando no vetor
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += matrizNotas[i][j];
            }
            medias[i] = soma / 4;
        }

        // Exibindo as médias dos participantes
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Participante %d: %.1f%n", (i + 1), medias[i]);
        }

        leia.close();
    }
}

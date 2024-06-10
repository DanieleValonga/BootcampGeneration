package Vetores;

import java.util.Scanner;

public class questaoDois {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int soma;

        System.out.println("\nElementos nos índices pares: ");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]+" ");
            }
        }

        System.out.println("\nElementos nos índices ímpares: ");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println(vetor[i]+" ");
            }
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetor[i];
        }
        System.out.println("\nSoma: "+soma);

        leia.close();

        float media = soma / vetor.length;
        System.out.println("\nMédia: "+media);
    }
}


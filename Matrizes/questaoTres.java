package Matrizes;

import java.util.Scanner;

public class questaoTres {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int matrizIntei[][] = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("\nDigite um valor para a posição "+"["+i+"]"+"["+j+"]:");
                matrizIntei[i][j] = leia.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.println("\nO valor armazenado na diagonal primária é: ["+i+"]["+j+"] é: "+matrizIntei[i][j]);
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i + j) == (matrizIntei.length - 1)) {
                    System.out.println("\nO valor armazenado na diagonal secundaria é: ["+i+"]["+j+"] é: "+matrizIntei[i][j]);
                }
            }
        }

        for (int i = 0; i < matrizIntei.length; i++)
            for (int j = 0; j < matrizIntei.length; j++) {
                if (i == j) {
                    soma += matrizIntei[i][j];
                }
            }
        System.out.println("\nA soma dos valores na diagonal primaria é: "+soma);

        soma = 0;

        for (int i = 0; i < matrizIntei.length; i++) {
            for (int j = 0; j < matrizIntei.length; j++) {
                if ((i + j) == (3 - 1)) {
                    soma += matrizIntei[j][j];
                }
            }
        }

        System.out.println("\nA soma dos valores na diagonal secundaria é: "+soma);

        leia.close();
    }


}


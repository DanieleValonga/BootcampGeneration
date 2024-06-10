package Vetores;

import java.util.Scanner;

public class questaoUm {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int vetorinteir[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int num, entrada, valor=-1;

        System.out.println("\nDigite um valor que deseja encontrar no vetor ");
        entrada = leia.nextInt();

        leia.close();

        for (num = 0; num < vetorinteir.length; num++) {
            if (entrada == (vetorinteir[num])) {
                valor = num;
                break;
            }
        }

        if (valor != -1) {
            System.out.println("\nO numero "+entrada+"\n se encontra na posição "+valor);
        }else {
            System.out.println("\nO valor não se encontra no vetor");
        }
    }
}
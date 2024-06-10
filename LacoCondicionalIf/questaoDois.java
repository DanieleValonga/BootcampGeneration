package LacoCondicionalIf;

import java.util.Scanner;

public class questaoDois {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("\nDigite um número: ");
        numero = leia.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero +"\n é um número par!");
        }else {
            System.out.println(numero +"\n é um número ímpar!");
        }

        if (numero > 0) {
            System.out.println(numero +"\n é um número positivo!");
        }else if (numero == 0) {
            System.out.println(numero +"\né zero!");
        }else {
            System.out.println(numero +"\n é um número negativo");
        }

        leia.close();
    }
}
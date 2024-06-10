package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class questaoDois {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        int[] valoresIniciais = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        for (int valor : valoresIniciais) {
            numeros.add(valor);
        }

        System.out.println("\nList: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i)+" ");
        }
        System.out.println();

        System.out.println("\nDigite o número que você deseja encontrar: ");
        int numeroProcurado = leia.nextInt();

        int indice = numeros.indexOf(numeroProcurado);
        if (indice != -1) {
            System.out.println("\nO número "+numeroProcurado+"está localizado na posição: "+indice);
        }else {
            System.out.println("\nO número "+numeroProcurado+"não foi encontrado!");
        }

        leia.close();
    }
}

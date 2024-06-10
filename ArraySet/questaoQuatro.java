package ArraySet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class questaoQuatro {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<Integer>();
        Scanner leia = new Scanner(System.in);

        num.add(2);
        num.add(5);
        num.add(1);
        num.add(3);
        num.add(4);
        num.add(9);
        num.add(7);
        num.add(8);
        num.add(10);
        num.add(6);

        for (int X : num) {
            System.out.println("\nDigite o número que você deseja encontrar: ");
            int valor = leia.nextInt();
            if (num.contains(valor)) {
                System.out.println("\nO número "+valor+" Foi encontrado!");
            }else {
                System.out.println("\nO número "+valor+" não foi encontrado!");
                break;
            }
        }

        leia.close();
    }
}
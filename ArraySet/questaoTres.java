package ArraySet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class questaoTres {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        System.out.println("\nDigite 10 valores inteiros não repetidos: ");
        while (numeros.size() < 10) {
            System.out.println("\nValor"+ (numeros.size()+ 1)+": ");
            int valor = leia.nextInt();
            if (numeros.contains(valor)) {
                System.out.println("\nValor já inserido. Digite um valor diferente: ");
            }else {
                numeros.add(valor);
            }
        }

        System.out.println("\nListar dados do Set: ");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        leia.close();
    }
}

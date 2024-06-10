package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class questaoUm {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<String>();

        System.out.println("\nDigite 5 cores: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nCor"+(i+1)+": ");
            String cor = leia.nextLine();
            cores.add(cor);
        }

        System.out.println("\nListar todas as cores: ");
        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("\nOrdenar as cores: ");
        for (String cor : cores) {
            System.out.println(cor);
        }

        leia.close();
    }
}
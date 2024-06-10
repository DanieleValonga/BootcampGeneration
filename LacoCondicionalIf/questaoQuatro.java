package LacoCondicionalIf;

import java.util.Scanner;

public class questaoQuatro {
    public static void main(String[] args) {

        String palavra1,palavra2,palavra3;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nEntre com a primeira palavra: ");
        palavra1 = leia.next();

        System.out.println("\nEntre com a segunda palavra: ");
        palavra2 = leia.next();

        System.out.println("\nEntre com a terceira palavra: ");
        palavra3 = leia.next();

        if(palavra1.equalsIgnoreCase("vertebrado")) {
            if(palavra2.equalsIgnoreCase("ave")) {
                if(palavra3.equalsIgnoreCase("carnívoro")) {
                    System.out.println("\nÉ uma águia...");
                }else {
                    System.out.println("\nÉ uma pomba...");
                }
            }else {
                if(palavra3.equalsIgnoreCase("onívoro")) {
                    System.out.println("\nÉ um ser humano...");
                }else {
                    System.out.println("\nÉ uma vaca...");
                }
            }
        }else {
            if(palavra2.equalsIgnoreCase("inseto")) {
                if(palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("\nÉ uma pulga...");
                }else {
                    System.out.println("\nÉ uma lagarta...");
                }
            }else {
                if(palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("\nÉ uma sanguessuga...");
                }else {
                    System.out.println("\nÉ uma minhoca...");
                }
            }
            leia.close();
        }
    }
}

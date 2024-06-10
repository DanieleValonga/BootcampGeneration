package LacoCondicionalIf;

import java.util.Scanner;

public class questaoTres {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;
        boolean primeiraDoacao,aptoParaDoar;

        System.out.println("\nDigite o Nome do doador: ");
        nome = leia.nextLine();
        System.out.println("\nDigite a Idade do doador: ");
        idade = leia.nextInt();
        System.out.println("\nPrimeira doação de sangue? (true/false): ");
        primeiraDoacao = leia.nextBoolean();

        aptoParaDoar = (idade>=18 && idade <= 69) && !(idade >=60 && idade <= 69 && primeiraDoacao);

        if (aptoParaDoar) {
            System.out.println(nome+"\nestá apto para doar sangue!");
        }else {
            System.out.println(nome+"\nnão está apto para doar sangue!");
        }

        leia.close();
    }
}

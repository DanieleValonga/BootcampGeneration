package LacoCondicionalSwitch;

import java.util.Scanner;

public class questaoCinco {
    public static void main(String[] args) {

        int codigoProduto;
        int quantidade;
        String nomeProduto = "";
        float preco = 0.0f;
        float valorTotal;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nCódigo do Produto: ");
        codigoProduto = leia.nextInt();

        System.out.println("\nQuantidade ");
        quantidade = leia.nextInt();

        switch (codigoProduto) {
            case 1:
                nomeProduto = "Cachorro Quente";
                preco = 10.00f;
                break;
            case 2:
                nomeProduto = "X-Salada";
                preco = 15.00f;
                break;
            case 3:
                nomeProduto = "X-Bacon";
                preco = 18.00f;
                break;
            case 4:
                nomeProduto = "Bauru";
                preco = 12.00f;
                break;
            case 5:
                nomeProduto = "Refrigerante";
                preco = 8.00f;
                break;
            case 6:
                nomeProduto = "Suco de Laranja";
                preco = 13.00f;
                break;
            default:
                System.out.println("\nCódigo do produto inválido!");
                leia.close();
                return;
        }

        valorTotal = quantidade * preco;

        System.out.println("\nProduto: " + nomeProduto);
        System.out.println("\nValor toal: R$ " + valorTotal);

        leia.close();
    }
}
package Fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class questaoUm {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();
        Scanner leia = new Scanner(System.in);
        int indice;

        do {
            System.out.println("\t_---------MENU-------_");
            System.out.println("\t1 - Para adicionar clientes na Fila "+"\n\t2 - Listar todos os Clientes \n\t3 - Retirar clientes da lista "+"\n\t0 - Sair ");
            indice = leia.nextInt();
            leia.nextLine();

            switch (indice) {
                case 1:
                    System.out.println("\nInsira o nome do Cliente que gostaria de adicionar: ");
                    String cliente = leia.nextLine();
                    fila.add(cliente);
                    System.out.println("\nCliente Adicionado!");
                    break;
                case 2:
                    System.out.println("\nLista de Clientes na Fila: "+fila);
                    break;
                case 3:
                    System.out.println("\nDigite o nome do cliente que deseja retirar: ");
                    cliente = leia.nextLine();
                    fila.remove(cliente);
                    System.out.println(fila);
                    System.out.println("\nO cliente foi chamado!");
                    break;
                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;
                default:
                    System.out.println("\nComando Inválido!");
            }
        }while (indice != 0);

        leia.close();
    }
}
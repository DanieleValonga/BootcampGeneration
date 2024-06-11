package Pilha;

import java.util.Scanner;
import java.util.Stack;

public class questaoDois {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<String>();
        Scanner leia = new Scanner(System.in);

        int indice;

        do {
            System.out.println("\t_-----------MENU-----------_");
            System.out.println("\t1 - Para adicionar livro na pilha "+"\n\t2 - Listar todos os Livros \n\t3 - Retirar Livros da pilha"+"\n\t0 - Sair");
            indice = leia.nextInt();
            leia.nextLine();

            switch (indice) {
                case 1:
                    System.out.println("\nInsira o nome do livro que gostaria de adicionar: ");
                    String Livro = leia.nextLine();
                    pilha.push(Livro);
                    System.out.println("\nLivro Adicionado!");
                    break;
                case 2:
                    System.out.println("\nLista de Livros na pilha: "+pilha);
                    break;
                case 3:
                    System.out.println("\nDigite o nome do livro que deseja deletar: ");
                    Livro = leia.nextLine();
                    pilha.remove(Livro);
                    System.out.println("Um livro foi retirado da pilha! Pilha atual: "+pilha);
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

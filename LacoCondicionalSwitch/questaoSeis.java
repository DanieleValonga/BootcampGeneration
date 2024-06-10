// O exercício não está rodando totalmente, mas decidi que vou entregar pela tentativa
// E continuarei trabalhando nele, e caso não consiga resolver, contatarei instrutores

package LacoCondicionalSwitch;

import java.util.Scanner;

public class questaoSeis {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        int numCargo;
        float salario, novoSalario;

        System.out.println("\nDigite seu nome: ");
        nome = leia.next();
        System.out.println("\nDigite seu salário: ");
        salario = leia.nextFloat();
        System.out.println("\nDigite o codigo do seu cargo: \n 1 gerente"+"+\n 2 Vendedor \n 3 Supervisor \n 4 Motorista \n 5 Estoquista \n 6 Tecnico de TI");
        numCargo = leia.nextInt();

        switch (numCargo) {
            case 1:
                novoSalario = salario + (salario * 10/100);
                System.out.println("\nSeu nome é: "+nome+"\nGerente \nseu novo salario é: "+novoSalario);
                break;
            case 2:
                novoSalario = salario + (salario * 7/100);
                System.out.println("\nSeu nome é: "+nome+"\nVendedor \nseu novo salario é: "+novoSalario);
                break;
            case 3:
                novoSalario = salario + (salario * 9/100);
                System.out.println("\nSeu nome é: "+nome+"\nSupervisor \nseu novo salario é: "+novoSalario);
                break;
            case 4:
                novoSalario = salario + (salario * 6/100);
                System.out.println("\nSeu nome é: "+nome+"\nMotorista \nseu novo salario é: "+novoSalario);
                break;
            case 5:
                novoSalario = salario + (salario * 5/100);
                System.out.println("\nSeu nome é: "+nome+"\nEstoquista \nseu novo salario é: "+novoSalario);
                break;
            case 6:
                novoSalario = salario + (salario * 8/100);
                System.out.println("\nSeu nome è: "+nome+"\nTécnico de TI \nseu novo salario é: "+novoSalario);
                break;
                default:
                    System.out.println("\nOpção inválida");

            leia.close();
        }
    }
}
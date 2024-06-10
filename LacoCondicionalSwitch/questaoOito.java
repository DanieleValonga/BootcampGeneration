package LacoCondicionalSwitch;

import java.util.Scanner;

public class questaoOito {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float saldo = 1000, novoSaldo, entSai;
        int codOp;

        System.out.println("\nDigite a operação que deseja: \n1 SALDO \n2 SAQUE \n3 DEPOSITO");
        codOp = leia.nextInt();

        switch(codOp) {
            case 1:
                System.out.println("\nSeu saldo é: "+saldo);
                break;
            case 2:
                System.out.println("\nDigite o valor do saque: ");
                entSai = leia.nextFloat();
                novoSaldo = saldo - entSai;
                System.out.println("\nSeu novo saldo é de: "+novoSaldo);
                break;
            case 3:
                System.out.println("\nDigite o valor do deposito: ");
                entSai = leia.nextFloat();
                novoSaldo = saldo + entSai;
                System.out.println("\nSeu novo saldo é de: "+novoSaldo);
        }

        leia.close();
    }
}

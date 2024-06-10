package LacoCondicionalSwitch;

import java.util.Scanner;

public class questaoSete {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float num1, num2, resultado;
        int codigoOperacao;

        System.out.println("\nDigite o primeiro número: ");
        num1 = leia.nextFloat();
        System.out.println("\nDigite o segundo número: ");
        num2 = leia.nextFloat();
        System.out.println("\nOperação: ");
        codigoOperacao = leia.nextInt();

        resultado = 0;
        boolean operacaoValida = true;

        switch (codigoOperacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println(num1 +"\n+"+num2+" = "+resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println(num1 +"\n-"+num2+" = "+resultado);
            case 3:
                resultado = num1 * num2;
                System.out.println(num1 +"\n*"+num2+" = "+resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println(num1 +"\n/"+num2+" = "+resultado);
                }else {
                    System.out.println("\nDivisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("\nOperação Inválida!");
                operacaoValida = false;
                break;
        }

        leia.close();
    }
}

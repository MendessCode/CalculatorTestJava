package Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continuar;

        do { // Feito para o programa não fechar, só quando sinalizarmos para tal
            System.out.println("|Bem vindo ao programa! Vamos realizar o seu cálculo|");
            System.out.println("|Digite o valor um: ");
            valorUm = scanner.nextDouble();
            System.out.println("|################################################################|");

            System.out.println("|Digite a operação( +, -, /, *): |");
            operacao = scanner.next();
            System.out.println("|################################################################|");

            System.out.println("|Digite o valor dois:|");
            valorDois = scanner.nextDouble();
            System.out.println("|################################################################|");

            System.out.println("|Resultado: " + realizarCalculo(valorUm, valorDois, operacao) + "|");
            System.out.println("|################################################################|");

            continuar = verificarNovaOperação();
            if (continuar) {
                System.out.println("|Então vamos nessaaaa!!!!!!!!!!!|");
                System.out.println("_______________________");
                System.out.println("|Here we go again!!!!!|");
                System.out.println("_______________________");
            }  else {
                System.out.println("|Até logo, caro amigo =(|");
                System.out.println("________________________");
            }
        } while (continuar);
    }

    public static boolean verificarNovaOperação() {
        // Método para continuar rodando, ou fechar o programa
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operação? (S ou N)");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }



    public static Double realizarCalculo (Double valorUm, Double valorDois, String operacao) {
        // Metodo para realizar os calculos!
        Double respostaCalculo = 0.0;

        switch (operacao) {
            case "+":
                respostaCalculo = valorUm + valorDois;
                break;
            case "-":
                respostaCalculo = valorUm - valorDois;
                break;
            case "/":
                respostaCalculo = valorUm / valorDois;
                break;
            case "*":
                respostaCalculo = valorUm * valorDois;
                break;

            default:
                System.out.println("Operação é inválida! =(");
        }

        return respostaCalculo;
    }
}

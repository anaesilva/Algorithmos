package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class ValorPeca {

//    Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//    código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int codigoUm, numeroPecasUm, codigoDois, numeroPecasDois;
        double valorUnitarioUm, valorUnitarioDois, total;

        System.out.println("Digite o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1: ");
        codigoUm = sc.nextInt();
        numeroPecasUm = sc.nextInt();
        valorUnitarioUm = sc.nextDouble();

        System.out.println("Digite o código de uma peça 2, o número de peças 2, o valor unitário de cada peça 2: ");
        codigoDois = sc.nextInt();
        numeroPecasDois = sc.nextInt();
        valorUnitarioDois = sc.nextDouble();

        total = ((numeroPecasUm * valorUnitarioUm) + (numeroPecasDois * valorUnitarioDois));

        System.out.printf("Valor a pagar: R$ %.2f%n", total);

        sc.close();

    }
}

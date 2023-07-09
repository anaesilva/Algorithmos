package conditional_structure;

import java.util.Scanner;

//  Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Digite o número: ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Este número é par");
        } else {
            System.out.println("Este número é impar");
        }
    }
}

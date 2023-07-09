package conditional_structure;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//        seguir, calcule e mostre o valor da conta a pagar.

import java.util.Locale;
import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, qde;
        double total;

        System.out.println("Digite o código e a quantidade do item: ");
        codigo = sc.nextInt();
        qde = sc.nextInt();

            if (codigo == 1) {
                total = qde * 4.00;
            } else if (codigo == 2) {
                total = qde * 4.5;
            }
            else if (codigo == 3) {
                total = qde * 5.0;
            }
            else if (codigo == 4) {
                total = qde * 2.0;
            }
            else {
                total = qde * 1.5;
            }

            System.out.printf("Total: R$ %.2f%n", total);

            sc.close();


    }
}

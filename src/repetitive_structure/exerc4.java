package repetitive_structure;

// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso.

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite o numero inteiro: ");
        num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (i % 2 != 0) {
                System.out.println("ímpares de 1 até " + num + " é " + i);
            }
        }



    }
}

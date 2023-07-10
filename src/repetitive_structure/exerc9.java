package repetitive_structure;

//Ler um número inteiro N e calcular todos os seus divisores.

import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero inteiro: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
         if (N % i == 0) {
             System.out.println("divisores de " + N + ": " + i);
         }
        }

    }
}

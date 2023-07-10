package repetitive_structure;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//        exemplo.

import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero inteiro: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
         int x = i * i;
         int y = x * i;
         System.out.println(i + " " + x + " " + y);
        }
    }
}

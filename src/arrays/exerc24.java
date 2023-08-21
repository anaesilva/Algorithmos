package arrays;

import java.util.Scanner;

public class exerc24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[3];

        System.out.println("Insira os elementos");
        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        boolean pol = true;
        for (int i = 0; i < vetA.length; i++) {

            if(vetA[i] != vetA[vetA.length - 1 - i]) {
                pol = false;
                break;
            }
        }

        System.out.print("Elementos do vetor A: ");
        for(int i=0; i<vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        if(pol) {
            System.out.println("Número palídromo");
        } else {
            System.out.println("Não é um número palídromo");
        }

        sc.close();
    }
}

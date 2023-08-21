package arrays;

import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int[] vetC = new int[vetA.length];

        System.out.println("Insira os elementos: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
            vetB[i] = sc.nextInt();
            vetC[i] = vetA[i] + vetB[i];
        }
        System.out.println("Insira os elementos do vetor A: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.println("Insira os elementos do vetor B: ");
        for(int i=0; i<vetB.length; i++) {
            vetB[i] = sc.nextInt();
        }

        System.out.print("Elementos do vetor B: ");
        for(int i=0; i<vetA.length; i++) {
            System.out.print(vetB[i] + " ");
        }
        System.out.println();

        System.out.print("A soma dos elementos do vetor A e vetor B: ");
        for(int i=0; i<vetA.length; i++) {
            System.out.print(vetC[i] + " ");
        }

        sc.close();
    }
}

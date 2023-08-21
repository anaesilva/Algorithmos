package arrays;

import java.util.Scanner;

public class exerc29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[2];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetA.length * 2];

        System.out.println("Insira os elementos do vetor A: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();

            vetC[i] = vetA[i];
        }

        System.out.println("Insira os elementos do vetor B: ");
        for(int i=0; i<vetB.length; i++) {
            vetB[i] = sc.nextInt();

            vetC[vetA.length + i] = vetB[i];
        }

        System.out.print("Elementos do vetor A: ");
        for(int i=0; i<vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.print("Elementos do vetor B: ");
        for(int i=0; i<vetB.length; i++) {
            System.out.print(vetB[i] + " ");
        }
        System.out.println();

        System.out.print("Elementos do vetor C: ");
        for(int i=0; i<vetC.length; i++) {
            System.out.print(vetC[i] + " ");
        }

        sc.close();
    }
}

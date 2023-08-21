package arrays;

import java.util.Scanner;

public class exerc31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[4];
        int[] vetB = new int[vetA.length];

        System.out.println("Insira os elementos do vetor A: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        int positionB = 0;

        for(int i=0; i<vetA.length; i++) {
            if (vetA[i] % 2 == 0) {
                vetB[positionB] = vetA[i];
                positionB++;
            }
        }

        for(int i=0; i<vetA.length; i++) {
            if (vetA[i] % 2 != 0) {
                vetB[positionB] = vetA[i];
                positionB++;
            }
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

        sc.close();
    }
}

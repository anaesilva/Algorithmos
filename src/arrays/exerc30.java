package arrays;

import java.util.Scanner;

public class exerc30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[4];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetA.length];

        System.out.println("Insira os elementos do vetor A: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        int par = 0;
        int impar = 0;

        for(int i=0; i<vetA.length; i++) {
           if (vetA[i] % 2 == 0) {
               vetB[par] = vetA[i];
               par++;
           } else {
               vetC[impar] = vetA[i];
               impar++;
           }
        }

        System.out.print("Elementos do vetor A: ");
        for(int i=0; i<vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.print("Elementos do vetor B: ");
        for(int i=0; i<par; i++) {
            System.out.print(vetB[i] + " ");
        }
        System.out.println();

        System.out.print("Elementos do vetor C: ");
        for(int i=0; i<impar; i++) {
            System.out.print(vetC[i] + " ");
        }

        sc.close();
    }
}

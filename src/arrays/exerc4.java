package arrays;

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[15];
        double[] vetB = new double[vetA.length];


        System.out.println("Insira os elementos: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
            vetB[i] = Math.sqrt(vetA[i]);
        }

        System.out.print("Elementos do vetor A: ");
        for(int i=0; i<vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.print("Elementos do vetor B: ");
        for(int i=0; i<vetA.length; i++) {
            System.out.print(vetB[i] + " ");
        }

        sc.close();
    }
}

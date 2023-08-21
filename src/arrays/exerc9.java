package arrays;

import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        double[] vetorC = new double[vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor do vetorA da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i=0; i<vetorB.length; i++){
            System.out.println("Entre com o valor do vetorB da posição: " + i);
            vetorB[i] = scan.nextInt();
        }

        for (int i=0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] / vetorB[i];
        }

        System.out.print("Elementos do vetor A: ");
        for(int i=0; i<vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Elementos do vetor B: ");
        for(int i=0; i<vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Elementos do vetor C: ");
        for(int i=0; i<vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        scan.close();
    }
}

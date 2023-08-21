package arrays;

import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Entre com os 5 números: ");

        for(int i=0; i<vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();


        sc.close();

    }
}

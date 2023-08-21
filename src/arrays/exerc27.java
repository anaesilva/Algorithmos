package arrays;

import java.util.Scanner;

public class exerc27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[4];
        char[] vetB = new char[vetA.length];


        System.out.println("Insira os elementos: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        for(int i=0; i<vetA.length; i++) {
            if (vetA[i] < 7) {
                vetB[i] = 'a';
            } else if (vetA[i] == 7) {
                vetB[i] = 'b';
            } else if (vetA[i] > 7 && vetA[i] < 10) {
                vetB[i] = 'c';
            } else if (vetA[i] == 10) {
                vetB[i] = 'd';
            } else if (vetA[i] > 10) {
                vetB[i] = 'e';
            }
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

package arrays;

import java.util.Scanner;

public class exerc23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[10];

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Insira o elemento da posição " + i + " ");
            vetA[i] = sc.nextInt();
            if(vetA[i] % 2 != 0) {
                break;
            }
        }

        System.out.print("Elementos do vetor A: ");
        for(int i=0; i<vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

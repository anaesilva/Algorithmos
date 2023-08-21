package arrays;

import java.util.Scanner;

public class exerc32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[2];

        System.out.println("Insira os elementos do vetor A: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.print("Elementos do vetor A: ");
        for(int i=0; i<vetA.length; i++) {
            System.out.println("Tabuada de " + vetA[i]);

            for(int j=1; j<=10; j++) {
                System.out.println(j + " x " + vetA[i] + "= " + (vetA[i] * j));
            }
        System.out.println();
        }


        sc.close();
    }
}

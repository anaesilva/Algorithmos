package arrays;

import java.util.Scanner;

public class exerc36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetA = new double[11];

        for (int i=0; i<vetA.length; i++){

            vetA[i] = Math.pow(2, i);
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();
    }
}
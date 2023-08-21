package arrays;

import java.util.Scanner;

public class exerc35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];

        System.out.println("Insira os elementos do vetor A: ");
        for(int i=0; i<vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        for (int i=0; i<vetorA.length; i++){

            System.out.println("Analizando o número " + vetorA[i]);

            for (int j=1; j<vetorA[i]; j++){
                if (vetorA[i] % j == 0){
                    System.out.println(j + " é divisor");
                }
            }

            System.out.println();
        }
    }
}
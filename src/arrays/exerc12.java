package arrays;

import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[2];


        System.out.println("Insira os elementos: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        int soma = 0;
        for(int i=0; i<vetA.length; i++) {
               soma+=vetA[i];
        }
        System.out.println();

        System.out.print("Vetor A = ");
        for (int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.println("A soma dos elementos: " + soma);



        sc.close();
    }
}

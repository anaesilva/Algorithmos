package arrays;

import java.util.Scanner;

public class exerc14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[3];


        System.out.println("Insira os elementos: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        int qde = 0;
        int impar = 0;
        for(int i=0; i<vetA.length; i++) {
           if(vetA[i] % 2 != 0) {
               qde+=vetA[i];
               impar++;
           }
        }
        System.out.println();

        System.out.print("Vetor A = ");
        for (int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.println("Média aritmetica: " + qde / impar);

        sc.close();
    }
}

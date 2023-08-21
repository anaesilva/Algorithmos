package arrays;

import java.util.Scanner;

public class exerc13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[3];


        System.out.println("Insira os elementos: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        int qde = 0;
        for(int i=0; i<vetA.length; i++) {
           if(vetA[i] % 5 == 0) {
               qde+=vetA[i];
           }
        }
        System.out.println();

        System.out.print("Vetor A = ");
        for (int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.println("Qtd números multiplos de 5: " + qde);



        sc.close();
    }
}

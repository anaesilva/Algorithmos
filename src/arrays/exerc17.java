package arrays;

import java.util.Scanner;

public class exerc17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[4];

        System.out.println("Insira os elementos: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        int qdePessoas = 0;

        for(int i=0; i<vetA.length; i++) {
           if(vetA[i] > 35) {
               qdePessoas++;
           }
        }
        System.out.println();

        System.out.print("Vetor A = ");
        for (int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.println("Menor idade: " + qdePessoas);
        System.out.println("Maior idade: " + qdePessoas);

        sc.close();
    }
}

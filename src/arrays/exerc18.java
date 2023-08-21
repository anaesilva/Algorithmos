package arrays;

import java.util.Scanner;

public class exerc18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[4];

        System.out.println("Insira os elementos: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        int indexMaior = 0;
        int idadeMaior = vetA[0];

        int indexMenor = 0;
        int idadeMenor = vetA[0];

        for(int i=0; i<vetA.length; i++) {
           if(vetA[i] > idadeMaior) {
            idadeMaior = vetA[i];
               indexMaior = i;
           } else if(vetA[i] < idadeMenor) {
               idadeMenor = vetA[i];
               indexMenor = i;
           }
        }
        System.out.println();

        System.out.print("Vetor A = ");
        for (int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.println("Menor idade: " + idadeMenor + ", na posição: " + indexMenor);
        System.out.println("Maior idade: " + idadeMaior + ", na posição: " + indexMaior);


        sc.close();
    }
}

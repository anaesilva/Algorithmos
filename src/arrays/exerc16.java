package arrays;

import java.util.Scanner;

public class exerc16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[4];

        System.out.println("Insira os elementos: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        int soma = 0;
        int qde = 0;
        int media = 0;
        int contMed = 0;
        for(int i=0; i<vetA.length; i++) {
           if(vetA[i] < 15) {
               soma+=vetA[i];
           } else if(vetA[i] == 15) {
               qde++;
           } else if(vetA[i] > 15) {
               contMed++;
               media+=vetA[i];
           }
        }
        System.out.println();

        System.out.print("Vetor A = ");
        for (int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.println("Soma de elementos armazedos no vetor que são inferiores a 15: " + soma);
        System.out.println("Qde de elementos armazedos no vetor que são iguais a 15: " + qde);
        System.out.println("Media de elementos armazedos no vetor que são superiores a 15: " + media / contMed);



        sc.close();
    }
}

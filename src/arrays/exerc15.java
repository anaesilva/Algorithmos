package arrays;

import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[10];

        System.out.println("Insira os elementos: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        int impar = 0;
        int par = 0;
        for(int i=0; i<vetA.length; i++) {
           if(vetA[i] % 2 != 0) {
               impar++;
           } else {
               par++;
           }
        }
        System.out.println();

        System.out.print("Vetor A = ");
        for (int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.println("O percentual de numeros pares é: " +  (double) (par * 100)/vetA.length + "%");
        System.out.println("O percentual de numeros impares é: " + (double) (impar * 100)/vetA.length + "%");


        sc.close();
    }
}

package arrays;

import java.util.Scanner;

public class exerc22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[10];

        int qtd0 = 0;
        int qtd1 = 0;

        for (int i=0; i<vetA.length; i++) {
            vetA[i] = (int) Math.round(Math.random() * 1);

            if (vetA[i] == 0) {
                qtd0++;
            } else if(vetA[i] == 1) {
                qtd1++;
            }
        }

        double porc0 = (qtd0 * 100) / vetA.length;
        double porc1 = (qtd1 * 100) / vetA.length;

        System.out.print("Vetor A = ");
        for (int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.println("Porc 0 = " + porc0);
        System.out.println("Porc 1 = " + porc1);


        sc.close();
    }
}

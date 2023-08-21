package arrays;

import java.util.Scanner;

public class exerc20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vetA = new double[2];

        System.out.println("Insira os elementos: ");
        for(int i=0; i<vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        double cotacao = 4.80;

        System.out.print("Cotações = ");
        for (int i=0; i<vetA.length; i++){
            vetA[i]*=cotacao;
            System.out.print(vetA[i] + " ");
        }
        System.out.println();


        sc.close();
    }
}

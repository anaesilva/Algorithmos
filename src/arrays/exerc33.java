package arrays;

import java.util.Scanner;

public class exerc33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];

        System.out.println("Insira os elementos do vetor A: ");
        for(int i=0; i<vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        boolean primo;
        String msg;

        for (int i=0; i<vetorA.length; i++){

            primo = true;
            for (int j=2; j<vetorA[i]; j++){
                if (vetorA[i] % j == 0){
                    primo = false;
                    break;
                }
            }

            msg = "";
            if (primo){
                msg = " primo";
            } else {
                msg = " não é primo";
            }

            System.out.println(vetorA[i] + msg);
        }
    }
}
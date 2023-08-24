package matrices;

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][] matriceNumbers = new int[3][3];

        System.out.println("Entre com os números da matriz 3x3: ");
        for (int i = 0; i < matriceNumbers.length; i++) {
            for (int j = 0; j < matriceNumbers[i].length; j++) {
               matriceNumbers[i][j] = sc.nextInt();
            }
        }

        int qdePares = 0;
        int qdeImpares = 0;

        for (int i = 0; i < matriceNumbers.length; i++) {
            for (int j = 0; j < matriceNumbers[i].length; j++) {
                if (matriceNumbers[i][j] % 2 == 0) {
                  qdePares++;
                } else {
                    qdeImpares++;
                }
            }
        }

        for (int i = 0; i < matriceNumbers.length; i++) {
            for (int j = 0; j < matriceNumbers[i].length; j++) {
                System.out.print(matriceNumbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Quantidade de pares: " + qdePares);
        System.out.println("Quantidade de impares: " + qdeImpares);

    sc.close();

    }
}

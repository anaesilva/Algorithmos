package matrices;

import java.util.Random;

public class exerc1 {
    public static void main(String[] args) {

        int [][] matriceRandomNumber = new int[4][4];

        Random randomNumber = new Random();

        for (int i = 0; i < matriceRandomNumber.length; i++) {
            for (int j = 0; j < matriceRandomNumber[i].length; j++) {
                matriceRandomNumber[i][j] = randomNumber.nextInt(100);
            }
        }

        int major = 0;
        int line = 0;
        int column = 0;

        for (int i = 0; i < matriceRandomNumber.length; i++) {
            for (int j = 0; j < matriceRandomNumber[i].length; j++) {
                if (matriceRandomNumber[i][j] > major) {
                    major = matriceRandomNumber[i][j];
                    line = i;
                    column = j;
                }
            }
        }

        for (int i = 0; i < matriceRandomNumber.length; i++) {
            for (int j = 0; j < matriceRandomNumber[i].length; j++) {
                System.out.print(matriceRandomNumber[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Value major in matrice: " + major);
        System.out.println("Line: " + line);
        System.out.println("Column: " + column);

    }
}

package matrices;

import java.util.Random;

public class exerc2 {
    public static void main(String[] args) {

        int [][] matriceRandomNumber = new int[10][10];

        Random randomNumber = new Random();

        for (int i = 0; i < matriceRandomNumber.length; i++) {
            for (int j = 0; j < matriceRandomNumber[i].length; j++) {
                matriceRandomNumber[i][j] = randomNumber.nextInt(100);
            }
        }

        int majorLine5 = 0;
        int minorLine5 = 0;

        for (int i = 0; i < matriceRandomNumber.length; i++) {
            for (int j = 0; j < matriceRandomNumber[5].length; j++) {
                if (matriceRandomNumber[5][j] > majorLine5) {
                   majorLine5 = matriceRandomNumber[5][j];
                }
                if (matriceRandomNumber[5][j] < minorLine5) {
                    minorLine5 = matriceRandomNumber[5][j];
                }
            }
        }

        for (int i = 0; i < matriceRandomNumber.length; i++) {
            for (int j = 0; j < matriceRandomNumber[i].length; j++) {
                System.out.print(matriceRandomNumber[i][j] + " ");
            }
            System.out.println();    
        }

        System.out.println("Major value in line 5: " + majorLine5);
        System.out.println("Minor value in line 5: " + minorLine5);

        int majorColum7 = 0;
        int minorColum7 = 0;

        for (int i = 0; i < matriceRandomNumber.length; i++) {
            for (int j = 0; j < matriceRandomNumber[5].length; j++) {
                if (matriceRandomNumber[i][7] > majorColum7) {
                    majorColum7 = matriceRandomNumber[i][7];
                }
                if (matriceRandomNumber[i][7] < minorColum7) {
                    minorColum7 = matriceRandomNumber[i][7];
                }
            }
        }

        for (int i = 0; i < matriceRandomNumber.length; i++) {
            for (int j = 0; j < matriceRandomNumber[i].length; j++) {
                System.out.print(matriceRandomNumber[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Major value in column 7: " + majorColum7);
        System.out.println("Minor value in column 7: " + minorColum7);
    }
}

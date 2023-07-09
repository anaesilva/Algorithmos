import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//        casas decimais conforme exemplos.

public class CalculoRaio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, R;
        double pi = 3.14159;

        System.out.println("Insira o valor do raio de um círculo: ");
        R = sc.nextDouble();

        A = pi * R * R;

        System.out.printf("A área deste círculo é de: %.4f%n", A);

        sc.close();
    }
}

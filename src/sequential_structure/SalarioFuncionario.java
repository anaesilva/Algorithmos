package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {

//    Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//    decimais.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;

        System.out.println("o número de um funcionário: ");
        numeroFuncionario = sc.nextInt();

        System.out.println("número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("o valor que recebe por hora: ");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("Numero = " + numeroFuncionario);
        System.out.printf("Salario = U$ %.2f%n", salario);

        sc.close();
    }
}

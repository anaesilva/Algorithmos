import java.util.Scanner;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//        mensagem explicativa, conforme exemplos.

public class SumIntegers {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int a, b, soma;

       System.out.println("Insira os dois números: ");
       a = sc.nextInt();
       b = sc.nextInt();

       soma = a + b;

       System.out.println("A soma dos dois números é igual a: " + soma);

        sc.close();
    }
}

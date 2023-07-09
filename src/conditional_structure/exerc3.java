package conditional_structure;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hI, hF, duracao;

        System.out.println("Digite a hora inicial: ");
        hI = sc.nextInt();

        System.out.println("Digite a hora final: ");
        hF = sc.nextInt();

        if (hI < hF) {
            duracao = hF - hI;
        } else {
            duracao = 24 - hI + hF;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}

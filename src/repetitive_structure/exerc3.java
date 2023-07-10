package repetitive_structure;

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
// Escreva
//        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
//        1.Álcool 2.Gasolina 3.Diesel 4.Fim.
//        Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//        que seja válido).
//        O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//        mensagem:
//        "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//        exemplo.

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qdeAlcool = 0;
        int qdeGasolina = 0;
        int qdeDiesel = 0;

        System.out.println("Digite o tipo de combustível abastecido: 1.Álcool 2.Gasolina 3.Diesel");
        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                qdeAlcool = qdeAlcool + 1;
            } else if (tipo == 2) {
                qdeGasolina = qdeGasolina + 1;
            } else if (tipo == 3) {
                qdeDiesel = qdeDiesel + 1;
            }
            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + qdeAlcool);
        System.out.println("Gasolina: " + qdeGasolina);
        System.out.println("Diesel: " + qdeDiesel);

        sc.close();

    }
}

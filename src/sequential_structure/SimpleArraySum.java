package sequential_structure;

import java.util.*;

//Deve retornar a soma dos elementos do array como um inteiro.

public class SimpleArraySum {
    public static int simpleArray(List<Integer> ar) {
        int soma =0;
        for(int i =0; i < ar.size(); i++){
            soma += ar.get(i);
        }

        return soma;
    }
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(10,2,30);

        int result = simpleArray(num);
        System.out.println(result);



    }
}
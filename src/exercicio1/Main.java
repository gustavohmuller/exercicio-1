/************************************************************************************************
 * Exercício 1.                                                                                 *
 * Objetivo: criar uma classe Java que recebe uma lista de valores, gera um número sequencial   *
 *           para cada valor (iniciando em 1) e devolve uma String com os sequencias inteiros   *
 *           concatenados a um texto e ao seu respectivo valor. Ao final, apresentar o total    *
 *           da soma dos valores.                                                               *
 * Programador: Gustavo Henrique Müller.                                                        *
 * Data da criação do programa: 17/02/2022.                                                     *
 * Data da última alteração: 17/02/2022.                                                        *
 ************************************************************************************************/

package exercicio1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Double> valueList = new ArrayList<>();

        valueList.addAll(Arrays.asList(88.00, 130.00, 54.90, 293.30, 44.80));
        
        Action a = new Action();   
        
        String text = "";
        
        text = a.Action(valueList);
        
        System.out.println(text);
    }
}

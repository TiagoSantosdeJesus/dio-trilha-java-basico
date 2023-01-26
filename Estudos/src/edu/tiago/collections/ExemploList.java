package edu.tiago.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // Crie uma lista e adicione 7 notas.
        List<Double> notas = new ArrayList<Double>();
        notas.add(8d);
        notas.add(7.5);
        notas.add(9d);
        notas.add(5.5);
        notas.add(6d);
        notas.add(9.5);
        notas.add(7d);
        System.out.println("Lista de notas: " + notas);

        // Imprima a posição da nota 5.5
        System.out.println("Posição da nota 5.5: " + notas.indexOf(5.5));

        // Adicione na lista a nota 10 na posição 4
        notas.add(4, 10d);
        System.out.println(notas);

        // Substitua a nota 8 por 5
        notas.set(notas.indexOf(8d), 5d);
        System.out.println(notas);

        // Verifique se a nota 4 está na lista
        System.out.println("A nota 4 faz parte da lista: " + notas.contains(4d));

        // Exiba a terceira nota adicionada
        System.out.println("Terceira nota adicionada: " + notas.get(2));

        // Exiba a menor nota
        System.out.println("Menor nota: " + Collections.min(notas));

        // Exiba a maior nota
        System.out.println("Maior nota: " + Collections.max(notas));

        // Exiba a soma das de todas notas
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma das notas: " + soma);

        // Exiba a média das notas
        System.out.println("Média das notas: " + (soma / notas.size()));

        // Remova a nota 9.5 e remova o primeiro indice
        notas.remove(9.5d);
        notas.remove(0);
        System.out.println(notas);

        // Remova as notas maiores que 7
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            double next = iterator1.next();
            if (next > 7)
                iterator1.remove();
        }
        System.out.println(notas);

        // Apague toda lista
        notas.clear();
        System.out.println(notas);
    }

}
